package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
	  Tortoise.setSpeed(10);
	  createColorPalette();
	  drawPentagon();
  }

private static void drawPentagon() {
	for (int i = 0; i <= 200; i++)
	  	{
				
				
			  adjustPen();
			  int sideLength = i;
			  Tortoise.move(sideLength);
			  Tortoise.turn(360/5);
			  Tortoise.turn(1);
	  	}
}

private static void adjustPen() {
	Tortoise.setPenColor(ColorWheel.getNextColor());
	  Tortoise.setPenWidth(3);
	  if (Tortoise.getPenWidth() > 4) 
	  {
		Tortoise.setPenWidth(1);
	  }
}

private static void createColorPalette() {
	ColorWheel.addColor(Colors.Blues.SteelBlue);
	  ColorWheel.addColor(Colors.Purples.DarkOrchid);
	  ColorWheel.addColor(Colors.Blues.DarkSlateBlue);
	  ColorWheel.addColor(Colors.Blues.Teal);
	  ColorWheel.addColor(Colors.Purples.Indigo);
}
}
