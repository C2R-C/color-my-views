# App Color My View: Implementando viewBinding

Se toma el código del codelab y se hace la migración a viewBinding para mejorar la app

Al hacer que los colores se pinten de forma aleatoria, ya no se hace necesario hacer referencia a cada `TextView`, 
solo con pasarle a la vista (`view`) `.setBackgroundColor()` ya se ejecuta la acción para cualquiera de los `TextView` e incluso, para la vista root.