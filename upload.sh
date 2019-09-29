#!/bin/bash
FILES="./json/*.json"
echo "Loading files"
for f in $FILES
do
  curl -d "@$f" -H "Content-Type: application/json" -X POST http://localhost:8080/api/matches
done
echo "done"

