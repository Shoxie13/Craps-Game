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

public class TestCraps {
    public static void main(String[] args) {

		Craps cr = new Craps();

        System.out.println("Your program acts as a single player.");
        System.out.println("You rolled " + cr.FirstDice() + " + " + cr.SecondDice() + " = " + cr.DiceSum());

        switch (cr.DiceSum()) {
            case 2:
                System.out.println("Craps, Better Luck Next Time, you lose!");
                break;
            case 3:
                System.out.println("Craps, Better Luck Next Time, you lose!");
                break;
            case 7:
                System.out.println("Congratulations, you win!");
                break;
            case 11:
                System.out.println("Congratulations, you win!");
                break;
            case 12:
                System.out.println("Craps, Better Luck Next Time, you lose!");
                break;
            default:
                int storedSum = cr.DiceSum();
                System.out.println("Point is (established) set to " + storedSum);

                cr.EvalDice(storedSum, cr.DiceSum());
                break;
        }
	}
}
