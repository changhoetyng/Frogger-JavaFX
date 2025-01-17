package gameMain.game;

import gameMain.actor.Animal;
import gameMain.actor.BackgroundImage;
import gameMain.actor.Digit;
import gameMain.actor.End;
import gameMain.actor.Log;
import gameMain.actor.Obstacle;
import gameMain.actor.Turtle;
import gameMain.actor.WetTurtle;
import gameMain.world.MyStage;

/**
 * View of the game.
 * Responsible for all the visuals of the game.
 */

public class GameView{
	
	/**
	 * All the visuals in the game are created here.
	 * @param background Background that allow this method to add
	 * new images into the game.
	 * @param animal The main character, Frog.
	 * @param speed1 Log Direction: Right 
	 * @param speed2 WetTurtle Direction: Left
	 * @param speed3 Log Direction: Left
	 * @param speed4 Car Direction: Left
	 * @param speed5 Truck Direction: Left
	 */
	
	public void mainScreen(MyStage background, Animal animal, double speed1, int speed2, double speed3, int speed4, int speed5) {
		BackgroundImage froggerback = new BackgroundImage("file:src/media/pictures/backImageEdit.jpg");
		BackgroundImage time = new BackgroundImage("file:src/media/pictures/time.png");
		time.setFitWidth(80);
		time.setPreserveRatio(true);
		time.setLayoutY(10);
		time.setLayoutX(15);
		background.add(froggerback);
		//row 1
		background.add(new Log("file:src/media/pictures/log3.png", 150, 0, 166, speed1));
		background.add(new Log("file:src/media/pictures/log3.png", 150, 220, 166, speed1));
		background.add(new Log("file:src/media/pictures/log3.png", 150, 440, 166, speed1));
		
		//row 2
		background.add(new WetTurtle(600, 217, speed2, 130, 130));
		background.add(new WetTurtle(400, 217, speed2, 130, 130));
		background.add(new WetTurtle(200, 217, speed2, 130, 130));
		
		//row 3
		background.add(new Log("file:src/media/pictures/logs.png", 300, 0, 276, speed3));
		background.add(new Log("file:src/media/pictures/logs.png", 300, 400, 276, speed3));
		
		//row 4
		background.add(new Log("file:src/media/pictures/log3.png", 150, 50, 329, speed1));
		background.add(new Log("file:src/media/pictures/log3.png", 150, 270, 329, speed1));
		background.add(new Log("file:src/media/pictures/log3.png", 150, 490, 329, speed1));
		
		//row 5
		background.add(new Turtle(500, 376, speed2, 130, 130));
		background.add(new Turtle(300, 376, speed2, 130, 130));
		background.add(new WetTurtle(700, 376, speed2, 130, 130));
		
		//row 6
		background.add(new Obstacle("file:src/media/pictures/car1Left.png", 500, 490, speed4, 50, 50));
		
		//row 7
		background.add(new Obstacle("file:src/media/pictures/truck2Right.png", 0, 540, speed5, 200, 200));
		background.add(new Obstacle("file:src/media/pictures/truck2Right.png", 500, 540, speed5, 200, 200));
		
		//row 8
		background.add(new Obstacle("file:src/media/pictures/car1Left.png", 100, 597, speed2, 50, 50));
		background.add(new Obstacle("file:src/media/pictures/car1Left.png", 250, 597, speed2, 50, 50));
		background.add(new Obstacle("file:src/media/pictures/car1Left.png", 400, 597, speed2, 50, 50));
		background.add(new Obstacle("file:src/media/pictures/car1Left.png", 550, 597, speed2, 50, 50));
		
		//row 9
		background.add(new Obstacle("file:src/media/pictures/truck1"+"Right.png", 0, 649, speed5, 120, 120));
		background.add(new Obstacle("file:src/media/pictures/truck1"+"Right.png", 300, 649, speed5, 120, 120));
		background.add(new Obstacle("file:src/media/pictures/truck1"+"Right.png", 600, 649, speed5, 120, 120));
		
		background.add(new End(13,96));
		background.add(new End(141,96));
		background.add(new End(141 + 141-13,96));
		background.add(new End(141 + 141-13+141-13+1,96));
		background.add(new End(141 + 141-13+141-13+141-13+3,96));
		background.add(animal);
		
		background.add(new Digit(0, 30, 360, 25));
		background.add(time);
		background.start();
	}
}
