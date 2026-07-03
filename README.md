# 🔮 Horóscopo

Aplicación web desarrollada en Java EE (ahora Jakarta EE) que permite consultar predicciones astrológicas diarias, mensuales y anuales para los doce signos del zodiaco.

El proyecto fue desarrollado originalmente con fines académicos y posteriormente fue refactorizado y documentado para formar parte de mi portafolio personal.


## ✨ Funcionalidades

### Usuario visitante

- Consultar la predicción diaria de cualquier signo zodiacal.

### Usuario autenticado

Además de consultar la predicción diaria, un usuario autenticado puede:

- Consultar predicciones mensuales.
- Consultar predicciones anuales.

---

## 🏛 Arquitectura

El proyecto está organizado siguiendo una arquitectura inspirada en el patrón **Modelo-Vista-Controlador (MVC)**, 
separando la lógica de negocio, el acceso a datos y la interfaz de usuario.

Además, incorpora otros patrones y componentes comunes en aplicaciones Java:

- **DAO (Data Access Object)** para el acceso a la base de datos.
- **VO (Value Object)** para transportar la información entre las capas.
- **JSP** para la capa de presentación.
- **Servlets** para la lógica de negocio.
- **JDBC** para la comunicación con MySQL.

---

## 🎯 Objetivo

Desarrollar una aplicación web basada en Java EE que permita consultar predicciones astrológicas para los doce signos del zodiaco, aplicando una arquitectura inspirada en el patrón Modelo-Vista-Controlador (MVC) y realizando operaciones de acceso a datos mediante el patrón DAO.
---

## 🚀 Funcionamiento de la aplicación

### Página principal

- Al entrar a la aplicación web el usuario se encuentra con esta primera vista

![Página de inicio](doc/screenshots/paginadeinicio.png)

### Consulta diaria

- Cuando el usuario hace clic en la imagen de cualquier signo del zodiaco, muestra la predicción del día

Ejemplo para la predicción diaria del signo aries

![Página de inicio Predicción Diaria Signo Zodiacal Aries](doc/screenshots/paginadeinicio-aries.png)

Ejemplo para la predicción diaria del signo piscis

![Página de inicio Predicción Diaria Signo Zodiacal Piscis](doc/screenshots/paginadeinicio-piscis.png)

### Inicio de sesión

- El usuario al hacer clic en "iniciar sesión" la aplicación dirige al usuario a la vista de inicio de sesión, donde puede autenticarse

![Página inicio de sesión](doc/screenshots/paginalogin.png)

- Al iniciar sesión, el usuario se encuentra con esta vista de la página principal o "home"

![Página principal](doc/screenshots/paginahome.png)

### Predicción del mes y del año

Al hacer clic sobre la imagen del signo zodiacal el usuario puede ver la predicción diaria, la predicción del mes y la predicción del año 
(el mes es enero y el año 2022 por defecto)

![Página principal predicción signo aries](doc/screenshots/paginahome-predic-aries.png)

También se puede ver la predicción del mes y del año simplemente seleccionando el signo y el mes o el año correspondiente según el caso

![Página principal predicción mes signo tauro](doc/screenshots/paginahome-predic-mes-tauro.png)

### Reserva de lectura de carta astral

Al hacer clic sobre la imagen de la sección "Lectura Carta Astral" el usuario puede reservar una cita de carta astral, y dirige hacia una vista para hacer la reserva (actualmente esta funcionalidad corresponde únicamente a la interfaz gráfica y se encuentra pendiente de implementación.)

![Página reserva lectura carta astral](doc/screenshots/paginareserva-lect-carta-astral.png)


---

## 🛠 Tecnologías utilizadas

- Java
- JSP (JavaServer Pages)
- Java Servlets
- JDBC
- Apache Tomcat
- MySQL
- HTML5
- CSS3
- NetBeans IDE
- Git
- GitHub

---

## 📂 Estructura del proyecto

```text
Horoscopo
├── db/            # Script de la base de datos
├── doc/           # Diagrama de clases
├── lib/           # Librerías externas
├── src/           # Código fuente Java
├── web/           # JSP, CSS e imágenes
```

---

## ⚙️ Instalación

1. Clonar el repositorio.
2. Abrir el proyecto en NetBeans.
3. Crear la base de datos utilizando el script ubicado en `db/horoscopobd.sql`.
4. Configurar la conexión a MySQL en `ConexionBD.java`.
5. Ejecutar el proyecto utilizando Apache Tomcat.

---

## 🗄 Base de datos

El proyecto incluye el script SQL necesario para crear la base de datos:

```text
db/horoscopobd.sql
```

---

## Mejoras realizadas

Como parte de la actualización del proyecto para portafolio se realizaron las siguientes mejoras:

- Reorganización de la interfaz gráfica.
- Documentación del código fuente.
- Organización de la estructura del proyecto.
- Inclusión del script de la base de datos.
- Control de versiones mediante Git y GitHub.

---

## 🔮 Mejoras futuras

- Implementar PreparedStatement para mayor seguridad.
- Mejorar el diseño responsive.
- Incorporar un panel administrativo.
- Permitir el registro de nuevos usuarios.
- Mejorar la validación de formularios.
- Añadir la funcionalidad de la reserva de lectura de carta astral

---

## 📚 Aprendizajes

Durante el desarrollo y la actualización de este proyecto reforcé conocimientos sobre:

- Arquitectura MVC.
- Patrón DAO.
- JDBC.
- Servlets y JSP.
- Programación Orientada a Objetos.
- Git y GitHub.
- Organización y documentación de proyectos.

---

## 👨‍💻 Autor

**Yeison Alexander Farfán**

Proyecto desarrollado con fines académicos en el año 2022 para la asignatura de Programación Avanzada y actualizado como parte de mi portafolio de desarrollo de software.