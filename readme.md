# Учебный проект по дисциплине "Программная инженерия"

### Автор: Павел Сушко

## О проекте
**Язык программирования:** Java 1.8

**Фреймворк:** Spring Framework

**Система сборки:** Gradle

**Хост по умолчанию**: localhost

**Порт по умолчанию:** 8080

## Запуск

#### Linux
```shell script
./gradlew bootRun
```

#### Windows
```shell script
./gradlew.bat bootRun
```

## Сервисы

Данная версия проекта реазизует LRU Cache. Доступны операции:

* Получить
* Сохранить
* Удалить

Подробнее о REST сервисе можно узнать с помощью Swagger:

http://localhost:8080/swagger-ui.html

## Примеры запросов

#### Получение

```
curl -X GET "http://localhost:8080/api/cache/index?command=GET&key=key" -H "accept: */*"
```

#### Добавление

```
curl -X GET "http://localhost:8080/api/cache/index?command=PUT&key=key&value=value" -H "accept: */*"
```

#### Удаление

```
curl -X GET "http://localhost:8080/api/cache/index?command=REMOVE&key=key" -H "accept: */*"
```
