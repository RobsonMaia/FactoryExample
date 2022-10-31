package entities;

public class NikeFactory {
	
	public static Nike create(NikeType nikeType) {
		
		switch (nikeType) {
			case SoccerBall:
				return new SoccerBall();
			case VolleyBall:
				return new VolleyBall();
			case BasketBall:
				return new BasketBall();
			default:
				return new SoccerBall();
				
		}
		

	}
}
