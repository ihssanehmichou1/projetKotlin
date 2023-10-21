package tp3

fun main(){
    fun String.remoteFirstAndLastChar(): String{
        var last:Int = this.length
        var first:Int =0
        return this.substring(first+1,last-1)
    }
    val inputString = "ihssane Hmichou"
    val outputString = inputString.remoteFirstAndLastChar()
    println(outputString)
}