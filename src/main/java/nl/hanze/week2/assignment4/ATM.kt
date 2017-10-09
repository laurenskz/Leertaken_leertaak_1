//// the context
//class assignment45 {
//    internal var state: ATMState? = null
//    private val amount = 100
//
//    // define an initial state
//    init {
//        state = IdleState()
//    }
//
//    internal fun insertCard() {
//        state!!.insertCard(this)
//    }
//
//    internal fun ejectCard() {
//        state!!.ejectCard(this)
//    }
//
//    internal fun insertPin() {
//        state!!.insertPin(this)
//    }
//
//    internal fun requestAmount() {
//        state!!.requestAmount(this)
//    }
//}
