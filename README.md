# App Color My View: Implementando viewBinding

Se toma el código del codelab y se hace la migración a viewBinding para mejorar la app

Al hacer que los colores se pinten de forma aleatoria, ya no se hace necesario hacer referencia a cada `TextView`, 
solo con pasarle a la vista (`view`) `.setBackgroundColor()` ya se ejecuta la acción para cualquiera de los `TextView` e incluso, para la vista root.

## Commit: 7135eb3

En este commit encuentras una ap que con tocar cualquier área de la pantalla del dispositivo móvil, cambia los colores de todas las vistas, inclusive, la vista root.

Así mismo se agregaron nueve elementos más de `textview` en el activity_main.

Acá podemos apreciar que el código se reduce significativamente, pasando de 117 líneas de código en el MainActivity a tan solo 74 lineas en el mismo archivo.
