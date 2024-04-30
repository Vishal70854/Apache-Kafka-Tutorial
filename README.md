Apache Kafka run on windows

Steps:
1. Start Zookeeper(open cmd go to kafka folder under bin under windows i.e kafka/bin/windows) and type:
zookeeper-server-start.bat ..\..\config\zookeeper.properties

2. Start Kafka server(open cmd go to kafka folder under bin under windows i.e kafka/bin/windows) and type:
.\kafka-server-start.bat ..\..\config\server.properties

3. Create new topics with kafka-topics
.\kafka-topics.bat --create --topic user-topic --bootstrap-server localhost:9092

( we have to create topics using kafka-topics.bat file followed by --create --topic for creating a topic and followed by topic name..
here user-topic is the name of the topic we have created for storing user related messages and boostrap server is running on port 9092.)


4. Produce example message with kafka-console-producer
.\kafka-console-producer.bat --topic user-topic --bootstrap-server localhost:9092

(after writing the above line in cmd (under bin/windows) we can write messages from kafka-console-producer and that message will be consumed by kafka-console-consumer.


5. Consume the message with kafka-console-consumer
 .\kafka-console-consumer.bat --topic user-topic --from-beginning --bootstrap-server localhost:9092

as you can see we have used kafka-console-consumer to consume messages from kafka-console-producer.
we will mention kafka-console-consumer followed by --topic and our topic name which we want to consume. After that we have to mention whether we want to read messages from beginning or from some point (mention like --beginning to read messages of kafka producer from beginning) and then followed by --bootstrap-server localhost:9092(here 9092 is our default port for kafka. we can change it as per our convenience)

Note: we can create as many consumers as per our requirement.



