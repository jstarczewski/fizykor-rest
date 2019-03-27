package data

import java.util.*

data class Equation(
    var section: String = "",
    var title: String = "",
    var equation: String = "",
    var id: String = UUID.randomUUID().toString()

)