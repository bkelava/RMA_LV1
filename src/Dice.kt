class Dice(_number: Int, diceQueue: Int)
{
    val diceQueue = diceQueue;

    private var diceNumber = _number;
    var dicePass = false;

    fun setDiceNumber(_number_: Int)
    {
        this.diceNumber=_number_;
    }

    fun getDiceNumber(): Int {
        return diceNumber
    }

    fun dicePassed()
    {
        this.dicePass = !dicePass;
    }
}