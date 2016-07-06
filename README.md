

测试流程

1.正常运行demo

2.HelloHack类的showHello方法返回值修改下rocoofix---rocoofix_change(即代表着需要修改的补丁位置)

3.将build.gradle文件夹下的versionCode 1 改成versionCode 2;preVersionPath = '1'注释取消

4.再次运行demo,发现app源码目录/rocooFix/version1/debug的目录下会有patch.jar

5.将第2步做的修改改回来，运行，会发现结果还是rocoofix_change
