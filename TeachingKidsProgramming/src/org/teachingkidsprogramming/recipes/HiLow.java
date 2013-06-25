package org.teachingkidsprogramming.recipes;

import java.util.Random;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    int correctnumber = new Random().nextInt(100);
    int numberOfGuesses = 8;
    for (int i = 1; i <= numberOfGuesses; i++)
    {
      int chancesLeft = numberOfGuesses + 1 - i;
      int guess = MessageBox.askForNumericalInput("Guess a number. (" + chancesLeft + " left)");
      if (guess < 1 || 100 < guess)
        MessageBox.showMessage("Your number " + guess + " is not between 1 and 100.");
      if (guess == correctnumber)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      else if (correctnumber < guess)
      {
        MessageBox.showMessage("Too high.");
      }
      else
      {
        MessageBox.showMessage("Too low.");
      }
    }
    MessageBox.showMessage("You lose. Correct answer: " + correctnumber);
  }
}
