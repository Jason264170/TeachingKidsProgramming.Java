package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Spiral
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    ColorWheel.addColor(Colors.Purples.BlueViolet);
    ColorWheel.addColor(Colors.Purples.Violet);
    ColorWheel.addColor(Colors.Purples.Purple);
    for (int i = 1; i <= 75; i++);
    {
    }
    //    Do the following 75 times --#3
    //         Change the color of the line the tortoise draws the next color on the Color Wheel --#7
    //         Move the tortoise 5 times the current line number you are drawing --#5
    //         Turn the tortoise 1/3 of 360 degrees to the right --#2
  }
}
