# Shell编程
## bash的环境配置文件
1. /etc/profile：这是系统整体的设定，你最好不要修改这个文件； 
2. ~/.bash_profile 或 ~/.bash_login 或 ~/.profile：属于使用者个人设定，你要改自己的数据，就写入这里！
## 良好的script编写习惯
在每个script的文件头处记录好：
1. script 的功能
2. script 的版本信息
3. script 的作者与联络方式
4. script 的版权宣告方式
5. script 的 History (历史纪录)
6. script 内较特殊的指令，使用『绝对路径』的方式来下达
7. script 运作时需要的环境变量预先说明与设定
8. 在较为特殊的程序代码部分加上注释
9. 使用代码缩进