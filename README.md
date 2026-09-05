# Microservicio Autores — Evaluación Parcial 1 (DOY0101)

Este repositorio contiene la implementación del microservicio de gestión de **Autores**, desarrollado como parte de la Evaluación Parcial 1 de la asignatura **Ingeniería DevOps (DOY0101)**.

El proyecto demuestra las mejores prácticas de desarrollo y operaciones: versionado estructurado de código, gestión automatizada de esquemas de base de datos y preparación para pipelines de Integración Continua (CI).

---

## 👤 Autor

* **Kevis Howard González**
* **Asignatura:** Ingeniería DevOps (DOY0101)

---

## 🎯 Objetivos de la Evaluación

De acuerdo con la rúbrica de la evaluación, el proyecto cubre los siguientes hitos técnicos:

1. **Construcción del Microservicio:** API REST basada en arquitectura en capas utilizando **Spring Boot** e inyección de dependencias.
2. **Versionado de Código (Git & GitHub):**
    * Estrategia de ramificación **GitFlow** (`main` para código estable/producción y `develop` para desarrollo e integración).
    * Commits semánticos y descriptivos según estándares.
3. **Control de Esquemas de Base de Datos (Flyway):**
    * Migraciones versionadas en código (`classpath:db/migration`) para garantizar la repetibilidad del entorno.
    * Creación del esquema base (`V1`) e inserción de datos iniciales (`V2`).
4. **Persistencia y Entorno Local:** Integración con **MariaDB (XAMPP)** en puerto `3306` y soporte alternativo en memoria **H2** para ejecución aislada de pruebas.
5. **Preparación para CI/CD:** Estructura compatible con automatizaciones mediante **GitHub Actions** para validación de compilación y empaquetado continuo (`mvn package`).

---

## 🛠️ Tecnologías y Herramientas

* **Lenguaje:** Java 21 (Eclipse Temurin)
* **Framework:** Spring Boot 3.x / 4.x
* **Gestor de Dependencias:** Apache Maven
* **Persistencia:** Spring Data JPA / Hibernate
* **Migraciones DB:** Flyway Migration Engine
* **Base de Datos:** MariaDB (XAMPP) / H2 Database
* **Librerías Adicionales:** Lombok, Jackson JSON
* **Control de Versiones:** Git / GitHub (Estrategia GitFlow)

---

## 🏗️ Arquitectura de Ramas (GitFlow)

El repositorio sigue la estrategia de ramificación recomendada para entornos DevOps:

* **`main`**: Contiene exclusivamente el código listo para producción, validado y estable.
* **`develop`**: Rama base de integración continua donde se consolidan las funcionalidades y ajustes antes del despliegue.

---

## 🚀 Requisitos e Instalación

### Prerrequisitos
* **JDK 21** o superior instalado y configurado en el `PATH`.
* **XAMPP Control Panel** (Servicio Apache y MySQL/MariaDB en ejecución en el puerto `3306`).
* Base de datos llamada `autores` creada en MariaDB (`http://localhost/phpmyadmin`).

### Pasos para Ejecutar

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/TU_USUARIO/devops-evaluacion1-autores.git](https://github.com/TU_USUARIO/devops-evaluacion1-autores.git)
   cd devops-evaluacion1-autores