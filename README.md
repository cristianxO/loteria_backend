# **Lotería_Backend - Gestión de Sorteos y Venta de Billetes**  

## **Descripción**  
Esta aplicación implementa el backend del sistema de lotería: permite registrar clientes, crear sorteos, listar billetes disponibles, vender billetes a clientes, etc.  
La arquitectura está basada en capas (controller → service → repository) y cuenta con tecnologías modernas: Spring Boot 3.5.7, H2 en memoria, JPA, DTOs, manejo global de excepciones y configuración de CORS.

## **Tecnologías**  
- Java 17+  
- Spring Boot 3.5.7  
- Spring Web, Spring Data JPA  
- H2 Database
- Lombok  
- Manejo global de excepciones con `@RestControllerAdvice`  
- CORS habilitado para conexión con frontend en `http://localhost:4200`

## **Requisitos previos**  
Asegúrate de tener instalados:  
- JDK 17 o superior  
- Maven  
- El proyecto clonado o descargado

## **Instalación y ejecución**  
1. Clona el repositorio:  
   ```bash
   git clone https://github.com/tu-usuario/loteria_backend.git
   cd loteria_backend

## **Ejecución**
```bash
mvn spring-boot:run
```
En el navegador aparecera así: http://localhost:8080/h2-console
 (verifica la base de datos)
 
Usa Postman o tu frontend para consumir la API.

## **Datos de prueba**
El archivo src/main/resources/data.sql ya contiene datos de ejemplo (clientes, sorteos, billetes).
Gracias a la configuración de inicialización SQL, estos datos se cargarán automáticamente al iniciar la aplicación.

## **Endpoints disponibles*

| Metodo | Ruta | Descripción |
| :--- | :--- | :--- |
| `/POST` | `/clientes` | Crear un nuevo cliete |
| `/GET` | `/clientes/{id}` | Obtener los billetes comprados por un cliente |
| `/GET` | `/clientes` | Listar todos los clientes |
| `/POST` | `/sorteos` | Crear un sorteo |
| `/GET` | `/sorteos` | Listar todos los sorteos existentes |
| `/POST` | `/billetes/{idSorteo}` | Crear billete |
| `/PATCH` | `/billetes/{idCliente}/{idSorteo}/{idBillete}` | vender un billete |

## **Configuración de CORS*
Se habilitó CORS globalmente para permitir peticiones desde el frontend (Angular) en http://localhost:4200:
