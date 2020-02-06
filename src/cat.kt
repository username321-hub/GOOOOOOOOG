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



class cat(size:Int, catfood:Int, catcoins:Int) {
    var catfood=100
    var size = 0
    var deathcat = 0
    var catcoins = 100
    fun meow(){
        if (size <= 20) {
            println("|vasya|")
            println("meow")
        } else {
            println("|dibak|")
            println("MEOW")
        }
    }
    fun buycatfood(){
        println("вы можете купить"+ catcoins + "ед. кошачей еды, купите?")
        println("1.да")
        println("2.да")
        var e = readLine().toString().toInt()
        if (e==1){
            catcoins-=100
            catfood+=100
        }
    }
    fun eatcat(){
        if (catfood < 30) {
            println("у тебя не хватает кошачей еды, котик умер от")
            deathcat += 1
            mainnn(1)
        }
        if (size <= 20) {
            println("|vasya|")
            println("твой кот съел 20ед. кошачей еды")
            println("-20 cat food")
            catfood = catfood-20
            println (catfood)
        } else {
            if (catfood < 30) {
                println("у тебя не хватает кошачей еды, котик умер")
                deathcat += 1
                mainnn(1)
            }
            println("|dibak|")
            println("твой кот съел 50ед. кошачей еды")
            println("-50 cat food")
            catfood = catfood-50
            println (catfood)
        }
    }
    fun run(){
        if (size <= 20) {
            println("|vasya|")
            println("ваш кот побегал, устал и проголодался")
        } else {
            println("|dibak|")
            println("ваш кот побегал, очень устал и очень проголодался")
        }
    }
}