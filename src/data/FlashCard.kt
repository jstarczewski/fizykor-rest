package data

import java.util.*

data class FlashCard(
    var section: String = "",
    var isMatura: Boolean = false,
    var title: String = "",
    var equation: String = "",
    var id: String = UUID.randomUUID().toString()
)