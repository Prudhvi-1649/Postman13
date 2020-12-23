set path123=C:\Users\MKS REDDY\workspace\Nav_bar_handle
cd %path123%
set classpath=%path123%\bin;%path123%\libs\*
java org.testng.TestNG %path123%\testng.xml

pause