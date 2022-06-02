# Useful Commands
``mvn clean flyway:migrate -Dflyway.configFiles=myFlywayConfig.conf``

``docker run --name postgresql -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres``