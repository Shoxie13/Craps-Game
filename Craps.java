/**********************************************
Workshop 1
Course: JAC444 - Semester 4
Last Name: Abdi
First Name: Tareq
ID: 123809196
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature - TA
Date: 18/01/2022
**********************************************/

package workshop1;

import java.lang.Math;

public class Craps {
    final int LOWDICENUM = 1;
    final int HIGHDICENUM = 6;
    int dice1, dice2;
    
    //Constructor
    public Craps() {
        this.dice1 = 0;
        this.dice2 = 0;
    }

    //Rolling the dice
    public int DiceRoll() {
        int value = (int)Math.floor(Math.random()*(HIGHDICENUM-LOWDICENUM+LOWDICENUM)+LOWDICENUM);

        return value;
    }

    //Return First dice only
    public int FirstDice() {
        return this.dice1 = DiceRoll();
    }

    //Return Second dice only
    public int SecondDice() {
        return this.dice2 = DiceRoll();
    }

    //The two dices are added together
    public int DiceSum() {
        int sum;
        sum = this.dice1 + this.dice2;
        return sum;
    }

    public void EvalDice(int storedValue, int diceSum) {
        while (diceSum != 7 || storedValue == diceSum) {
            System.out.println("You rolled " + FirstDice() + " + " + SecondDice() + " = " + DiceSum());

            if (DiceSum() == 7) {
                System.out.println("Craps, Better Luck Next Time, you lose!");
                break;
            } else if (DiceSum() == storedValue) {
                System.out.println("Congratulations, you win!");
                break;
            }
        }
    }
}
