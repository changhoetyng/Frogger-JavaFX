package gameMain.highScore;

import java.io.IOException;
import java.util.ArrayList;

import gameMain.actor.BackgroundImage;
import gameMain.mvcInterfaces.ViewInterface;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class HighScoreView implements ViewInterface{
	private Button startButton;
	private Scene highScoreScene;
	private HighScoreController highScoreController;
	private ArrayList<Integer> list;
	
	public void mainScreen() {
		Pane mainMenu = new Pane();
		ObservableList<Node> addChildren = mainMenu.getChildren();
		highScoreScene = new Scene(mainMenu,600,800);
		highScoreScene.getStylesheets().add("file:src/gameMain/styleSheet/mainMenuStyle.css");
		
		startButton = new Button();
		startButton.setLayoutX(215);
		startButton.setLayoutY(650);
		BackgroundImage startImg = new BackgroundImage("file:src/media/pictures/start.png");
		startImg.setFitWidth(150);
		startImg.setPreserveRatio(true);
		startButton.setGraphic(startImg);
		
		BackgroundImage hiScore = new BackgroundImage("file:src/media/pictures/hiScoreTitle.png");
		hiScore.setFitWidth(450);
		hiScore.setPreserveRatio(true);
		hiScore.setLayoutY(180);
		hiScore.setLayoutX(70);
		
		BackgroundImage yourScoreTitle = new BackgroundImage("file:src/media/pictures/yourScoreTitle.png");
		yourScoreTitle.setFitWidth(250);
		yourScoreTitle.setPreserveRatio(true);
		yourScoreTitle.setLayoutY(30);
		yourScoreTitle.setLayoutX(45);
		
		BackgroundImage one = new BackgroundImage("file:src/media/pictures/one.png");
		one.setFitWidth(50);
		one.setPreserveRatio(true);
		one.setLayoutY(240);
		one.setLayoutX(70);
		
		BackgroundImage two = new BackgroundImage("file:src/media/pictures/two.png");
		two.setFitWidth(50);
		two.setPreserveRatio(true);
		two.setLayoutY(300);
		two.setLayoutX(70);
		
		BackgroundImage three = new BackgroundImage("file:src/media/pictures/three.png");
		three.setFitWidth(50);
		three.setPreserveRatio(true);
		three.setLayoutY(365);
		three.setLayoutX(70);
		
		BackgroundImage four = new BackgroundImage("file:src/media/pictures/four.png");
		four.setFitWidth(50);
		four.setPreserveRatio(true);
		four.setLayoutY(425);
		four.setLayoutX(70);
		
		BackgroundImage five = new BackgroundImage("file:src/media/pictures/five.png");
		five.setFitWidth(50);
		five.setPreserveRatio(true);
		five.setLayoutY(485);
		five.setLayoutX(70);
		
		addChildren.add(new BackgroundImage("file:src/media/pictures/backImageEdit.jpg"));
		addChildren.add(startButton);
		addChildren.add(hiScore);
		addChildren.add(yourScoreTitle);
		addChildren.add(one);
		addChildren.add(two);
		addChildren.add(three);
		addChildren.add(four);
		addChildren.add(five);
		highScoreController.writeScore(30,addChildren,360,30);
		try {
			list = highScoreController.getHighScore();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int yShift = 0;
		for(Integer score: list) {
			highScoreController.writeScore(score,addChildren,200,245 + yShift);
			yShift += 62;
		}
	}
	
	
	
	public HighScoreController getHighScoreController() {
		return highScoreController;
	}



	public void setHighScoreController(HighScoreController highScoreController) {
		this.highScoreController = highScoreController;
	}



	public Button getStartButton() {
		return startButton;
	}

	public void setStartButton(Button startButton) {
		this.startButton = startButton;
	}

	public Scene getHighScoreScene() {
		return highScoreScene;
	}

	public void setHighScoreScene(Scene highScoreScene) {
		this.highScoreScene = highScoreScene;
	}
	
	

	
}
