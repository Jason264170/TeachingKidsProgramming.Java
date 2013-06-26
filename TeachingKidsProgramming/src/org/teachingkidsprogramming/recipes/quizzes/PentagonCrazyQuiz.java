package org.teachingkidsprogramming.recipes.quizzes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonCrazyQuizGrader;
import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonQuiz;

public class PentagonCrazyQuiz extends PentagonQuiz
{
  public void thread()
  {
    Tortoise.move(6);
  }
  public void question2()
  {
    for (int i = 1; i <= 76; i++)
    {
      stitch();
    }
  }
  public void question3()
  {
    ColorWheel.addColor(Colors.Greens.Lime);
  }
  public void question4()
  {
    ColorWheel.addColor(Colors.Reds.Red);
  }
  public static void main(String[] args)
  {
    new PentagonCrazyQuizGrader().grade(new PentagonCrazyQuiz());
  }
}
