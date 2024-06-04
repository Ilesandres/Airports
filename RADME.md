# 🧩🛩✈ Sistema de Vuelos

Sistema de control de vuelos, por consola en java,
añade los da vuelos y los Aeropuertos con las listas, para manejar los datos con mayor facilidad la logica la contiene la clase ListVuelos,
los datos son modificables. \
al ejecutar el main podemos ver los vuelos entrantes a cada aeropuerto, tambien podemos ver los velos Salientes de cada Aeropuerto ✈

![Code](https://github.com/Ilesandres/img_Proyects/blob/main/vuelos_airport.png)

## 📋 Tabla de contenidos

- [📦 Instalación](#-instalación)
- [🚀 Uso](#uso)
- [📁 Estructura del Proyecto](#estructura-del-proyecto)
- [✨ Características](#características)
- [🤝 Contribuciones](#contribuciones)
- [📝 Licencia](https://github.com/Ilesandres)
- [🖥💻Requisitos](#Requisitos)
- 


## 📦 Instalación

1. Clona el repositorio a tu máquina local:
   ```bash
   git clone https://github.com/Ilesandres/Airports.git

## 🖥💻Requisitos
- JDK 8 o superior
- tener un compilador(Intellij Idea)
- 
## 👓Estructura del proyecto

Estructura del Proyecto
El proyecto está organizado en varias clases:

- Aeropuerto: Representa un aeropuerto con su código, nombre, ciudad, país y zona horaria.
- ListAeropuertos: Gestiona una lista de aeropuertos, permitiendo agregar y buscar aeropuertos por su código.
- Vuelo: Clase abstracta, super o padre que representa un vuelo con atributos comunes.
- VueloCharter: Subclase de Vuelo que representa un vuelo chárter con información adicional sobre la compañía y horario.
- VueloRegular: Subclase de Vuelo que representa un vuelo regular con información sobre horarios y días de operación.
- ListVuelo: Gestiona una lista de vuelos, permitiendo agregar y mostrar información detallada de los vuelos.
- Main: Clase principal que contiene un ejemplo de uso del sistema.
