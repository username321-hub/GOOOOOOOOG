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

class homyak(size3:Int) {
    var homfood=100
    var size3 = 0
    var deathhom = 0
    var homcoins = 100
    fun pisk(){
        if (size3 <= 20) {
            println("|vasya|")
            println("meow")
        } else {
            println("|dibak|")
            println("MEOW")
        }
    }
    fun buyhomfood(){
        println("вы можете купить"+ homcoins + "ед. кошачей еды, купите?")
        println("1.да")
        println("2.да")
        var e = readLine().toString().toInt()
        if (e==1){
            homcoins-=100
            homfood+=100
        }
    }
    fun eathom(){
        if (homfood < 30) {
            println("у тебя не хватает кошачей еды, котик умер от")
            deathhom += 1
            mainnn(1)
        }
        if (size3 <= 20) {
            println("|vasya|")
            println("твой кот съел 20ед. кошачей еды")
            println("-20 cat food")
            homfood = homfood-20
            println (homfood)
        } else {
            if (homfood < 30) {
                println("у тебя не хватает кошачей еды, котик умер")
                deathhom += 1
                mainnn(1)
            }
            println("|dibak|")
            println("твой кот съел 50ед. кошачей еды")
            println("-50 cat food")
            homfood = homfood-50
            println (homfood)
        }
    }
    fun run3(){
        if (size3 <= 20) {
            println("|vasya|")
            println("ваш кот побегал, устал и проголодался")
        } else {
            println("|dibak|")
            println("ваш кот побегал, очень устал и очень проголодался")
        }
    }
}
