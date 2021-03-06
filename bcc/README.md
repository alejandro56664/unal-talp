# Análizador léxico, sintáctico e interprete para BCC

## Introducción
bcc un lenguaje de programación diseñado principalmente para la enseñanza en los cursos de Lenguajes de Programación y Compiladores por el Profesor Juan David Velásquez de la Facultad de Minas de la Universidad Nacional de Colombia - Sede Medellín. Este semestre utilizaremos este lenguaje para desarrollar las prácticas propuestas en el curso.
La descripción del lenguaje bcc, algunos ejemplos y su gramática se pueden consultar en el siguiente artículo publicado:

J. D. Velasquez, [“bcc: A suite of Tools for Introducing Compiler Construction Techniques in the Classroom,”](https://ieeexplore.ieee.org/abstract/document/8804260?casa_token=ogUocsUg49gAAAAA:dVcAJiZKriQ_1YrB0lKp1ANuLgdHUMySUEASPMLnerQs0y00HuJnAB66vEfSDth6OT-INGGAzK8) IEEE Lat. Am. Trans., vol. 16, no. 12, pp. 2941–2946, Dec. 2018.

## Objetivo

- Desarrollar un analizador léxico para el lenguaje de programación bcc. Para realizar la implementación se podrán únicamente los siguientes lenguajes de programación: Python 3, C/C++ y Java.  
- Desarrollar un analizador sintáctico.
- Desarrollar un Interprete basado en árboles usando el patrón Visitor.


## Configuración ANTLR

_TODO_ agregar tutorial instalación plugin ANTLR en IntelliJ

Una vez instalado el plugin deben configurarse los siguientes parámetros:
(recuerde que las ubicaciones deben ser absolutas, por simplicidad se colocan aquí solo una parte de la ruta)
```sh
output directory: [ubicación local del repo]\unal-talp\bcc\src\main\java
location imported grammarss: [ubicación local del repo]\unal-talp\bcc\src\main\resources
package/namespace: co.edu.unal.talp.laboratorios.bcc.gen
```


## Ejecución

Para compilar y generar un fat-jar
```sh
mvn clean install
```

Para ejecutar y pasar los programas por la entrada en consola
```sh
java -jar bcc-1.0-SNAPSHOT-jar-with-dependencies.jar -i
```
Se obtendrá un resultado como el de la imagen:

![alt text](./doc/Captura1.PNG)

Para ejecutar y pasar los programas desde un archivo
```sh
java -jar bcc-1.0-SNAPSHOT-jar-with-dependencies.jar -s <ruta progrma>
```

También puede ejecutar algunos casos de prueba ejecutando la clase BBLexerTestRunner en el IDE como 'aplicación java'.

Actualmente existen 4 casos de prueba creados para el lenguaje.

# Analizador sintáctico

TODO:
- revisar documentación del paper para ver particularidades del lenguaje.

# Interprete 

Diagrama de clases

![alt text](./doc/diagrama%20de%20clases.png)

