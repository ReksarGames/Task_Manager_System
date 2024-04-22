Task Management System
Это простое веб-приложение для управления задачами, реализованное с использованием Spring Boot, Spring Security и H2 базы данных.
-
Описание:

- Это приложение предоставляет API для создания, редактирования, удаления и отслеживания задач. Пользователи могут авторизовываться и выполнять действия в соответствии с их ролями.

Функциональность

- Аутентификация и авторизация пользователей с использованием Spring Security.
- Создание, редактирование и удаление задач.
- Отслеживание статуса задач (например, новая, в работе, завершена).
- Возможность назначения задач на определенного пользователя или группу пользователей.

Требования
- Java 8 или выше
- Maven 3.6.3 или выше

Установка и запуск

--> Клонируйте репозиторий:
bash
Copy code
git clone https://github.com/your-username/task-management.git

-->Перейдите в каталог проекта:
bash
Copy code
cd task-management

-->Соберите проект с помощью Maven: 
bash
Copy code
mvn clean install

-->Запустите приложение:
bash
Copy code
mvn spring-boot:run


Использование:
--
После запуска приложения, вы можете использовать его API для управления задачами через HTTP запросы. Например:

Получить все задачи: GET http://localhost:8080/api/tasks

Создать новую задачу: POST http://localhost:8080/api/tasks

Получить информацию о задаче по её ID: GET http://localhost:8080/api/tasks/{taskId}

Обновить существующую задачу: PUT http://localhost:8080/api/tasks/{taskId}

Удалить задачу: DELETE http://localhost:8080/api/tasks/{taskId}

Лицензия
Этот проект лицензирован под MIT License. См. LICENSE для получения дополнительной информации.

