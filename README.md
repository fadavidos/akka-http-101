# Akka-Http-101
Proyecto para poner en practica los conocimientos adquiridos de [Akka-Http](https://doc.akka.io/docs/akka-http/current/index.html)

## Stack
- Scala: 2.12.8
- Akka-Http: 10.1.7
- Akka-Stream: 2.5.19

## Hacer pruebas
En una consola:
1. `sbt`
2. `project servidorHttp`
3. `run`

En otra consola:
1. `curl http://localhost:9000/hola`

En un navegador:
1. `http://localhost:9000/hola`

La respuesta en cualquier caso será:
`Hola mundo`

