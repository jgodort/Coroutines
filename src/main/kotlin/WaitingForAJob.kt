import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*fun main()= runBlocking<Unit>{

    val job = GlobalScope.launch {
        delay(1000L)
        println("World!")
    }//Launch new coroutine and keep a reference to its job.

    println("Hello,")
    job.join()// wait until child coroutine completes

}*/


//Simpler way to do that is using the CoroutineScope of runBlocking.
fun main() = runBlocking {
    this.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
}