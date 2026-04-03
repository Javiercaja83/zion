# Variables
$MavenVersion = "3.9.4"
$DownloadUrl = "https://dlcdn.apache.org/maven/maven-3/$MavenVersion/binaries/apache-maven-$MavenVersion-bin.zip"
$InstallDir = "C:\apache-maven-$MavenVersion"

# Descargar Maven
$ZipPath = "$env:TEMP\apache-maven-$MavenVersion.zip"
Invoke-WebRequest -Uri $DownloadUrl -OutFile $ZipPath

# Descomprimir
Expand-Archive -Path $ZipPath -DestinationPath "C:\"

# Agregar Maven al PATH del usuario
$UserPath = [Environment]::GetEnvironmentVariable("Path", "User")
if (-not ($UserPath -like "*$InstallDir\bin*")) {
    [Environment]::SetEnvironmentVariable("Path", "$UserPath;$InstallDir\bin", "User")
}

# Limpiar zip
Remove-Item $ZipPath

Write-Host "¡Maven $MavenVersion instalado! Cierra y abre PowerShell nuevo y prueba 'mvn -v'"
