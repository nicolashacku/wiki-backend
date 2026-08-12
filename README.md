# Wiki Backend

Pequeña aplicación con Spring Boot y Thymeleaf para presentar miembros de un equipo.

## Resumen
- Aplicación web con páginas individuales para 4 miembros y una página principal del grupo.
- Plantillas HTML en Thymeleaf y estilos CSS básicos.

## Tecnologías
- Java 25
- Spring Boot
- Thymeleaf
- Maven

## Requisitos
- JDK instalado
- Maven instalado (o usar el wrapper mvnw)

## Inicio rápido
1. Clona el repositorio:
   git clone <repo-url>
2. En la raíz del proyecto ejecuta:
   mvn spring-boot:run
3. Abrir en el navegador:
   http://localhost:8080/grupo

## Endpoints principales
- GET /grupo         → Vista principal del equipo
- GET /miembro1      → Perfil miembro 1
- GET /miembro2      → Perfil miembro 2
- GET /miembro3      → Perfil miembro 3
- GET /miembro4      → Perfil miembro 4

## Estructura de directorios (relevante)
```
src/main/java/.../controller/   -> Controladores Spring
src/main/resources/templates/  -> Plantillas Thymeleaf (grupo.html, miembro*.html)
src/main/resources/static/css/ -> Estilos
pom.xml                        -> Dependencias y build
```

Proyecto de presentación del equipo — Wiki Backend
"