# Web_Application_SpringBoot_sqlite

## Init

### Database

``` bash 
cd src/main/resources/db
sqlite3 database.db
```

``` sqlite
.read sql/create_username.sql

.mode csv
.import csv/username.csv username
.exit
```

### 起動

``` bash
mvn clean compile spring-boot:run
```

## 参考

- [CrudRepository:javadoc](https://spring.pleiades.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html)