Dim $imgsrc = ""
Dim $s = ""
Dim $title1 = "File Upload"
Dim $title2 = "文件上传"
For $i=1 To $CmdLine[0]
    $imgsrc = $imgsrc & $s & '"' & $CmdLine[$i] & '"'
	$s = " "
 Next 
 
 If Not (WinWaitActive($title1, "", 10) Or WinWaitActive($title2, "", 10)) Then
    Exit(0)
 Else
	If WinExists($title1) Then
        ControlSetText($title1,"","[CLASS:Edit; INSTANCE:1]",$imgsrc)
    ElseIf WinExists($title2) Then
        ControlSetText($title2,"","[CLASS:Edit; INSTANCE:1]",$imgsrc)
    EndIf
	Sleep(1*1000)
	Send("{ENTER}")
	Sleep(1*1000)
 EndIf
 
Exit(0)


