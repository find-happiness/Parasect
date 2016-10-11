copy ..\parasect\build\libs\parasect.jar parasect.jar /y
rd gen-java /s /q
rd ..\app\src\main\java\com\foo\ /s /q
thrift -gen java test.thrift
java -jar parasect.jar test.thrift
move gen-java\com\foo ..\app\src\main\java\com\foo
rd gen-java /s /q
pause