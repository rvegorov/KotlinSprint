package org.example.lesson_15

abstract class ShopItem {
    abstract val price: Float
    abstract val amount: Int
}

interface HasSearch {
    fun search()
}

class musicalInstrument(
    override val price: Float,
    override val amount: Int
) : HasSearch, ShopItem() {
    override fun search() {
        println("Выполняется поиск")
    }
}

class musicalInstrumentPart(
    override val price: Float,
    override val amount: Int
) : ShopItem()
