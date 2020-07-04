open class Mommy {
    val childFrom: Child = Child()

    fun mommyFunFromChild() {
        childFrom.interfaceBridge()
    }

    fun mommyOriginalFun() {
        println("===============================")
        println("This is original fun from Mommy")
    }
}