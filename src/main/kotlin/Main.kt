import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.EnumSet.range

fun main(args: Array<String>) {
    val random = random()

    println("숫자 야구를 시작합니다.")

    while(true){
        print("숫자를 입력해주세요 : ")
        val input : String? = readLine()
        inputException(input)
        val inputList = transList(input)


        val ball = ballOrStrike(random, inputList)[0]
        val strike = ballOrStrike(random, inputList)[1]

        printBallOrStrike(ball, strike)
        if (threeStrike(strike)){
            break
        }
    }
}


fun random() : MutableList<Int>{
    val randomList = mutableListOf<Int>()
    while (randomList.size < 3){
        val randomNum = (1..9).random()
        if(!randomList.contains(randomNum)){
            randomList.add(randomNum)
        }
    }

    return randomList
}

fun transList(input : String?) : MutableList<Int>{
    val inputList = mutableListOf<Int>()
    val numInput = input?.toInt() ?: throw IllegalArgumentException("어플리케이션을 종료합니다.")
    val hundred = numInput / 100
    val ten = (numInput - hundred * 100) / 10
    val one = numInput % 10

    inputList.add(hundred)
    inputList.add(ten)
    inputList.add(one)
    return inputList

}

fun ballOrStrike(random : MutableList<Int>, input : MutableList<Int>) : Array<Int>{
    var ball = 0
    var strike = 0

    for (i in 0..2){
        if (input[i] in random){
            if (input[i] == random[i]){
                strike += 1
            }
            else {
                ball += 1
            }
        }
    }
    val array = arrayOf(ball, strike)
    return array

}

fun printBallOrStrike(ball : Int, strike : Int){
    if (ball != 0 && strike != 0){
        println("${ball}볼 ${strike}스트라이크")
    }
    else if (ball != 0 && strike == 0){
        println("${ball}볼")
    }
    else if (ball == 0 && strike != 0){
        println("${strike}스트라이크")
    }
    else println("낫싱")
}

fun threeStrike(strike : Int) : Boolean {
    if (strike == 3) {
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요")
        val reStart = readLine()!!.toInt()
        return if (reStart == 2) true else false
    } else {
        return false
    }
}

fun inputException(input : String?){
    if (input?.length != 3){
        throw IllegalArgumentException("어플리케이션을 종료합니다.")
    }
    if (!input.all{it.isDigit()}){
        throw IllegalArgumentException("어플리케이션을 종료합니다.")
    }

    for (i in input.indices-1){
        if(input[i] == input[i+1]){
            throw IllegalArgumentException("어플리케이션을 종료합니다.")
        }
    }

}