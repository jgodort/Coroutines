import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*fun main() {
    GlobalScope.launch {
        //Coroutine launched in background.
        delay(1000L)
        println("World!")
    }

    println("Hello,")
    runBlocking {
        //This blocks the main thread
        delay(2000L)
    }
}
*/

//Idiomatic way
fun main() = runBlocking<Unit> {
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    delay(2000L)
}