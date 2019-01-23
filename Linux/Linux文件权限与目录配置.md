# Linux文件权限与目录配置
## 如何改变文件属性与权限
### chgrp：改变文件所属群组
### chown：改变文件拥有者
### chmod：改变文件的权限, SUID, SGID, SBIT 等等的特性
文件的权限字符为：『-rwxrwxrwx』，我们可以使用数字来代表各个权限，
各权限的分数对照表如下：
r:4
w:2
x:1
chmod 755 文件名
chmod u=rwx,g=rx,o=rx 文件名