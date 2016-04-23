copy ..\parasect\build\libs\parasect.jar parasect.jar /y
rd gen-java /s /q
rd ..\app\src\main\java\com\foo\ /s /q
thrift -gen java example.thrift
java -jar parasect.jar example.thrift
move gen-java\com\foo ..\app\src\main\java\com\foo
rd gen-java /s /q
pause