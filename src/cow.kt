
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


class cow (size1:Int) {
    //var b = readLine().toString().toInt()
    var size1 = 0
    var milk  = 0
    var deathhcow = 0
    fun muu() {
        if (size1 >= 20) {
            println("|muma|")
            println("Муу")
        } else {
            println("|mumu|")
            println("МУУ")
        }
    }
    fun pluscowsize(){
        if (size1 >= 20) {
            println("|muma|")
            println("+5 size")
        } else {
            println("|mumu|")
            println("+10 size")
        }
    }
    fun eatcow(sar:Saray){
        if (sar.grass < 30) {
            println("у тебя не хватает травы, корова умерла")
            deathhcow += 1
        }
        if (size1 <= 20) {
            println("|muma|")
            println("Твоя корова съела 50ед. травы")
            sar.grass = sar.grass - 50
            println("-50 grass")
            println(sar.grass)
        } else {
            if (sar.grass < 30) {
                println("у тебя не хватает травы, корова умерла")
                deathhcow += 1
            }
            println("|mumu|")
            sar.grass = sar.grass - 100
            println("Твоя корова съла 100ед. травы")
            println("-100 grass")
            println(sar.grass)
        }
    }
    fun givemilk(){
        if (size1 <= 20) {
            milk = milk + 50
            println("|muma|")
            println("Твоя корова дала 100ед. молока")
            println("+50 milk")
            println(milk)
        } else {
           milk = milk + 100
            println("|mumu|")
            println("Твоя корова дала 100ед. молока")
            println("+100 milk")
            println(milk)
        }
    }

}