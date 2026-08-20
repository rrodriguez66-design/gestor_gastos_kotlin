Román Rodríguez Castro

1. ¿Qué diferencia encontró entre commit y push?
La diferencia principal radica en dónde se guarda el historial de los cambios.
Un commit funciona como un "punto de guardado" que registra las modificaciones de mi código junto con un mensaje explicativo,
pero esto ocurre única y exclusivamente de forma local en mi computadora. Por otro lado, el push es la acción de tomar todos esos
commits locales y enviarlos a los servidores de GitHub (la nube); es el paso indispensable para respaldar mi avance y permitir
que mis compañeros de equipo puedan ver y descargar mis aportaciones.

3. ¿Para qué sirve trabajar en ramas?
Trabajar en ramas sirve para crear entornos de desarrollo totalmente aislados. Me permite construir nuevas características (como lo
hice en mi rama registro-gastos) sin correr el riesgo de dañar el código estable de la línea principal (master). Para mis futuros
proyectos de ingeniería, entiendo que esta herramienta es vital porque permite que varias personas colaboremos en el mismo software
al mismo tiempo sin estorbarnos, manteniendo el control de calidad mediante revisiones antes de fusionar cualquier código nuevo.


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
