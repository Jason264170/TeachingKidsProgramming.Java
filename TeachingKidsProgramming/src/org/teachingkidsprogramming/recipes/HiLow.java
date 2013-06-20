package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    //    Do the following 8 times --#9
    int randomNumber = (int) Math.floor(Math.random() * 101);
    for (int i = 0; i <= 8; i++)
    {
      int userGuess = MessageBox.askForNumericalInput("Guess a Number.");
      if (userGuess == randomNumber)
      {
        Sounds.playBeep();
        MessageBox.showMessage("Wow I can't believe you won. Man, they let anyone win these days...");
        break;
      }
      else if (userGuess > randomNumber)
      {
        MessageBox.showMessage("YOUR GUESS WAS TOO HIGH!!!!! WHAT ARE YOU, CRAZY?");
      }
      else if (userGuess < randomNumber)
      {
        MessageBox.showMessage("YOUR GUESS WAS TOO LOW!!!! WEAKLING, HAVE STRONGER NUMBERS!!!");
      }
    }
    MessageBox.showMessage("FAILURE!!! YOUR PARENTS WILL NEVER LOVE YOU!");
  }
}
