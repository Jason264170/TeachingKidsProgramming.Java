package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Turtle;

public class TurtleTree
{
  public static void main(String[] args)
  {
    Turtle turtle = new Turtle();
    turtle.setSpeed(10);
    turtle.getBackgroundWindow().setBackground(Colors.Grays.Black);
    int branchLength = 60;
    drawBranch(turtle, branchLength);
  }
  private static void drawBranch(Turtle turtle, int branchLength)
  {
    if (0 < branchLength)
    {
      adjustColor(turtle, branchLength);
      turtle.move(branchLength);
      drawLowerBranches(turtle, branchLength);
    }
  }
  private static void adjustColor(Turtle turtle, int branchLength)
  {
    if (branchLength == 10)
    {
      turtle.setPenColor(Colors.Greens.Lime);
    }
    if (branchLength == 20)
    {
      turtle.setPenColor(Colors.Greens.ForestGreen);
    }
    if (branchLength == 30)
    {
      turtle.setPenColor(Colors.Greens.DarkGreen);
    }
    if (branchLength == 40)
    {
      turtle.setPenColor(Colors.Greens.Olive);
    }
    if (branchLength == 50)
    {
      turtle.setPenColor(Colors.Browns.Sienna);
    }
    if (branchLength == 60)
    {
      turtle.setPenColor(Colors.Browns.SaddleBrown);
    }
  }
  private static void drawLowerBranches(Turtle turtle, int branchLength)
  {
    turtle.turn(30);
    drawShorterBranch(turtle, branchLength);
    turtle.turn(-60);
    drawShorterBranch(turtle, branchLength);
    turtle.turn(30);
    adjustColor(turtle, branchLength);
    turtle.move(-branchLength);
  }
  private static void drawShorterBranch(Turtle turtle, int branchLength)
  {
    drawBranch(turtle, branchLength - 10);
  }
}