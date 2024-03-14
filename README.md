## IO.NET 节点部署
```bash
# 查看显卡信息
nvidia-smi
# 建立工作目录
sudo mkdir /work && cd /work
#sudo apt install curl
# 准备显卡驱动和docker
sudo curl -L https://github.com/ionet-official/io-net-official-setup-script/raw/main/ionet-setup.sh -o ionet-setup.sh
sudo chmod +x ionet-setup.sh && ./ionet-setup.sh
# 运行计算容器
sudo curl -L https://github.com/ionet-official/io_launch_binaries/raw/main/launch_binary_linux -o launch_binary_linux
sudo chmod +x launch_binary_linux
# 最后一步 运行最后一个代码,注意最前面加上 "sudo "
# sudo ./launch_binary_linux --device_id=10a3f044-cb5c-43a5-bac3-658b2610acea --user_id=d4561860-ca5e-4817-912e-79fa4dfae0b1 --operating_system="Linux" --usegpus=true --device_name=lalala
```
