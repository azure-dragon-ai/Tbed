#!/bin/bash

# 请注意
# 本脚本的作用是把本项目编译的结果保存到deploy文件夹中
# 1. 把项目数据库文件拷贝到docker/db/init-sql
# 2. 编译leona-admin
# 3. 编译leona-all模块，然后拷贝到docker/leona

leona_HOME=/home/hjh/git/leona-api
echo "leona_HOME $leona_HOME"
cd $leona_HOME

git pull
# sudo -u hjh git pull

cd $leona_HOME
mvn clean package
cp -f $leona_HOME/target/leona-api.jar $leona_HOME/docker/leona/leona.jar
cp -f $leona_HOME/target/leona-api.jar $leona_HOME/docker/leona-fe/leona.jar
cp -f $leona_HOME/docker/leona/Dockerfile $leona_HOME/docker/leona-fe/Dockerfile
cp -f $leona_HOME/docker/leona/application.yml $leona_HOME/docker/leona-fe/application.yml

cd $leona_HOME/docker

tag=`date +%Y%m%d`
echo $tag
sudo docker build -t yiluxiangbei/leona:v$tag -f leona-fe/Dockerfile leona-fe
# sudo docker push yiluxiangbei/leona:v$tag
sudo docker tag yiluxiangbei/leona:v$tag registry.cn-beijing.aliyuncs.com/luomor/leona:v$tag
sudo docker push registry.cn-beijing.aliyuncs.com/luomor/leona:v$tag
