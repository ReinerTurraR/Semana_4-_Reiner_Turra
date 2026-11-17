Llanquihue Tour - Semana 4
Nombre del proyecto
LlanquihueTourApp
Descripción
Este proyecto fue desarrollado para la actividad de la Semana 4 de la asignatura Desarrollo Orientado a Objetos I.
Su objetivo es leer información de tours turísticos desde un archivo de texto, crear objetos en Java y almacenarlos en una colección dinámica `ArrayList`.
El programa permite mostrar el catálogo completo y filtrar los tours según su tipo.
Estructura del proyecto
```text
LlanquihueTourApp
│
├── src
│   ├── model
│   │   └── Tour.java
│   │
│   ├── data
│   │   └── GestorDatos.java
│   │
│   ├── ui
│   │   └── Main.java
│   │
│   └── resources
│       └── tours.txt
│
├── nbproject
├── build.xml
└── README.md
```
Clases implementadas
Tour: representa cada tour mediante sus atributos nombre, tipo y precio.
GestorDatos: se encarga de leer el archivo `tours.txt`, separar los datos y crear los objetos `Tour`.
Main: ejecuta el programa, muestra los tours registrados y realiza el filtrado de la información.
Tecnologías utilizadas
Java
Apache NetBeans IDE 31
`ArrayList`
Lectura de archivos de texto
GitHub
Instrucciones para ejecutar
Descargar o clonar el repositorio.
Abrir Apache NetBeans IDE.
Seleccionar File → Open Project.
Buscar y abrir la carpeta del proyecto `LlanquihueTourApp`.
Ejecutar el proyecto desde la clase `Main`, ubicada en el paquete `ui`.
Autor
Reiner Turra
Asignatura
Desarrollo Orientado a Objetos I