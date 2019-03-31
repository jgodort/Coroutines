import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        //This part is launched in background.
        delay(1000L) // non-blocking delay for 1 second.
        println("World!")
    }

    println("Hello,")
    Thread.sleep(2000L) //Blocking the main thread by 2 seconds.
}