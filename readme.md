Gerar os arquivos necessários para buildar nativamente

java -agentlib:native-image-agent=config-output-dir=./config -jar .\target\springboot-poc-0.0.1-SNAPSHOT.jar
java -agentlib:native-image-agent=config-output-dir=.\src\main\resources\config -jar .\target\springboot-poc-0.0.1-SNAPSHOT.jar
ATENÇÃO: A aplicação vai rodar, execute o fluxo que deseja que seja executado.

.\keytool.exe -import -keystore D:\Apps\graalvm-ce-java19-22.3.1\lib\security\cacerts -alias kamehouse-bundle -trustcacerts -file D:\workspace\kamehouse\certificate-ssl\2023-06\ca_bundle.crt
keytool -import -keystore /usr/lib/jvm/java-19-openjdk-amd64/lib/security/cacerts -alias kamehouse-bundle -trustcacerts -file certificate.crt
keytool -import -keystore $GRAALVM_HOME/lib/security/cacerts -alias kamehouse-bundle -trustcacerts -file ./cert/certificate.crt --noprompt

/usr/lib/jvm/java-19-openjdk-amd64