/*
       ДАРОВА! ИДИ ОТСЮДА ПОДАЛЬШЕ, ТВАРЬ!!!
       ДАРОВА! ИДИ ОТСЮДА ПОДАЛЬШЕ, ТВАРЬ!!!
       ДАРОВА! ИДИ ОТСЮДА ПОДАЛЬШЕ, ТВАРЬ!!!
       ДАРОВА! ИДИ ОТСЮДА ПОДАЛЬШЕ, ТВАРЬ!!!
       ДАРОВА! ИДИ ОТСЮДА ПОДАЛЬШЕ, ТВАРЬ!!!
       ДАРОВА! ИДИ ОТСЮДА ПОДАЛЬШЕ, ТВАРЬ!!!
       ДАРОВА! ИДИ ОТСЮДА ПОДАЛЬШЕ, ТВАРЬ!!!
       ВЕРНИ ХОМЯКА, МРАЗЬ!!!
 */



class horse (size5:Int) {
    //var a = readLine().toString().toInt()
    var size5 = 0
    var deathhorse = 0
    fun rzhomba() {
        if (size5 >= 20) {
            println("|loshadka|")
            println("*тихо ржёт*")
        } else {
            println("|LOSHAD|")
            println("*РЖОТ ТУПА*")
        }
    }
    fun plushorsesize(){
        if (size5 >= 20) {
            println("|loshadka|")
            println("+5 size")
        } else {
            println("|LOSHAD|")
            println("+10 size")
        }
    }
    fun eathorse(sar: Saray){
        if (size5 <= 20) {
            if (sar.grass < 40) {
                println("у тебя не хватает травы, лошадь умерла")
                deathhorse += 1
            }
            println("|loshadka|")
            println("Твоя лошадь съела 40ед. травы")
            sar.grass = sar.grass - 40
            println("-40 grass")
            println(sar.grass)
        } else {
            println("|LOSHAD|")
            sar.grass = sar.grass - 80
            println("Твоя лошадь съела 80ед. травы")
            println("-80 grass")
            println(sar.grass)
            if (sar.grass < 40) {
                println("у тебя не хватает травы, лоадь умерла")
                deathhorse += 1
            }
        }
    }

}
