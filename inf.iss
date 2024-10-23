; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

#define MyAppName "PhoneBook"
#define MyAppVersion "1.2"
#define MyAppPublisher "XDV CORPORATION"
#define MyAppURL "https://grupoxdv.com/"
#define MyAppExeName "PhoneBoook.exe"

[Setup]
; NOTE: The value of AppId uniquely identifies this application. Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{FDB1C7C4-1856-4954-93EE-538FA73B26D7}
AppName={#MyAppName}
AppVersion={#MyAppVersion}
;AppVerName={#MyAppName} {#MyAppVersion}
AppPublisher={#MyAppPublisher}
AppPublisherURL={#MyAppURL}
AppSupportURL={#MyAppURL}
AppUpdatesURL={#MyAppURL}
DefaultDirName={autopf}\{#MyAppName}
DisableProgramGroupPage=yes
InfoBeforeFile=C:\Users\JEscalona\Documents\NetBeansProjects\PhoneBook\License.txt
; Uncomment the following line to run in non administrative install mode (install for current user only.)
;PrivilegesRequired=lowest
OutputDir=C:\Users\JEscalona\Documents\NetBeansProjects\Version1.2
OutputBaseFilename=Installer1.2
Compression=lzma
SolidCompression=yes
WizardStyle=modern

[Languages]
Name: "english"; MessagesFile: "compiler:Default.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked

[Files]
Source: "C:\Users\JEscalona\Documents\NetBeansProjects\Version1.2\{#MyAppExeName}"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\JEscalona\Downloads\Execute\jdk-23_windows-x64_bin.exe"; DestDir: "{tmp}"; Flags: deleteafterinstall
Source: "C:\Users\JEscalona\Downloads\Execute\jre-8u421-windows-x64.exe"; DestDir: "{tmp}"; Flags: deleteafterinstall
Source: "C:\Users\JEscalona\Documents\NetBeansProjects\PhoneBook\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: "{autoprograms}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"
Name: "{autodesktop}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"; Tasks: desktopicon

[Run]
Filename: "{tmp}\jdk-23_windows-x64_bin.exe"; Parameters: "/s"
Filename: "{tmp}\jre-8u421-windows-x64.exe"; Parameters: "/s"
Filename: "{app}\{#MyAppExeName}"; Description: "{cm:LaunchProgram,{#StringChange(MyAppName, '&', '&&')}}"; Flags: nowait postinstall skipifsilent
