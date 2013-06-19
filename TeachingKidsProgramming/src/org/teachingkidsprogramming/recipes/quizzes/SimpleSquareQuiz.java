package org.teachingkidsprogramming.recipes.quizzes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.SimpleSquareQuizGrader;
import org.teachingkidsprogramming.recipes.quizzes.graders.SquareQuiz;

public class SimpleSquareQuiz implements SquareQuiz
{
  public void question1()
  {
    Tortoise.turn(360.0 / 5);
  }
  public void question2()
  {
    Tortoise.move(110);
  }
  public void question3()
  {
    Tortoise.setPenColor(Colors.Yellows.Yellow);
  }
  public void question4()
  {
    Tortoise.setPenWidth(5);
  }
  public static void main(String[] args)
  {
    new SimpleSquareQuizGrader().grade(new SimpleSquareQuiz());
  }
}
