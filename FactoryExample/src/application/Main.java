package application;

import entities.Nike;
import entities.NikeFactory;
import entities.NikeType;

public class Main {

	public static void main(String[] args) {
		
		Nike nike = NikeFactory.create(NikeType.VolleyBall);
		
		System.out.println("NAME: " + nike.getName());
		System.out.println("COLOR: " + nike.getColor());
		System.out.println("SIZE: " + nike.getSize() + "cm");
		
	}

}
