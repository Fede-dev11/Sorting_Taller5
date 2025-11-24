		 Descripción General

Este proyecto implementa y compara varios algoritmos de ordenamiento aplicados a diferentes conjuntos de datos obtenidos desde archivos CSV. La arquitectura está diseñada para ser modular, separando la lógica de ordenación, la carga de datos, el control de ejecución y la interacción con el usuario.

El sistema permite analizar el rendimiento de cada algoritmo mediante métricas como comparaciones, intercambios (swaps) y tiempo de ejecución.

		Estructura del Proyecto

El código se organiza en los siguientes paquetes:

### 1. dominio — Lógica de Ordenamiento

Contiene las implementaciones de los algoritmos:

BurbbleSort
Implementa Bubble Sort con optimización de corte temprano usando la bandera swapped.

Selectionsort
Implementa Selection Sort: busca el mínimo en cada iteración y lo coloca al inicio.

InsertionSort
Implementa Insertion Sort, ideal para listas parcialmente ordenadas.

Registro
Representa un elemento genérico proveniente de los CSV (citas, pacientes o inventario).

Cada clase recibe:

Un arreglo de Registro

Un Comparator<Registro> para decidir el criterio de ordenación

Un objeto Metrics para almacenar las estadísticas del algoritmo

2. Util — Herramientas Auxiliares

CSVReader
Lee los archivos CSV del proyecto:

citas_100.csv

citas_100_casi_ordenadas.csv

pacientes_500.csv

inventario_500.csv

Metrics
Registra:

Comparaciones

Swaps

Tiempo de ejecución

Incluye comparadores predefinidos:

porFecha()

porApellido()

porStock()

Resultado
Representa el resultado final de un algoritmo: nombre, tiempo y métricas.

3. controlador — Capa de Control

Control_sort
Gestiona:

Arreglos cargados desde los CSV

Objeto Metrics

Impresión de métricas

Control central del flujo de ordenamiento

Sort_methods
Ejecuta los algoritmos sobre cada dataset:

Citas por fecha

Pacientes por apellido

Inventario por stock

Citas casi ordenadas

Cada método:

Carga los datos

Ejecuta el algoritmo seleccionado

Muestra el resultado ordenado en forma de tabla

Imprime las métricas

Registra el resumen en Resultado

Al finalizar, compara los resultados para determinar qué algoritmo fue más eficiente.

4. org.sorting — Capa de Presentación

Main
Clase principal que muestra el menú:

<img width="332" height="154" alt="image" src="https://github.com/user-attachments/assets/e2c16ef8-e51d-435a-b617-af54e2b946ff" />

Flujo del programa:

El usuario selecciona un algoritmo.

Se cargan los datasets (CSV).

Se ejecuta el algoritmo sobre todas las listas.

Se muestra:
El arreglo ordenado
Métricas detalladas

Un reporte final comparando los algoritmos

	 Casos Borde Considerados
-  Arreglos vacíos o con un solo elemento

Los métodos verifican n <= 1 y retornan sin procesar.

-  Arreglos con elementos idénticos

Los comparadores manejan valores repetidos sin generar errores.

-  Bubble Sort con corte temprano

Finaliza antes si no se realizaron intercambios en una iteración.

-  Datos parcialmente ordenados

Insertion Sort aprovecha su eficiencia y reduce tiempo y swaps.

-  Validación de entrada

El menú controla errores tipo NumberFormatException.

		Cómo Ejecutar el Proyecto

Ejecutar
java org.sorting.Main

El menú permitirá elegir el algoritmo a aplicar.

- Salida Esperada

Para cada dataset se muestra:

Tabla ordenada

Comparaciones

Swaps

Tiempo (ns)

Resumen general del algoritmo

Comparación entre algoritmos para elegir el más eficiente

