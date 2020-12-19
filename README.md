# App Color My View: Google Codelab's

Esta es una app que hace parte de una serie de apps realizadas para entrenar el desarrollo de apps nativas Android, las cuales son desarrolladas en lenguaje Kotlin y de acuerdo con los instructivos de Google Developers
___
## Modificación propia

He modificado el código para que al clickear cada elemento el color de relleno se establece aleatoriamente, con eso, se podrá cambiar el color del fondo cada vez que se toque el elemento.

Para ello, le paso por parámetro la función `randomColor()` al método `.setBackgroundColor()` de la función `makeColored()`  
___

### Desafío de codificación

Utilizar imágenes en lugar de colores y texto como fondos para todas las vistas. La aplicación deberá revelar las imágenes cuando el usuario toque las vistas de texto.

Para este desafío lo que hice fue reemplazar el método `.setBackgroundColor` por `setBackgroundResource` y lo apunté a la carpeta `drawable`
Así mismo, agregué un `if()` en la función `makeColored` para que al presionar por fuera de los `Textview` la vista de raiz cambie su background de color.

Los invito a revisar el cambio al MainActivity
___

### Desafío de codificación: 2.3

Eliminar el texto y los botones de la aplicación y llenar todo el diseño con cuadros de color (vistas `TextView`). la aplicación debe alternar o cambiar los colores cuando el usuario toca la pantalla.

Para este desafío se hizo lo siguiente:
-Eliminé todos los botones y sus referencias
- Agregué 9 `textview`
- Quité los textos de los `textview`
- Asigné a cada `textview` un escuchador de click para que cambien el color.

Para el próximo commit, el desafío será hacer que cuando se toque cualquier parte de la pantalla cambien de color todos los `textview` y la vista root