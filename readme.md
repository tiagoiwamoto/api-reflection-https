Gerar os arquivos necessários para buildar nativamente

java -agentlib:native-image-agent=config-output-dir=./config -jar .\target\springboot-poc-0.0.1-SNAPSHOT.jar
java -agentlib:native-image-agent=config-output-dir=.\src\main\resources\config -jar .\target\springboot-poc-0.0.1-SNAPSHOT.jar

.\keytool.exe -import -keystore D:\Apps\graalvm-ce-java19-22.3.1\lib\security\cacerts -alias kamehouse-bundle -trustcacerts -file D:\workspace\kamehouse\certificate-ssl\2023-06\ca_bundle.crt
keytool -import -keystore /usr/lib/jvm/java-19-openjdk-amd64/lib/security/cacerts -alias kamehouse-bundle -trustcacerts -file certificate.crt

/usr/lib/jvm/java-19-openjdk-amd64