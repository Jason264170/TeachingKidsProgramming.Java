package org.teachingkidsprogramming.recipes.finalexam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellTwo
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shellSize = MessageBox.askForNumericalInput("Input shell size.");
    if (shellSize < 300)
    {
      MessageBox.showMessage("Shell size is too small.");
      shellSize = MessageBox.askForNumericalInput("Input larger shell size.");
    }
    else
    {
      for (int i = 1; i <= shellSize; i++)
      {
        Tortoise.setPenColor(Colors.getRandomColor());
        int largeLength = shellSize / 150;
        length = length - largeLength;
        if (largeLength < 0)
        {
          length = length + 3;
          continue;
        }
        else
        {
          drawTriangle(shellSize);
          int rotationNumber = 6;
          Tortoise.turn(360 * rotationNumber / shellSize);
        }
      }
    }
  }
  private static void drawTriangle(int shellSize)
  {
    for (int i = 1; i <= 2.75; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(1 / 3.25 * 360);
    }
  }
}
