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

### Desafío Personal

Hacer que cada vez que se toque la pantalla cambien los colores de todos los `textview`. Para ello lo que hice fue crear la función `changeAllColor()` a la cual le paso a cada elemento el método `.setBackgroundColor(randomColor())` y en el `when` de la función `makeColored()` paso la funciónque cree, `changeAllColor()`
                                                                                         
~~~ kotlin
private fun makeColored(view: View) {

            when (view.id) {
                R.id.box_one_text -> changeAllColor()
                R.id.box_two_text -> changeAllColor()
                R.id.box_three_text -> changeAllColor()
                R.id.box_four_text -> changeAllColor()
                R.id.box_five_text -> changeAllColor()
                R.id.box_six_text -> changeAllColor()
                R.id.box_seven_text -> changeAllColor()
                R.id.box_eight_text -> changeAllColor()
                R.id.box_nine_text -> changeAllColor()
                R.id.box_ten_text -> changeAllColor()
                R.id.box_eleven_text -> changeAllColor()
                R.id.box_twelve_text -> changeAllColor()
                R.id.box_threeten_text -> changeAllColor()
                R.id.box_fourten_text -> changeAllColor()
                R.id.constraint_layout -> changeAllColor()
                else -> Toast.makeText(this, "Oprime en una figura", Toast.LENGTH_SHORT).show()
            }

    }

private fun changeAllColor() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)
        val boxElevenText = findViewById<TextView>(R.id.box_eleven_text)
        val boxTwelveText = findViewById<TextView>(R.id.box_twelve_text)
        val boxThreetenText = findViewById<TextView>(R.id.box_threeten_text)
        val boxFourtenText = findViewById<TextView>(R.id.box_fourten_text)
        val constLayout = findViewById<View>(R.id.constraint_layout)

        boxOneText.setBackgroundColor(randomColor())
        boxTwoText.setBackgroundColor(randomColor())
        boxThreeText.setBackgroundColor(randomColor())
        boxFourText.setBackgroundColor(randomColor())
        boxFiveText.setBackgroundColor(randomColor())
        boxSixText.setBackgroundColor(randomColor())
        boxSevenText.setBackgroundColor(randomColor())
        boxEightText.setBackgroundColor(randomColor())
        boxNineText.setBackgroundColor(randomColor())
        boxTenText.setBackgroundColor(randomColor())
        boxElevenText.setBackgroundColor(randomColor())
        boxTwelveText.setBackgroundColor(randomColor())
        boxThreetenText.setBackgroundColor(randomColor())
        boxFourtenText.setBackgroundColor(randomColor())
        constLayout.setBackgroundColor(randomColor())
}
~~~
Es de anotar que, programar estos ejemplos de esta manera no es muy recomendable. Es por ello que he creado el branch **viewBinding** donde podrás ver ese ejemplo haciendo uso de viewBinding.