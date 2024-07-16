# Conversor de Monedas

Este proyecto es una aplicación Java que permite convertir entre diferentes monedas utilizando las tasas de cambio obtenidas de una API de intercambio de tasas.

## Descripción

El programa obtiene las tasas de cambio de diferentes monedas utilizando la API de ExchangeRate-API y permite convertir valores entre las siguientes monedas:

- Dólar (USD)
- Peso Argentino (ARS)
- Real Brasileño (BRL)
- Peso Colombiano (COP)
- Peso Chileno (CLP)
- Peso Mexicano (MXN)

## Estructura del Proyecto

- **Main.java**: Contiene el método principal para iniciar el programa.
- **Monedas.java**: Clase que representa las tasas de conversión de las diferentes monedas.
- **ObtenerDatosApi.java**: Clase que se encarga de obtener los datos de la API y actualizar las tasas de conversión en la clase `Monedas`.
- **Principal.java**: Clase que contiene el menú principal y los métodos para realizar las conversiones entre monedas.

## Dependencias

Este proyecto utiliza la biblioteca Gson para manejar JSON y la biblioteca HttpClient para realizar las peticiones HTTP.

## Uso

1. Clonar el repositorio o descargar los archivos del proyecto.
2. Compilar y ejecutar el proyecto.
3. Seguir las instrucciones del menú para seleccionar las conversiones deseadas.

## Ejemplo de Uso

Al ejecutar el programa, se mostrará un menú como el siguiente:


### Ejemplo de Conversión

Para convertir de Dólar a Peso Argentino:

1. Seleccionar la opción `1`.
2. Ingresar el valor en Dólares.
3. El programa mostrará el valor equivalente en Pesos Argentinos.

## Licencia

Este proyecto está bajo la licencia MIT. Ver el archivo [LICENSE](LICENSE) para más detalles.

## Contribuciones

Las contribuciones son bienvenidas. Para contribuir, por favor:

1. Hacer un fork del proyecto.
2. Crear una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realizar los cambios necesarios y hacer commit (`git commit -am 'Añadir nueva funcionalidad'`).
4. Hacer push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Crear un nuevo Pull Request.

## Contacto

Para cualquier pregunta o sugerencia, por favor contactar a [tu_email@dominio.com](mailto:tu_email@dominio.com).

