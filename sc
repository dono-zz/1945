<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features)
}
//-->
</script>
<style type="text/css">
<!--
.single{
   border: 1px solid #1f4f16;
   padding: 5px;
}
.abunai {
   color: red;
   text-decoration: none;
   }
.xxx {
   color: blue;
   text-decoration: none;
   }

.me  {
   border: 0px;
   padding: 5px;
}
.isi:disabled{
   padding: 2px;
   border:1px solid #333333;
   background-color: #ccc;
   font-size: 10px;
   font-weight: bold;
}
.isi{
   padding: 2px;
   border:1px solid #666666;
   background-color: #fff;
   font-size: 10px;
   font-weight: bold;
}
-->
</style>



<?php

if(isset($_POST['Submit'])){
   $ceks = array('base64_decode','system','passthru','popen','exec','shell_exec','eval','move_uploaded_file','tmp_name','file_get_contents');
   foreach($ceks as $ceker){
      if($_POST[$ceker]<>""){
         $six.=$_POST[$ceker].".";
      }
   }
$cek = explode('.', $six);

   ?>
   <center>
   <table border="0" width="100%" cellpadding="5">
      <tr>
         <td class="me" align="right" width="30"><b>No</b></td>
         <td class="me" align="center" width="105"><b> T y p e </b></td>
         <td class="me" align="center"><b> F i l e&nbsp;&nbsp;L o c a t i o n </b></td>
         <td class="me" align="center" width="150"><b> L a s t&nbsp;&nbsp;E d i t </b></td>
         <td class="me" align="right" width="100"><b>F i l e&nbsp;&nbsp;S i z e</b></td>
      </tr><br>
<?php
	
	$target = $_POST['target'];
   foreach (ListFiles($target) as $key=>$file){

   	$dir9 = dirname($file); 
   	$file9 = basename($file);
      $nFile = substr($file, -4, 4);
      if($nFile == ".php" | $nFile == ".PHP" |$nFile == ".Php" |$nFile == ".PHp"|$nFile == ".pHp"|$nFile == ".pHP"|$nFile == ".phP"|$nFile == ".PhP"){
         if($file==$_SERVER['DOCUMENT_ROOT'].$_SERVER['PHP_SELF']){
         }else{
            $ops = @file_get_contents($file);
            $op=strtolower($ops);
            $arr = array('c99_buff_prepare' => 'c 9 9',
                     'Solevisible' => 'Solevisible',
                     'Alfa-Team' => 'Alfa',
                     'Minishell' => 'Minishell',
                     'WSOstripslashes' => 'WSO',
                     'Cyto' => 'Encr Shell',
                     'pwd163' => 'Panen138',
                     'Zeerx7' => 'Zeerx7',
                     'edoced_46esab' => 'b64',
                     'con7ext' => 'con7ext',
                     'phpFileManager' => 'phpFileManager',
                     'Fileman' => 'Fileman',
                     'MARIJUANA' => 'Marijuana',
                     'Mini' => 'Mini Shell',
                     '68746d6c7370656369616c6368617273' => 'Gelay',
                     'AGUSTUS_17_1945' => '1945',
                     'ruzhu' => 'Chinese 1',
                     'pastebin' => 'Pastebin',
                     'xiaoxiannv' => 'Chinese 2',
                     'bit.ly' => 'bit.ly',
                     'abcr57' => 'r 5 7');

            $sis=0;
            if($op)
            $size=filesize($file);
            $last_modified = filemtime($file);
            $last=date("M-d-Y H:i", $last_modified);
            foreach($arr as $key => $val) {
               if(@preg_match("/$key/", $op)) {
                  $sis=1;
                  $i++;
                  ?>
                  <tr style ="background-color: #e62020;" onmouseover="mover(this)"  onmouseout="mout(this)">
                     <td align="right"><font color="red"><blink><?=$i?></blink></font></td>
                     <td align="center"><font color="red"><blink><?=$val?></blink></font></td>
                     <td align="left"><blink>
                     	
                     <a href="?d=<?php echo hex($dir9);?>&e=<?php echo hex($file9);?>" target="_blank"><?=$file?></a> [Hapus] [Disabled] [Replaced] 
                     </blink></td>
                     <td align="center"><font color="red"><blink><?=$last?></blink></font></td>
                     <td align="right"><font color="red"><blink><?=$size?> byte</blink></font></td>
                     <script language="javascript">
                        var bgcolor = "transparent";
                        var change_color = "#ffe599"
                        function mover(aa) {
                           aa.style.backgroundColor = change_color;
                        }
                        function mout(aa) {
                           aa.style.backgroundColor = bgcolor;
                        }
                     </script>
                  </tr>
                  <?php
               }
            }
            if($sis<>"1"){
               if((@preg_match("/system\((.*?)\)/", $op))&&(@preg_match("/<pre>/", $op))&&(@preg_match("/empty\((.*?)\)/", $op))) {
                  $sis="2";
                  $i++;
                  $val="hidden shell";
                  ?>
                  <tr style ="background-color: #bfc0ee" onmouseover="mover(this)"  onmouseout="mout(this)">
                     <td align="right"><font color="blue"><?=$i?></font></td>
                     <td align="center"><font color="blue"><?=$val?></font></td>
                     <td align="left">
                     <a href="?d=<?php echo hex($dir9);?>&e=<?php echo hex($file9);?>" target="_blank"><?=$file?></a> [Hapus] [Disabled] [Replaced] 
                     </td>
                     <td align="center"><font color="blue"><?=$last?></font></td>
                     <td align="right"><font color="blue"><?=$size?> byte</font></td>
                     <script language="javascript">
                        var bgcolor = "transparent";
                        var change_color = "#ffe599"
                        function mover(aa) {
                           aa.style.backgroundColor = change_color;
                        }
                        function mout(aa) {
                           aa.style.backgroundColor = bgcolor;
                        }
                     </script>
                  </tr>
                  <?php
               }
            }
            if($sis=="0"){
            foreach($cek as $bugs) {
                if ($bugs<>""){
               if(@preg_match("/$bugs\((.*?)\)/", $op)) {
                  $i++;
                  ?>
                  <tr style ="background-color: #f4e6e7" onmouseover="mover(this)"  onmouseout="mout(this)">
                     <td align="right"><?=$i?></td>
                     <td align="center"><?=$bugs?></td>
                     <td align="left">
                     <a href="?d=<?php echo hex($dir9);?>&e=<?php echo hex($file9);?>" target="_blank"><?=$file?></a> [Hapus] [Disabled] [Replaced] 
                     </td>
                     <td align="center"><?=$last?></td>
                     <td align="right"><?=$size?> byte</td>
                     <script language="javascript">
                        var bgcolor = "transparent";
                        var change_color = "#ffe599"
                        function mover(aa) {
                           aa.style.backgroundColor = change_color;
                        }
                        function mout(aa) {
                           aa.style.backgroundColor = bgcolor;
                        }
                     </script>
                  </tr>
                  <?php
               }               
            }
            }
            }
            if($_POST['textV']<>""){
               $text=$_POST['textV'];
                  if(@preg_match("/$text/", $op)) {
                  $i++;
                  ?>
                  <tr style ="background-color: #f0e68c;" onmouseover="mover(this)"  onmouseout="mout(this)">
                     <td align="right"><?=$i?></td>
                     <td align="center"><?=$text?></td>
                     <td align="left">
                     <a href="?d=<?php echo hex($dir9);?>&e=<?php echo hex($file9);?>" target="_blank"><?=$file?></a> [Hapus] [Disabled] [Replaced] 
                     </td>
                     <td align="center"><?=$last?></td>
                     <td align="right"><?=$size?> byte</td>
                     <script language="javascript">
                        var bgcolor = "transparent";
                        var change_color = "#ffe599"
                        function mover(aa) {
                           aa.style.backgroundColor = change_color;
                        }
                        function mout(aa) {
                           aa.style.backgroundColor = bgcolor;
                        }
                     </script>
                  </tr>
                  <?php
               }
            
            
            }
         }
      }
   }
   if($i==0){
      foreach($cek as $bugs) {
         if ($bugs<>""){
            $x++;
   ?>
      <tr style ="background-color: #007eff;" onmouseover="mover(this)"  onmouseout="mout(this)">
         <td align="right"><?=$x?></td>
         <td align="center"><?=$bugs?></td>
         <td align="center"> not exist </td>
         <td align="center"> no record </td>
         <td align="right"> -&nbsp;&nbsp;&nbsp;&nbsp;byte </td>
      </tr>
   <?php
         }
      }
   }
   ?>
   </table>
   <?php
}else{
   $find = array('others_backdoor','base64_decode','system','passthru','popen','exec','shell_exec','eval','move_uploaded_file','tmp_name','file_get_contents');
   $target=$_SERVER['DOCUMENT_ROOT'];
?>

   <form id="fCheck" name="fCheck" method="post" action="" autocomplete="off">
   <center>
   <table class="single" width="400" border="1" cellpadding="10">
   <tr><td class="me"><center>
      <b>S e l e c t &nbsp;&nbsp;s c a n&nbsp;&nbsp;t y p e :</b><br>
      <table class="me" width="200">
         <tr><td class="me">
            <script language="javascript">
               function cekKlik(){   
                  if (!document.fCheck.cekV.checked)
                     document.fCheck.textV.disabled=true;   
                  else 
                     document.fCheck.textV.disabled=false;
                  if(document.fCheck.cekV.checked){
                     master = master + 1;
                  }else{
                     if(master > 0 ){
                        master = master - 1;
                     }else{
                        master = master;
                     }
                  }
                  if(master != 0){
                     document.fCheck.Submit.disabled=false;
                  }else{
                     document.fCheck.Submit.disabled=true;
                  }         
               }     
            </script>  
            <?php
            //dari sini
            foreach($find as $bug) {
            ?>

            <script language="javascript">
               var master = 0;
               function checkValue<?=$bug?>(){
                  if(document.fCheck.<?=$bug?>.checked){
                     master = master + 1;
                  }else{
                     if(master > 0 ){
                        master = master - 1;
                     }else{
                        master = master;
                     }
                  }
                  if(master != 0){
                     document.fCheck.Submit.disabled=false;
                  }else{
                     document.fCheck.Submit.disabled=true;
                  }   
               }
            </script>
            <input onclick="checkValue<?=$bug?>();" name="<?=$bug?>" type="checkbox" id="<?=$bug?>" value="<?=$bug?>" />&nbsp;<?=$bug?><br>
            <?php
            }
            ?>
            <input name="cekV" type="checkbox" onClick="cekKlik();" id="cekV" value="cekV">
            <input class="isi" disabled="disabled" name="textV" value="other key word" onFocus="this.select()" type="text" id="textV">
            <br><br>
            <br>

					<center>
					Folder scan (no / at the end) :<br>
						<input class="form-control" type="text" name="target" value="<?php echo $target; ?>" style="width: 450px;" height="10"><br>
					</center>	
	
            <br><br>
            <input type="hidden" name="asal" value="abcd">
            <input disabled="disabled" type="submit" name="Submit" value=" S t a r t&nbsp;&nbsp;S c a n " />
         </td></tr>
      </table>
   </td></tr></table>
   </form>
<?php } ?>
