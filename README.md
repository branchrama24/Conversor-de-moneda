# Conversor de Monedas - Java + API ExchangeRate

Este es un proyecto de consola en Java que permite convertir monedas entre distintos pares usando una API pública de tipo de cambio (ExchangeRate API). El objetivo del desafío es practicar el consumo de APIs externas, el manejo de JSON y la organización de código en Java orientado a objetos.

## 🧠 Tecnologías utilizadas

- Java 17+
- Librería Gson (para parsear JSON)
- IntelliJ IDEA (u otro IDE)
- API gratuita de [ExchangeRate-API](https://www.exchangerate-api.com/)

---

## 📌 Requisitos previos

- Tener Java instalado (versión 17 o superior).
- Tener un IDE como IntelliJ IDEA, Eclipse o VSCode.
- Conexión a internet (para acceder a la API).
- Crear una cuenta gratuita en ExchangeRate-API y obtener tu **API Key**.

---

## 🧰 Instalación y configuración

### 1. Clonar el repositorio o crear el proyecto
Podés crear un nuevo proyecto en tu IDE con una estructura como esta:

/ConversorMoneda ├── src/ │ ├── ApiRequest.java │ ├── Conversor.java │ 
├── Main.java │ └── Moneda.java ├── lib/ │ └── gson-2.10.1.jar └── README.md


> Asegurate de tener el `.jar` de Gson en la carpeta `lib/` y agregado al classpath del proyecto.

### 2. Obtener tu API Key

1. Ir a [https://www.exchangerate-api.com](https://www.exchangerate-api.com/)
2. Registrarte gratuitamente con tu email.
3. Copiar la clave API (API Key).
4. Reemplazar `"your_api_key"` en el archivo `ApiRequest.java` con tu clave real.

```java
private static final String API_KEY = "tu_clave_aquí";
