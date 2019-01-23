# Linux常用命令
exit 注销
date 显示日期与时间
cal 列出日历
bc 简单好用的计算器（使用quit退出）
man+命令 查看在线帮助
who 查看在线用户
netstat -a 查看网络状态
ps -aux 查看后台进程
sync 数据同步写入磁盘
shutdown 关机
reboot 重新启动
su 切换到root用户
systemctl 服务管理工具
cd 变换目录
pwd 显示当前目录
mkdir 建立一个新的目录
rmdir 删除一个空的目录
cp 复制
rm 删除
mv 移动
ifconfig 查看网络信息
## 文件内容查阅
cat 由第一行开始显示文件内容
tac 从最后一行开始显示，可以看出 tac 是 cat 的倒着写！
nl 显示的时候，顺道输出行号！
more 一页一页的显示文件内容
less 与 more 类似，但是比 more 更好的是，他可以往前翻页！
head 只看头几行
tail 只看尾巴几行
od 以二进制的方式读取文件内容！
touch 修改文件时间或新建文件
umask 指定目前用户在建立文件或目录时候的权限默认值
file 观察文件类型
## 脚本文件查找
which 寻找可执行文件
## 文件名查找
whereis 由一些特定的目录中寻找文件文件名
locate 直接在后面输入『文件的部分名称』后，就能够得到结果
find