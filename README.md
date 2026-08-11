"# Wiki Backend - Página Web de Presentación

## 📖 Descripción

Este proyecto es una página web simple que presenta a los miembros de un equipo. La aplicación consta de **5 endpoints principales**, construida con **HTML básico y CSS**.

## 🌐 Estructura de Endpoints

### Endpoints Individuales de Miembros (4 endpoints)

#### 1. **Endpoint de Miembro 1** - `/miembro1`
Página de presentación del primer miembro del equipo. Cada miembro se describe a sí mismo con su información personal y detalles relevantes.

#### 2. **Endpoint de Miembro 2** - `/miembro2`
Página de presentación del segundo miembro del equipo. Cada miembro comparte su propia descripción y perfil.

#### 3. **Endpoint de Miembro 3** - `/miembro3`
Página de presentación del tercer miembro del equipo. Espacio dedicado para que cada miembro se presente.

#### 4. **Endpoint de Miembro 4** - `/miembro4`
Página de presentación del cuarto miembro del equipo. Cada página contiene la información única del miembro.

### Página Principal del Grupo (1 endpoint)

#### 5. **Página del Grupo** - `/grupo`
Página principal que muestra el equipo completo. Contiene botones de navegación que permiten acceder fácilmente a cada una de las páginas individuales de los miembros.

## ✨ Características

- 🎨 **Diseño Simple**: HTML básico y CSS limpio y funcional
- 🧭 **Navegación Intuitiva**: Botones para navegar fácilmente entre las diferentes páginas
- 📝 **Presentación Personal**: Cada miembro tiene su propia página donde se describe a sí mismo
- 👥 **Página de Grupo**: Vista general del equipo completo con acceso rápido a cada perfil
- 📱 **Estilo Básico**: Diseño minimalista perfecto para empezar

## 🛠️ Tecnologías Utilizadas

- **Spring Framework**: Framework backend para Java
- **Thymeleaf**: Motor de plantillas para renderizar las vistas
- **HTML5**: Estructura de las páginas
- **CSS3**: Estilos visuales simples y efectivos
- **Java**: Lenguaje de programación para la lógica backend

## 📂 Estructura del Proyecto

```
wiki-backend/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/wiki/
│   │   │       └── controller/
│   │   │           └── MiembrosController.java
│   │   └── resources/
│   │       ├── templates/
│   │       │   ├── grupo.html          (Página principal del grupo)
│   │       │   ├── miembro1.html       (Plantilla del miembro 1)
│   │       │   ├── miembro2.html       (Plantilla del miembro 2)
│   │       │   ├── miembro3.html       (Plantilla del miembro 3)
│   │       │   └── miembro4.html       (Plantilla del miembro 4)
│   │       └── static/
│   │           └── css/
│   │               └── styles.css      (Estilos principales)
│   └── test/
├── pom.xml                             (Configuración Maven)
└── README.md                           (Este archivo)
```

## 🚀 Cómo Usar

1. Clonar o descargar el repositorio
2. Configurar las dependencias en `pom.xml` (Spring Boot, Thymeleaf)
3. Ejecutar la aplicación Spring Boot
4. Abrir `http://localhost:8080/grupo` en el navegador web
5. Utilizar los botones de navegación para explorar las páginas de cada miembro
6. Cada página de miembro tiene botones para volver al grupo o navegar a otros perfiles

## 🔧 Configuración

### Dependencias Principales (Maven)

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

### Controlador Spring

Los endpoints están gestionados por un controlador Spring que mapea las rutas y retorna las vistas Thymeleaf.

```java
@Controller
public class MiembrosController {
    
    @GetMapping("/grupo")
    public String grupo(Model model) {
        // Lógica para la página del grupo
        return "grupo";
    }
    
    @GetMapping("/miembro1")
    public String miembro1(Model model) {
        // Lógica para el miembro 1
        return "miembro1";
    }
    
    // ... más endpoints para miembro2, miembro3, miembro4
}
```

## 📋 Características de las Páginas

- **Página del Grupo**: Muestra todos los miembros y proporciona botones para acceder a sus perfiles individuales
- **Páginas de Miembros**: Cada miembro se presenta con su propia información y descripción personal

---

**Proyecto de presentación del equipo - Wiki Backend**" 
