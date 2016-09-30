package Praktikum6;

import provimeAsju.TextIO;

public class KuupiVõtmine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arv;
		double vastus;
		
		System.out.println("Nimetage üks arv mis me võiksime kuupi võtta");
		arv = TextIO.getInt();
		vastus = Math.pow(arv, 3);
		System.out.println("Selleks arvuks on: " + vastus);
		
	}

}