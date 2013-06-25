package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Turtle;

import com.spun.util.NumberUtils;

public class TurtleTree
{
  public static void main(String[] args)
  {
    Turtle turtle = new Turtle();
    turtle.setY(turtle.getY() - 20);
    turtle.setSpeed(10);
    turtle.getBackgroundWindow().setBackground(Colors.Grays.Black);
    int branchLength = 70;
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
    if (branchLength <= 10)
    {
      turtle.setPenWidth(1);
      turtle.setPenColor(Colors.Greens.Lime);
    }
    else if (branchLength <= 20)
    {
      turtle.setPenWidth(2);
      turtle.setPenColor(Colors.getRandomColor());
    }
    else if (branchLength <= 30)
    {
      turtle.setPenWidth(4);
      turtle.setPenColor(Colors.Greens.DarkGreen);
    }
    else if (branchLength <= 40)
    {
      turtle.setPenWidth(6);
      turtle.setPenColor(Colors.getRandomColor());
    }
    else if (branchLength <= 50)
    {
      turtle.setPenWidth(8);
      turtle.setPenColor(Colors.Browns.Sienna);
    }
    else if (branchLength <= 60)
    {
      turtle.setPenWidth(10);
      turtle.setPenColor(Colors.Browns.SaddleBrown);
    }
  }
  private static void drawLowerBranches(Turtle turtle, int branchLength)
  {
    int rightAngle = NumberUtils.getRandomInt(10, 60);
    turtle.turn(rightAngle);
    drawShorterBranch(turtle, branchLength);
    int leftAngle = -NumberUtils.getRandomInt(10, 60);
    turtle.turn(leftAngle - rightAngle);
    drawShorterBranch(turtle, branchLength);
    turtle.turn(-leftAngle);
    adjustColor(turtle, branchLength);
    turtle.move(-branchLength);
  }
  private static void drawShorterBranch(Turtle turtle, int branchLength)
  {
    int difference = 10;
    drawBranch(turtle, branchLength - difference);
  }
}