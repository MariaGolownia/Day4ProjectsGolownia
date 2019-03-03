package by.javatr.task3.util;
import java.util.HashMap;
import java.util.Map;

public class Basket  {
	private Map <Integer, Ball> basketOfBalls = new HashMap<Integer, Ball>();
	
	public void put(Ball ball) {
		basketOfBalls.put(ball.getID(), ball);
	}
	
	public void getOutOf (int ID) {
		if (basketOfBalls.containsKey(ID)) {
		basketOfBalls.remove(ID);}
	}

	@Override
	public String toString() {
		String str = "";	
		for (Ball ball : basketOfBalls.values()) {
			str += String.format("\n[%s, %s, %s, %s]", ball.getID(), ball.getType(), ball.getWeight(), ball.getColor());
		}
		return "Basket = {class => " + basketOfBalls.getClass() + ", hashcoge => " + basketOfBalls.hashCode() + "}" +  str;
	}
	
	public double defineTotalWeight () {
		double result = 0.00;
			for (Ball ball : basketOfBalls.values()) {
			result += ball.getWeight();
		}
		return result;
	}
	
	public int defineCountBallsDependOnColor (String color) {
		int countOfBalls = 0;
			for (Ball ball : basketOfBalls.values()) {
				if (ball.getColor().equals(color)) {
					countOfBalls++;
				}		
		}
		return countOfBalls;
	}
	
}
