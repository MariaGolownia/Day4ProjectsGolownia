package by.javatr.task3.runner;
import by.javatr.task3.en.Color;
import by.javatr.task3.en.TypeOfBall;
import by.javatr.task3.util.Ball;
import by.javatr.task3.util.Basket;
import print.PrintToConsole;

public class Runner {

	public static void main(String[] args) {
		Ball ball1 = new Ball(TypeOfBall.Football, 0.5, Color.BLACK);
		Ball ball2 = new Ball(TypeOfBall.Basketball, 1.2, Color.BLUE);
		Ball ball3 = new Ball(TypeOfBall.Tennisball, 0.06, Color.ORANGE);
		Ball ball4 = new Ball(TypeOfBall.Handball, 0.2, Color.GREEN);
		Ball ball5 = new Ball(TypeOfBall.Football, 0.55, Color.BLUE);
		
		Basket basket1 = new Basket();
		basket1.put(ball1);
		basket1.put(ball2);
		basket1.put(ball3);
		basket1.put(ball4);
		basket1.put(ball5);
					
		PrintToConsole.println(basket1.toString());
		double totalWeightOfBasket1 = basket1.defineTotalWeight();
		PrintToConsole.println("\nTotal weight of basket1 is: " + totalWeightOfBasket1);
		
		int countOfBlueBalls = basket1.defineCountBallsDependOnColor("blue");
		PrintToConsole.println("Count of blue balls in the basket1 is: " + countOfBlueBalls + "\n");
		
		basket1.getOutOf(ball3.getID());
		PrintToConsole.println(basket1.toString());
		totalWeightOfBasket1 = basket1.defineTotalWeight();
		PrintToConsole.println("\nTotal weight of basket2 is: " + totalWeightOfBasket1 + "\n");
	}

}
