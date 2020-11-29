# JsonRPCDemo
SpringBoot based JsonRPC demo


Demo consists of Server and Client

## Build and run
In Server or Client directory
```yaml

mvn clean install

java -jar target/Server-1.0-SNAPSHOT.jar
java -jar target/Client-1.0-SNAPSHOT.jar

```

To check client via curl

```yaml

curl -H "Content-Type:application/json" -d '{"id":"1","jsonrpc":"2.0","method":"hello","params":{"name":"Alex"}}' http://localhost:8024/demoService
curl -H "Content-Type:application/json" -d '{"id":"1","jsonrpc":"2.0","method":"getDate"}' http://localhost:8024/demoService
```
