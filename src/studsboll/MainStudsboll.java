package studsboll;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainStudsboll extends Application {

	ArrayList<Studsboll> studsbollar = new ArrayList<Studsboll>();
	
	public static final double WINDOW_WIDTH = 1000;
	public static final double WINDOW_HEIGHT = 750;
	
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
		
		primaryStage.setScene(scene);
		primaryStage.show();

		for (int i = 0; i < 10; i++) {

			studsbollar.add(new Studsboll());
			root.getChildren().add(studsbollar.get(i));

		}
		
		
		
		AnimationTimer at = new AnimationTimer() {

			@Override
			public void handle(long now) {

				for(Studsboll b : studsbollar) {
					
					
					b.bounce();
					
					
				}
				
			}
		};

		at.start();
		
	}

	public static void main(String[] args) {
		launch();
	}
	
}