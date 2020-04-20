//RULES OF YAHTZEE ON CROATIAN: http://www.pjesmicezadjecu.com/drustvene-igre-pravila-igre/yumb-jamb.html

class Yahtzee()
{
    private lateinit var dice : Array<Dice>
    var throws = 0

    fun getDice (): Array<Dice>
    {
        return dice
    }

    fun setDice () {
        dice = Array(6) { i -> Dice(1,i) }
    }

    fun NextThrow()
    {
        throws=throws+1
    }

    public final fun getDiceThrows(): Int {
        return throws
    }


    fun throwDice()
    {
        for (i in 0 until 6)
        {
            if (!dice[i].dicePass)
            {
                dice[i].setDiceNumber((1..6).random())
                println("Dice[${dice[i].diceQueue +1 }] -> Number[${dice[i].getDiceNumber()}]")
            }

            NextThrow()
        }
    }

    fun display()
    {
        for (i in 0 until 6)
        {
            print("${dice[i].getDiceNumber()}")
        }
        println(" ")
    }

    fun isYahtzee() : Boolean
    {
        var _score = Array(6) {0}

        for (dice in dice)
        {
            if (dice.getDiceNumber() == 1)
                _score[0]= _score[0]+1
            else if (dice.getDiceNumber() == 2)
                _score[1]= _score[1]+2
            else if (dice.getDiceNumber() == 3)
                _score[2]= _score[2]+3
            else if (dice.getDiceNumber() == 4)
                _score[3]= _score[3]+4
            else if (dice.getDiceNumber() == 5)
                _score[4]= _score[4]+5
            else if (dice.getDiceNumber() == 6)
                _score[5]= _score[5]+6
        }

        if (_score[0]==5 || _score[1]==10 || _score[2]==15 || _score[3]==20 || _score[4]==25 || _score[5]==30)
        {
            println("YAHTZEE")
            return true
        }

        return false
    }

    fun isBigScale(): Boolean {
        var _score=Array(6){0}
        for (dice in dice) {
            if (dice.getDiceNumber()== 1)
                _score[0]= 1
            else if (dice.getDiceNumber() == 2)
                _score[1]= 2
            else if (dice.getDiceNumber() == 3)
                _score[2]= 3
            else if (dice.getDiceNumber() == 4)
                _score[3]= 4
            else if (dice.getDiceNumber() == 5)
                _score[4]= 5
            else if (dice.getDiceNumber() == 6)
                _score[5]= 6
        }
        if (_score[0]==1 && _score[1]==2 && _score[2]==3 && _score[3]==4 && _score[4]==5)
        {
            println("SMALL SCALE")
            return true
        }
        return false
    }

    fun isSmallScale(): Boolean {
        var _score=Array(6){0}
        for (dice in dice) {
            if (dice.getDiceNumber()== 1)
                _score[0]= 1
            else if (dice.getDiceNumber() == 2)
                _score[1]= 2
            else if (dice.getDiceNumber() == 3)
                _score[2]= 3
            else if (dice.getDiceNumber() == 4)
                _score[3]= 4
            else if (dice.getDiceNumber() == 5)
                _score[4]= 5
            else if (dice.getDiceNumber() == 6)
                _score[5]= 6
        }
        if (_score[1]==2 && _score[2]==3 && _score[3]==4 && _score[4]==5 && _score[5]==6) {
            println("SMALL SCALE")
            return true
        }
        return false
    }
}