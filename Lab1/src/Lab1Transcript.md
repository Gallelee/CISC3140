**********************
Windows PowerShell transcript start
Start time: 20220926151009
Username: DESKTOP-5M95E0C\thimo
RunAs User: DESKTOP-5M95E0C\thimo
Configuration Name: 
Machine: DESKTOP-5M95E0C (Microsoft Windows NT 10.0.19044.0)
Host Application: C:\WINDOWS\System32\WindowsPowerShell\v1.0\powershell.exe
Process ID: 9184
PSVersion: 5.1.19041.1682
PSEdition: Desktop
PSCompatibleVersions: 1.0, 2.0, 3.0, 4.0, 5.0, 5.1.19041.1682
BuildVersion: 10.0.19041.1682
CLRVersion: 4.0.30319.42000
WSManStackVersion: 3.0
PSRemotingProtocolVersion: 2.3
SerializationVersion: 1.1.0.1
**********************
Transcript started, output file is C:\Users\thimo\Lab1Transcript.txt
PS C:\Users\thimo> mkdir "Lab1Task3-4"


    Directory: C:\Users\thimo


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----         9/26/2022   3:10 PM                Lab1Task3-4


PS C:\Users\thimo> cd Lab1Task3-4
PS C:\Users\thimo\Lab1Task3-4> ls
PS C:\Users\thimo\Lab1Task3-4> Copy-Item "C:\Users\thimo\CISC3140\Lab1\src\DueDateCounter.java" "C:\Users\thimo\Lab1Task3-4"
PS C:\Users\thimo\Lab1Task3-4> ls


    Directory: C:\Users\thimo\Lab1Task3-4


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a----         9/26/2022   2:23 PM            927 DueDateCounter.java


PS C:\Users\thimo\Lab1Task3-4> javac DueDateCounter.java

PS C:\Users\thimo\Lab1Task3-4> java DueDateCounter |Out-Host
There are 1 day(s) until lab 1 is due
There are 30 day(s) until lab 2 is due
There are 58 day(s) until lab 3 is due
There are 72 day(s) until lab 4 is due
PS C:\Users\thimo\Lab1Task3-4> Stop-Transcript
**********************
Windows PowerShell transcript end
End time: 20220926151122
**********************
