#!/usr/bin/env bash

ABSPATH=$(readlink -f $0)
ABSDIR=$(dirname $ABSPATH)
source ${ABSDIR}/profile.sh

idle_port=$(find_idle_port)

echo "> $idle_port 에서 구동중인 애플리케이션 pid 확인"
idle_pid=$(lsof -ti tcp:${idle_port})

if [ -z ${idle_pid} ]
then
  echo "> 현재 구동중인 애플리케이션이 없으므로 종료하지 않습니다."
else
  echo "> kill -15 $idle_pid"
  kill -15 ${idle_pid}
  sleep 5
fi