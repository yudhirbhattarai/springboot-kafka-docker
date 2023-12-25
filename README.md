# springboot-kafka-docker
Sample application with springboot producer and consumer, kafka container and swagger
Docker compose file included in the project.
Comands to execute:
1) docker-compose up -d
2) docker exec -it container_id /bin/sh (replace container id with the kafka container id)
3) /opt/kafka/bin/kafka-topics.sh --create --topic test --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1( this creates test topic)


you can start the springboot app which has producers and consumers. rest endpoint is used to send message from swagger ui to the kafka broker.

