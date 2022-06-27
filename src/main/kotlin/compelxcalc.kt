import java.util.*

fun main() {
    val reader=Scanner(System .`in`,"in")
    print("Enter two numbers : ")

    //nextDouble() reads the next Double from the keyboard
    val first=reader.nextDouble()
    val second=reader.nextDouble()

    print("Enter an operator(+,-,*,/): ")
    val operator = reader.next()[0]

    val result: Double = when (operator){
        '+' -> first + second
        '-' -> first - second
        '*' -> first * second
        '/' -> first / second
        //operator doesn't match any case constant(+,-,*,/)
        else -> {
            System.out.printf("Error! operator is not correct")
            return
        }
    }
    System.out.printf("%.1f %C %.1f =%.1f", first, operator, second, result)
}