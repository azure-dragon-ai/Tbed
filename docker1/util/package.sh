#!/bin/bash

# 请注意
# 本脚本的作用是把本项目编译的结果保存到deploy文件夹中
# 1. 把项目数据库文件拷贝到docker/db/init-sql
# 2. 编译leona-admin
# 3. 编译leona-all模块，然后拷贝到docker/leona

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"
cd $DIR/../..
leona_HOME=$PWD
echo "leona_HOME $leona_HOME"

# 复制数据库
# cat $leona_HOME/leona-db/sql/leona_schema.sql > $leona_HOME/docker/db/init-sql/leona.sql
# cat $leona_HOME/leona-db/sql/leona_table.sql >> $leona_HOME/docker/db/init-sql/leona.sql
# cat $leona_HOME/leona-db/sql/leona_data.sql >> $leona_HOME/docker/db/init-sql/leona.sql
# cat $leona_HOME/leona-db/sql/leona_chinatower.sql >> $leona_HOME/docker/db/init-sql/leona.sql

cd $leona_HOME/leona-admin
# 安装阿里node镜像工具
npm install -g cnpm --registry=https://registry.npm.taobao.org
# 安装node项目依赖环境
cnpm install
cnpm run build:dep

cd $leona_HOME
mvn clean package
cp -f $leona_HOME/leona-all/target/leona-all-*-exec.jar $leona_HOME/docker/leona/leona.jar