package cjlu.guess;

import java.util.Scanner;

public class PersonPlayer {
	private int score;
	private String name;
	
	public String getName(){
		return name;
	}
	public void addScore(){		
		score++;
	}
	public void setName(String name){
		this.name = name;
	}
	public  int getScore(){
		return score;
	}
	
	
	public int show(){
		System.out.print("\n请出拳：1-剪刀 2-石头 3-布 :");
		Scanner in = new Scanner(System.in);
		int flag = in.nextInt();
		switch(flag){
		case 1 : System.out.println("你出的是剪刀");break;
		case 2 : System.out.println("你出的是石头");break;
		case 3 : System.out.println("你出的是布");break;
		}
		return flag;
	}
	
		
}
