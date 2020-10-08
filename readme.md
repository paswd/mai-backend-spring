# Учебный проект по дисциплине "Программная инженерия"

### Автор: Павел Сушко

## Требования
**Язык программирования:** Java 1.8

**Фреймворк:** Spring Framework

**Система сборки:** Gradle

**Система управления контейнерами:** Docker

## Запуск

Перед началом следует установить актуальную версию Docker. Также требуется стабильное интернет-соединение.

Для запуска проекта следует, находясь в корне проекта, ввести следующую команду (работает как из _bash_, так и из _cmd_):

```shell script
docker-compose up -d
```

Далее следует дождаться запуска приложения. В окне вывода контейнера mai-backend-spring_app_1 должно появиться сообщение вида:

```
2020-10-08 01:20:00.000 INFO 104 --- [ main] ru.paswd.mai.backend.Application : Started Application in 15.778 seconds (JVM running for 16.931)
```

## Docker контейнеры

### mai-backend-nginx (порт 80)
NGNIX сервер, предоставляет доступ к статическим ресурсам в случае, если адрес ресурса начинается со `static`. Остальные запросы проксируются на второй контейнер.

### mai-backend-spring_app_1 (порт 8080 - доступен только для других контейнеров)
Spring boot приложение. Выполняет обработку запросов.

## Сервисы

Данная версия проекта реазизует LRU Cache. Доступны операции:

* Получить
* Сохранить
* Удалить

Подробнее о REST сервисе можно узнать с помощью Swagger:

http://localhost/swagger-ui.html

## Примеры запросов

#### Получение

```
curl -X GET "http://localhost/api/cache/index?command=GET&key=key" -H "accept: */*"
```

#### Добавление

```
curl -X GET "http://localhost/api/cache/index?command=PUT&key=key&value=value" -H "accept: */*"
```

#### Удаление

```
curl -X GET "http://localhost/api/cache/index?command=REMOVE&key=key" -H "accept: */*"
```

#### Получение статических данных

Тестовую картинку можно получить по адресу:

http://localhost/static/images/nginx.png
