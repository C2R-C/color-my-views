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

