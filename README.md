Román Rodríguez Castro

¿Qué diferencia encontró entre commit y push?
Un commit funciona como un punto de guardado de los cambios en mi propia computadora (local). Registra las modificaciones en el historial, pero nadie más puede verlas. Por otro lado, un push toma todos esos cambios locales y los sube a la nube (GitHub), lo cual es el paso indispensable para que mi compañero de equipo pueda ver, revisar y descargar mis aportaciones.

¿Por qué debe hacerse pull antes de comenzar a modificar archivos?
Es indispensable para descargar la versión más reciente del código que está en la nube a mi computadora local. Si no hago pull antes de programar, corro el riesgo de trabajar sobre un código desactualizado, lo que inevitablemente generará un conflicto de fusión al intentar subir mis cambios (exactamente como nos pasó durante la práctica).

¿Para qué sirve trabajar en ramas?
Sirve para crear espacios de trabajo completamente aislados. Nos permitió que mi compañero y yo programáramos al mismo tiempo distintas partes de la aplicación (yo en mi rama registro-gastos y él en analisis-gastos) sin estorbarnos y sin afectar el código estable de la rama principal (master). Es fundamental para mantener el orden y la calidad del código antes de fusionarlo.

¿Qué ocasionó el conflicto?
El conflicto se originó porque mi compañero y yo modificamos el mismo archivo (src/Main.kt) en las mismas líneas. Al momento en que él subió su código, omitió hacer un paso de sincronización previo (pull y merge local) para descargar mis funciones. Por lo tanto, GitHub detectó que nuestras dos versiones del archivo chocaban y bloqueó la fusión automática.

¿Cómo decidió qué código conservar?
Decidí conservar ambas versiones del código porque eran complementarias y necesarias para el programa. Utilicé la herramienta de resolución de conflictos de GitHub y seleccioné la opción de aceptar ambos cambios (Accept both changes). De esta manera, el archivo final mantuvo mis funciones de registro intactas y acomodó la función matemática de mi compañero justo debajo, sin borrar el trabajo de ninguno.

¿Qué aportó personalmente al programa?
Fui responsable de programar las funciones registrarGasto (incluyendo la validación de montos y menús de categorías) y mostrarGastos. Además, me encargué de realizar la revisión técnica del Pull Request, solucionar el conflicto de código directamente en GitHub y agregar el menú interactivo con el ciclo while en la función main para integrar todo el trabajo y lograr que la aplicación fuera 100% funcional.


------------------------------------------------------------------------------------------------------------------------------------------

Valdez Vazquez Isai Emiliano

¿Qué diferencia encontró entre commit y push?
Un commit guarda los cambios localmente en la memoria de la computadora, mientras que un push envía esos cambios guardados al repositorio remoto en GitHub.

¿Por qué debe hacerse pull antes de comenzar a modificar archivos?
Para descargar la versión más reciente del proyecto. Esto sincroniza la computadora y evita que programemos sobre código obsoleto o generemos conflictos innecesarios con el trabajo de otros.

¿Para qué sirve trabajar en ramas?
Para desarrollar nuevas funciones en un entorno aislado. Permite que varios programadores trabajen al mismo tiempo sin riesgo de romper el código principal del proyecto.

¿Qué ocasionó el conflicto?
El conflicto se generó porque ambos integrantes del equipo agregamos código nuevo exactamente en el mismo archivo (Main.kt) trabajando desde ramas diferentes.

¿Cómo decidió qué código conservar?
Se conservó el código de ambos. La solución consistió en borrar las etiquetas de alerta generadas por Git (<<<<<<<, =======, >>>>>>>) y acomodar las líneas de texto para que todas las funciones coexistieran de forma ordenada.

¿Qué aportó personalmente al programa?
Trabajé en la rama analisis-gastos, donde desarrollé la lógica de procesamiento de datos. Específicamente, programé las funciones calcularTotal y mostrarResumenPorCategoria para calcular las sumas y agrupar los gastos ingresados.
