#include <FileConstants.au3>
;Dim $fileurl='test.txt'
Dim $i=''

If WinExists("[CLASS:MozillaDialogClass]") Then
 $i = WinGetTitle("[CLASS:MozillaDialogClass]")
 ClipPut ($i)
 Sleep(1*1000)
 WinClose("[CLASS:MozillaDialogClass]")
EndIf
Exit(0)
