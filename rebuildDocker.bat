call docker build -t summerhouse -f development/server/Dockerfile .

echo Delete old container...
call docker rm -f summerhouse-instance

echo Run new container...
call docker run -d -p 8883:9080 --name summerhouse-instance summerhouse