package studsboll;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Studsboll extends Circle {

	double vinkel = Math.random() * 90 + 45;
	double hastighet = 10;
	double xhastighet;
	double yhastighet;

	Studsboll() {

		this.setRadius(Math.random() * 25 + 15);
		this.setFill((Color.color(Math.random(), Math.random(), Math.random(), 0.8)));

		this.setTranslateX(MainStudsboll.WINDOW_WIDTH * Math.random());
		this.setRotate(vinkel);
	}

	public void bounce() {
		
		kanter();
		fall();
		
	}
	
	private void fall() {

		double deg = this.getRotate();
		deg = Math.toRadians(deg);

		this.yhastighet = Math.sin(deg)*hastighet;
		this.xhastighet = Math.cos(deg)*hastighet;
		
		this.setTranslateY(this.getTranslateY() + yhastighet);
		this.setTranslateX(this.getTranslateX() + xhastighet);
		
	}

	private void kanter() {

		if (this.getTranslateY() > MainStudsboll.WINDOW_HEIGHT) {
			this.setRotate(360 - this.getRotate());
		}
		if (this.getTranslateY() < 0) {
			this.setRotate(360 - this.getRotate());
		}

		if (this.getTranslateX() > MainStudsboll.WINDOW_WIDTH) {
			this.setRotate(180 - this.getRotate());
		}

		if (this.getTranslateX() < 0) {
			this.setRotate(180 - this.getRotate());
		}

	}

}
