# Sorting_Taller5
Ordenación Java
        Decisiones de Diseño y Arquitectura

El código sigue una estructura modular con la siguiente división por paquetes:

- dominio: Contiene la lógica pura de los algoritmos de ordenamiento.

- BurbbleSort: Implementa el algoritmo de la burbuja.

- Selectionsort: Implementa el algoritmo de selección.

- InsertionSort: Implementa el algoritmo de inserción.

Cada clase de ordenamiento ofrece métodos sobrecargados, permitiendo la ejecución con y sin trazabilidad (trace).
- Util: Contiene funcionalidades auxiliares.
- SortingUtils : Maneja la entrada de datos del usuario (validacion_entradadatos) , muestra el arreglo original (Arreglo_a_orednar) , y verifica si todos los elementos del arreglo son iguales (todosIguales).
- controlador: Actúa como la capa de control, manejando la interacción entre la lógica de ordenamiento y las utilidades.
- Control_Sorting : Define los métodos para ejecutar cada algoritmo de ordenamiento (burbblesort, selectionsort, insertionsort). Se encarga de la validación inicial y muestra el resultado final.
- org.sorting: Contiene la clase principal para la ejecución.
- Main : Muestra el menú interactivo, lee la opción del usuario y llama a la función de control correspondiente.

      Casos Borde Considerados
Se han implementado validaciones y manejos para los siguientes casos especiales:
- Arreglos Vacíos o con un Elemento (Insertion Sort): Si el tamaño del arreglo (n) es menor o igual a 1, el método sort retorna inmediatamente, ya que el arreglo se considera ordenado.
- Arreglos con Elementos Idénticos: Antes de ejecutar cualquier algoritmo, la utilidad todosIguales verifica si todos los elementos son iguales. Si lo son, se imprime un mensaje indicando que el arreglo ya está ordenado y se detiene la ejecución del algoritmo.

- Arreglo Ya Ordenado (Bubble Sort): La implementación de Bubble Sort incluye una optimización. Utiliza una bandera swapped  para detectar si se realizó algún intercambio en una pasada. Si una pasada se completa sin intercambios (!swapped), significa que el arreglo ya está ordenado, y el ciclo principal termina mediante break.
- Validación de Entrada: La utilidad validacion_entradadatos garantiza que el usuario ingrese un número entero para el tamaño del arreglo (mayor o igual a 0) y un número entero para cada elemento. Se manejan errores de formato de número (NumberFormatException) en el menú.
		    Cómo Ejecutar el Proyecto

El proyecto se ejecuta desde la clase principal Main en el paquete org.sorting.

Compilación: Compila todas las clases (.java) en sus respectivos directorios (paquetes).

Ejecución: Ejecuta el método main de la clase Main.

El programa se ejecutará en modo interactivo, presentando el siguiente menú:

Pasos en la Ejecución:

<img width="276" height="165" alt="image" src="https://github.com/user-attachments/assets/66a1d60b-2796-474c-9602-f417f54a326e" />

Selecciona una opción del menú (1, 2, o 3).
		
- El sistema solicitará el tamaño del arreglo.
  
- Ingresa cada uno de los elementos del arreglo, uno por uno.
  
El sistema mostrará:

	- El Arreglo a ordenar original.
 
	- La trazabilidad del algoritmo (si está habilitada, como en Selection Sort e Insertion Sort ).
   
	- El RESULTADO FINAL con el arreglo ya ordenado.
Para salir, selecciona la opción 4.
