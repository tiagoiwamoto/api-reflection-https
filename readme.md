Gerar os arquivos necessários para buildar nativamente

java -agentlib:native-image-agent=config-output-dir=./config -jar .\target\springboot-poc-0.0.1-SNAPSHOT.jar
java -agentlib:native-image-agent=config-output-dir=.\src\main\resources\config -jar .\target\springboot-poc-0.0.1-SNAPSHOT.jar