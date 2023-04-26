#!/bin/bash

for i in {1..10}
do
  datestr=$(date +%Y.%m.%d)
  filename="${i}_${datestr}"
  touch $filename
done
