package cjlu.guess;

//电脑玩家ComputerPlayer类
public class ComputerPlayer{
	//属性
	private String name;
	private int score;
	// 构造器
	public ComputerPlayer(){
		
	}
	public ComputerPlayer(String name){
		this.name = name;
	}
	public ComputerPlayer(String name,int score){
		this.name = name;
		this.score = score;
	}
	//得到分数
	public int getScore(){
		return score;
	}
	//加分
	public void addScore(){
		score++;
	}
	//设置名称
	public void setName(String name){
		this.name = name;
	}
	//出拳
	public int show(){
		double number;
		int flag;
		number = Math.random()*100;
		
		if(number < 33){
			flag = 1;
		}
		else if( 33<number && number<66){
			flag = 2;
		}
		else{
			flag = 3;
		}
		
		switch(flag){
			case 1: System.out.println("电脑玩家--"+name+"  出拳：剪刀");break;
			case 2: System.out.println("电脑玩家--"+name+"  出拳：石头");break;
			case 3: System.out.println("电脑玩家--"+name+"  出拳：布");break;
		}
		return flag;
	}
	
}
