class dog (dogfood:Int, size2:Int, dogcoins:Int) {

    var dogfood = 100
    var size2 = 0
    var deathdog = 0
    var dogcoins = 100
    fun buydogfood() {
        println("вы можете купить " + dogcoins + "ед. собачей еды, купите?")
        println("1.да")
        println("2.нет")
        var d = readLine().toString().toInt()
        dogfood += d
        if (d == 1) {
            if (dogcoins == 100) {
                dogcoins -= dogcoins
                dogfood += 100
            } else {
                println("не, не, не, денег нет!")
            }
            if (d == 2) {
                println("вашим псам не хватило еды и они умерли, поздравляем!")
                println("GAME OVER")
                deathdog += 1
                mainnn(-1)
            }
        }
    }
    fun gav(){
        if (size2 <= 20) {
            println("|Tuzik|")
            println("тяф")
        } else {
            println("|Sharik|")
            println("ГАВ")
        }
    }
    fun plussize(){
        if (size2 <= 20) {
            println("|Tuzik|")
            println("+3 size")
        } else {
            println("|Sharik|")
            println("+5 size")
        }
    }
    fun eatdog(){
        if (dogfood < 30) {
            println("у тебя не хватает собачей еды, пёсь умер")
            deathdog += 1
            mainnn(1)
        }
        if (size2 <= 20) {
            println("|Tuzik|")
            println("твой песь съел 30ед. собачей еды")
            println("-30 dog food")
            dogfood = dogfood - 30
            println(dogfood)
        } else {
            if (dogfood < 30) {
                println("у тебя не хватает собачей еды, пёсь умер")
                deathdog += 1
                mainnn(1)
            }
            println("|Sharik|")
            println("твой песь съел 60ед. собачей еды")
            println("-60 dog food")
            dogfood = dogfood - 60
            println(dogfood)
        }
    }
    fun run1() {
        if (size2 <= 20) {
            println("|Tuzik|")
            println("ваш пёсь побегал, устал и хочет есть")
        } else {
            println("|Sharik|")
            println("ваш пёсь побегал, очень устал и очень хочет есть")
        }
    }
}
