#!/bin/bash

cd /home/hjh/git/leona-api
sudo docker-compose down
sudo docker-compose build
sudo docker image prune -f
sudo docker-compose up -d
