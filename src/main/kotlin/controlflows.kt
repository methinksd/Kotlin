fun main() {
    var number=56
    if (number<40){
        println("You don't qualify")
    }else{
        println("You qualify")
    }
    //bio marks
    val marks=75
    if (marks<=50){
        println("Kuja kwa Departmentaa")
    }
    else if (marks>50 && marks<=60){
        println("Uko na mchezo,kujia viboko shift two")
    }
    else if (marks>60 && marks<=70){
        println("Medicine is not for the lazy, work harder kijana")
    }
    else if (marks>70 && marks<=80){
        println("Good,keep it up")
    }
    else if (marks>80 && marks<=100){
        println("Come for a loaf")
    }
    else {
        println("You are a lost cause!!")
    }
}
