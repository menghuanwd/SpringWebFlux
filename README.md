# Demo

**gradle构建SpringWebflux+R2DBC+MySQL的RestfulAPI(增删改查)**

## Usage

### run mysql on server by docker
```shell
docker run -d -p 3367:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=true mysql:5.7
exec init.sql 
```

### Package Jar
```shell
  ./gradlew build
  
  生成在项目 build/libs/demo-1.0.1.jar 
```

### Build image

```shell
docker build . -t demo
```

### Run image

```shell
docker run --name demo --rm -p 5002:5002 demo
```

## Test by Curl

### CREATE
```shell
curl --header "Content-Type: application/json" \
--request POST \
--data '{"title":"title","author":"dave","content": "china news"}' \
http://127.0.0.1:5002/articles
```

### Index
```shell

curl http://127.0.0.1:5002/articles
```

### Show
```shell

curl http://127.0.0.1:5002/articles/3
```

### Update
```shell
curl --header "Content-Type: application/json" \
--request PUT \
--data '{"title":"new title","author":"new author","content": "china news"}' \
http://127.0.0.1:5002/articles/3
```

### Delete
```shell
curl -X DELETE --header "Content-Type: application/json" \
http://127.0.0.1:5002/articles/2
```
