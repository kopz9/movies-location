# Movie Location

Pega os dados de uma API externa usando webflux, e filtra pelo titulo. 

Projeto para aprender como mexer com APIs externas.

Procurar todos os filmes
```java
http://localhost:8080/movies
```

Procurar o titulo pela URI.

```java
http://localhost:8080/movies?title=matrix
```

Autocomplete
```java
http://localhost:8080/movies/autocomplete?q=sta
```