# SEG3502 – Lab 6 : Service Web REST Calculator (Spring Boot + Kotlin)

Auteur : Anwar Issaoui (aissa050@uottawa.ca) — Numéro étudiant : ______

Exercice du laboratoire 6 : service Web REST « Calculator » avec documentation OpenAPI (springdoc).

## Points de terminaison
| Méthode | URL | Description |
|---|---|---|
| GET | `/calculator/add/{nombre1}/{nombre2}` | addition |
| GET | `/calculator/subtract/{nombre1}/{nombre2}` | soustraction |
| GET | `/calculator/multiply/{nombre1}/{nombre2}` | multiplication |
| GET | `/calculator/divide/{nombre1}/{nombre2}` | division (400 Bad Request si nombre2 = 0) |

Documentation : `http://localhost:8080/v3/api-docs`, `http://localhost:8080/v3/api-docs.yaml`, Swagger UI `http://localhost:8080/swagger-ui.html`.

## Prérequis
- JDK 21

## Exécution
```bash
./gradlew bootRun            # Windows : gradlew.bat bootRun
# ou
./gradlew bootJar && java -jar build/libs/calculator-api-0.0.1-SNAPSHOT.jar
```
Tests : `./gradlew test`

Exemple : `curl http://localhost:8080/calculator/add/8/2` → `10.0`
