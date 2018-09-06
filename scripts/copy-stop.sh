#!/usr/bin/env bash

echo "  > Jar 복사를 시작합니다."
echo "  > Jar를 보관할 디렉토리를 생성합니다. 있으면 생성하지 않습니다."
jar_dir_path=/home/ec2-user/jar/
mkdir -p ${jar_dir_path}

deploy_path=$(ls /home/ec2-user/deploy/*.jar)
build_file_path=$(basename ${deploy_path})
echo "  > build 파일명: $build_file_path"

echo "  > build 파일 복사"
cp ${build_file_path} ${jar_dir_path}

