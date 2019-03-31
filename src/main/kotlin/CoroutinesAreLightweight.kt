import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Launch 100K coroutines and after a second, each coroutine prints a dot.
 */
fun main() = runBlocking {
    repeat(100_000) {
        //Launch a lot of coroutines.
        launch {
            delay(1000L)
            print(".")
        }
    }
}