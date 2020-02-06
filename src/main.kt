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





fun main(){
    var deathhom = 0
    println("сколько дней взять в расчёт?")
    var days = readLine().toString().toInt()
    var i = 0
    mainnn(days)
    var sar = Saray()
    ///cats
    //vasya(cat)

   /* for (i in 0..a){

    }*/
}
fun mainnn(a: Int) {
    //cats
    var vasya: cat = cat(50, 100, 100)
    var dibak: cat = cat(20, 100, 100)
    //cows
    var muma: cow = cow(50)
    var mumu: cow = cow(10)
    //dogs
    var tuzik: dog = dog(100, 10, 100)
    var Sharik: dog = dog(100, 40, 100)
    //homyaki
    var homa: homyak = homyak(5)
    var homochka: homyak = homyak(21)
    //horses
    var loshadka: horse = horse(15)
    var LOSHAD: horse = horse(50)
    var b = 1
    var countt = 1
    var cccount = 0
    for (i in 0..a) {
        if (homa.deathhom >= 1) {
            println("ваш хомяк мёртв, вам должно быть стыдно!")
            println("GAME OVER")
            cccount += 1
            break
        }
        if (homochka.deathhom >= 1) {
            println("ваш хомяк мёртв, вам должно быть стыдно!")
            println("GAME OVER")
            cccount += 1
            break
        }
        if (mumu.deathhcow >= 1) {
            println("ваша корова мертва, вам должно быть стыдно!")
            println("GAME OVER")
            cccount += 1
            break
        }
        if (muma.deathhcow >= 1) {
            println("ваша корова мертва, вам должно быть стыдно!")
            println("GAME OVER")
            cccount += 1
            break
        }
        if (LOSHAD.deathhorse >= 1) {
            println("ваша лошадь мертва, вам должно быть стыдно!")
            println("GAME OVER")
            cccount += 1
            break
        }
        if (loshadka.deathhorse >= 1) {
            println("ваша лошадь мёртва, вам должно быть стыдно!")
            println("GAME OVER")
            cccount += 1
            break
        }
        if (tuzik.deathdog >= 1) {
            println("ваша собака мёртва, вам должно быть стыдно!")
            println("GAME OVER")
            cccount += 1
            break
        }
        if (Sharik.deathdog >= 1) {
            println("ваша собака мёртва, вам должно быть стыдно!")
            println("GAME OVER")
            cccount += 1
            break
        }
        if (vasya.deathcat >= 1) {
            println("ваш котик мёртв, вам должно быть стыдно!")
            println("GAME OVER")
            cccount += 1
            break
        }
        if (dibak.deathcat >= 1) {
            println("ваш котик мёртв, вам должно быть стыдно!")
            println("GAME OVER")
            cccount += 1
            break
        }

        println("||day " + countt.toString() + "||")
        b += 1
        //println("CATS")


        fun catdoingsmthing() {
            println(
                "что будет делать ваш кот?" +
                        " 1.мяукать" +
                        " 2.бегать" +
                        " 3.кушац"
            )
            var catvybor = readLine().toString().toInt()
            if (catvybor == 1) {
                vasya.meow()
            }
            if (catvybor == 2) {
                vasya.run()
            }
            if (catvybor == 3) {
                vasya.eatcat()
            }
        }


        fun catdoingsmthingg() {
            println(
                "что будет делать ваш второй кот?" +
                        " 1.мяукать" +
                        " 2.бегать" +
                        " 3.кушац"
            )
            var catvyborr = readLine().toString().toInt()
            if (catvyborr == 1) {
                dibak.meow()
            }
            if (catvyborr == 2) {
                dibak.run()
            }
            if (catvyborr == 3) {
                dibak.eatcat()
            }
        }
        catdoingsmthing()
        catdoingsmthingg()

        //dibak(cat)
        // dibak.meow()
        //dibak.run()
        //dibak.eatcat()

        ///cows
        //muma(cow)
        //println("COWS")


        fun cowdoingsmthingg() {
            println(
                "что будет делать ваша корова?" +
                        " 1.мычать" +
                        " 2.кушац"
            )

            var cowvyborr = readLine().toString().toInt()
            if (cowvyborr == 1) {
                mumu.muu()
            }
            if (cowvyborr == 2) {
                mumu.eatcow(sar = Saray())
                mumu.pluscowsize()
                mumu.givemilk()
            }
        }


        fun cowdoingsmthing() {
            println(
                "что будет делать ваша корова?" +
                        " 1.мычать" +
                        " 2.кушац"
            )

            var cowvyborr = readLine().toString().toInt()
            if (cowvyborr == 1) {
                muma.muu()
            }
            if (cowvyborr == 2) {
                muma.eatcow(sar = Saray())
                muma.pluscowsize()
                muma.givemilk()
            }
        }
        cowdoingsmthing()
        cowdoingsmthingg()
        fun dogdoingsmthing() {
            println(
                "что будет делать ваш пёсь?" +
                        " 1.лаять" +
                        " 2.бегать" +
                        " 3.кушац"
            )
            var dogvybor = readLine().toString().toInt()
            if (dogvybor == 1) {
                tuzik.gav()
            }
            if (dogvybor == 2) {
                tuzik.run1()
            }
            if (dogvybor == 3) {
                tuzik.eatdog()
            }
        }


        fun dogdoingsmthingg() {
            println(
                "что будет делать ваш второй пёсь?" +
                        " 1.лаять" +
                        " 2.бегать" +
                        " 3.кушац"
            )
            var dogvyborr = readLine().toString().toInt()
            if (dogvyborr == 1) {
                Sharik.gav()
            }
            if (dogvyborr == 2) {
                Sharik.run1()
            }
            if (dogvyborr == 3) {
                Sharik.eatdog()
                Sharik.plussize()
            }
        }
        dogdoingsmthing()
        dogdoingsmthingg()

        fun hhorsedoingsmthing() {
            println(
                "что будет делать ваша лошадь?" +
                        " 1.ржать" +
                        " 2.кушац"
            )

            var horsevyborr = readLine().toString().toInt()
            if (horsevyborr == 1) {
                loshadka.rzhomba()
            }
            if (horsevyborr == 2) {
                loshadka.eathorse(sar = Saray())
                loshadka.plushorsesize()
            }
        }


        fun horsedoingsmthingg() {
            println(
                "что будет делать вашв второая лошадь?" +
                        " 1. ржать" +
                        " 2. кушац"
            )
            var horsevyborr = readLine().toString().toInt()
            if (horsevyborr == 1) {
                LOSHAD.rzhomba()
            }
            if (horsevyborr == 2) {
                LOSHAD.eathorse(sar = Saray())
                LOSHAD.plushorsesize()
            }
        }
        hhorsedoingsmthing()
        horsedoingsmthingg()
        fun homadoingsmthing() {
            println(
                "что будет делать ваш хомяк?" +
                        " 1.пищать" +
                        " 2.бегать" +
                        " 3.кушац"
            )

            var horsevyborr = readLine().toString().toInt()
            if (horsevyborr == 1) {
                loshadka.rzhomba()
            }
            if (horsevyborr == 2) {
                loshadka.eathorse(sar = Saray())
                loshadka.plushorsesize()
            }
        }


        fun homadoingsmthingg() {
            println(
                "что будет делать ваш второй хомяк?" +
                        " 1.пищать" +
                        " 2.бегать" +
                        " 3.кушац"
            )
            var homavyborr = readLine().toString().toInt()
            if (homavyborr == 1) {
                homa.pisk()
            }
            if (homavyborr == 2) {
                homa.run3()
            }
            if (homavyborr == 3) {
                homa.eathom()
            }
        }
        homadoingsmthing()
        homadoingsmthingg()
        //muma.muu()
        //muma.eatcow(sar=Saray())
        //muma.givemilk()
        // muma.pluscowsize()
        // muma.size1 += 5
        //mumu(cow)
        // mumu.muu()
        //  mumu.eatcow(sar=Saray())
        /// mumu.givemilk()
        // mumu.pluscowsize()
        // mumu.size1 += 10
        ///dogs
        //Tuzik
        //println("DOGS")

        //tuzik.buydogfood()
        //tuzik.gav()
        //tuzik.run1()
        // tuzik.eatdog()
        //tuzik.plussize()
        // tuzik.size2 += 3
        // println(tuzik.size2)
        //Sharik


        //Sharik.gav()
        //Sharik.run1()
        //Sharik.eatdog()
        //Sharik.plussize()
        //Sharik.size2 += 5
        //println(Sharik.size2)
        //homyaki
        //println("HOMYAKI")


        //homa.pisk()
        //homa.eathom()
        //homa.run3()


        //homochka.pisk()
        //homochka.eathom()
        //homochka.run3()
        //horses
        //println("horses")

        //loshadka.rzhomba()
        //loshadka.plushorsesize()
        //loshadka.eathorse(sar=Saray())
        //loshadka.size5 += 5


        //LOSHAD.rzhomba()
        //LOSHAD.plushorsesize()
        //LOSHAD.eathorse(sar=Saray())
        //LOSHAD.size5 += 10
        countt += 1
        if (cccount >= 1) {
            break
        } else {
            println("|вы удачно закончили день! Все живы!|")
        }
    }
}