Dim $imgsrc = ""
Dim $s = ""
Dim $title1 = "File Upload"
Dim $title2 = "文件上传"
For $i=1 To $CmdLine[0]
    $imgsrc = $imgsrc & $s & '"' & $CmdLine[$i] & '"'
	$s = " "
 Next

For $i = 10 to 1 Step -1
   if WinExists($title1) Or WinExists($title2) Then
	 If WinExists($title1) Then
        ControlSetText($title1,"","[CLASS:Edit; INSTANCE:1]",$imgsrc)
     ElseIf WinExists($title2) Then
        ControlSetText($title2,"","[CLASS:Edit; INSTANCE:1]",$imgsrc)
     EndIf
	 Sleep(2*1000)
	 If WinExists($title1) Then
	   ControlClick($title1, "","Button1");
     ElseIf WinExists($title2) Then
	   ControlClick($title2, "","Button1");
	 EndIf
	 Sleep(2*1000)
	 ExitLoop
   EndIf
	Sleep($i*1000)

Next
Exit(0)