#!/usr/bin/env bash

RUN_COMMAND="nohup java -jar ${application_path} >> /home/ec2-user/app/nohup.out 2>&1&"

echo "  > ${RUN_COMMAND}"
${RUN_COMMAND}