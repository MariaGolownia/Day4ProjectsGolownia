package by.javatr.task3.util;
import by.javatr.task3.en.Color;
import by.javatr.task3.en.TypeOfBall;

//—оздать класс ћ€ч. —оздать класс  орзина. 
//Ќаполнить корзину м€чиками. 
//ќпределить вес м€чиков в корзине и количество синих м€чиков.

public class Ball {
	private static int NUMBER_ID = 0;
	private int ID = 0;
	private TypeOfBall typeOfBall;
	private double weight;
	private Color color;
	
	public Ball(TypeOfBall typeOfBall, double weight, Color color) {
		super();
		NUMBER_ID++;
		this.ID = NUMBER_ID;
		this.typeOfBall = typeOfBall;
		this.weight = weight;
		this.color = color;
	}
	
	public Ball() {
		super();
		NUMBER_ID++;
		this.ID = NUMBER_ID;
		this.typeOfBall = null;
		this.weight = 0.00;
		this.color = null;
	}

	public int getID() {
		return ID;
	}

	public TypeOfBall getType() {
		return typeOfBall;
	}

	public void setType(TypeOfBall typeOfBall) {
		this.typeOfBall = typeOfBall;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
