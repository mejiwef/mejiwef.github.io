# Linux常用软件安装
## JDK8安装与配置
### 检查系统原版并卸载
输入如下命令查看是否系统中是否已安装了jdk
```bash
java -version
```
输入如下命令，查看openjdk的相关安装包
```bash
rpm -qa | grep java
```
输入如下命令依次下载即可
```bash
rpm -e --nodeps 安装包名称
```
*注意：jdk卸载完成后，需要把环境变量删除（全局的环境变量文件为/etc/profile，用户环境变量文件为该用户主题目录下的bashrc文件中）*
### 下载JDK的rpm安装包（[官方网站](https://www.oracle.com/technetwork/java/javase/downloads/index.html)）并上传
使用如下命令授权，如果文件已经有了执行权限，此步骤可省略
```bash
chmod 755 安装包的文件名
```
### 安装JDK
```bash
rpm -ivh 安装包的文件名
```
*JDK安装成功后，默认存放在/usr/java文件目录中*
### 配置环境变量
编辑文件/etc/profile
在文件尾部添加如下内容，保存退出
```bash
export JAVA_HOME=/usr/java/jdk1.7.0_71 #实际目录
export PATH=$JAVA_HOME/bin:$PATH
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tool.jar
```
输入如下命令，使用环境变量立即生效
```bash
source /etc/profile
```