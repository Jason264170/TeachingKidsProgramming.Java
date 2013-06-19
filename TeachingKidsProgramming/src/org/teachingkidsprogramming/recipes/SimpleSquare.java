package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int sides = MessageBox.askForNumericalInput("How many sides?");
    for (int i = 1; i <= sides; i++)
    {
      Tortoise.setPenColor(Colors.getRandomColor());
      Tortoise.setPenWidth(i * 3.5);
      Tortoise.move(i * 5);
      Tortoise.turn(-360.0 * 3 / sides);
    }
  }
}
