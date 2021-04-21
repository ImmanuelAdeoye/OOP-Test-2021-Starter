package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	//create a ArrayList
	//ArrayList<string> note = new ArrayList<string>();

	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		
	}

	public void draw()
	{
		background(255);

		line(100, 100, 900, 100);
		line(100, 130, 900, 130);
		line(100, 160, 900, 160);
		line(100, 190, 900, 190);
		line(100, 220, 900, 220);
		
	}

	void drawNotes()
	{
	}
}
