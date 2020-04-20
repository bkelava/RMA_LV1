fun main(args: Array<String>)
{
    //println("Hello Kotlin")

    var nextThrow="n"
    val newGame = Yahtzee()
    newGame.setDice()

    //println("LINE FOR RUNING PROGRAM FROM CMD (BOZIDAR KELAVA): java -jar C:\\Users\\Kelava\\IdeaProjects\\RMALV1\\out\\artifacts\\RMALV1_jar\\RMALV1.jar")

    println("YAHTZEE GAME")
    do
    {
        if (newGame.isYahtzee() || newGame.isBigScale() || newGame.isSmallScale())
        {
            newGame.display()
            println("keep playing [press y for YES, or n for NO]: ")
            val _answer = readLine()!!.toLowerCase()
            if (_answer == "n")
                break
        }

        println("locking dice?[press y for YES, or n for NO]")
        var _answer_ =readLine()!!.toLowerCase()
        if (_answer_ == "y")
        {
            println("type how many: ")
            var _rollAnswer =readLine()!!.toInt()
            for (i in 0 until _rollAnswer)
            {
                println("which do you want to reroll: ")
                var _answerINT = readLine()!!.toInt()
                newGame.getDice()[_answerINT-1].dicePassed()
            }
        }

        if (newGame.getDiceThrows() <= 3)
        {
            println("throw again? [press y for YES, or n for NO]: ")
            nextThrow = readLine()!!.toLowerCase()
            if (nextThrow == "y")
                newGame.throwDice()
        }
    }while(newGame.getDiceThrows() <= 3)
}