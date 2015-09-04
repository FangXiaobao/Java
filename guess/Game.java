package cjlu.guess;

import java.util.Scanner;

public class Game {
	private ComputerPlayer computerPlayer  = new ComputerPlayer();
	private PersonPlayer personPlayer = new PersonPlayer();
	private Scanner in = new Scanner(System.in);
	//初始化
	public void roleInit(){
		System.out.println("请选择您的角色：1--喜洋洋 2--懒羊羊 3--菲羊羊");
		int roleChose = in.nextInt();
		switch(roleChose){
		case 1 : System.out.println("您的选择是喜羊羊");
				 personPlayer.setName("喜洋洋");break;
		case 2 : System.out.println("您的选择是懒羊羊");
		 		 personPlayer.setName("懒羊羊");break;
		case 3 : System.out.println("您的选择是菲羊羊");
		 		personPlayer.setName("菲羊羊");break;
		}

		System.out.println("请选择电脑的角色：1--喜洋洋 2--懒羊羊 3--菲羊羊");
		int role = in.nextInt();
		switch(role){
		case 1 : System.out.println("电脑的名称是喜羊羊");
				 computerPlayer.setName("喜洋洋");break;
		case 2 : System.out.println("电脑的名称是懒羊羊");
				computerPlayer.setName("懒羊羊");break;
		case 3 : System.out.println("电脑的名称是菲羊羊");
				computerPlayer.setName("菲羊羊");break;
		}
	}
	
	public void start(){
		System.out.println("开始游戏吗？（1/2）");
		int flag = in.nextInt();
		while(flag == 1){
			int a = personPlayer.show();
			int b = computerPlayer.show();
			if( (a==2)&&(b==1)||(a==3)&&(b==2)||(a==1)&&(b==3)){
				System.out.println("您赢了！恭喜！");
			}
			else if(a==b){
				System.out.println("平局！请再接再厉！");
			}
			else {
				System.out.println("您失败了！请继续加油！");
			}
			System.out.println("继续开始游戏么？(y/n)");
			flag = in.nextInt();
			
		}
		System.out.println("游戏结束，谢谢参与！");
		System.exit(0);
	}
	
}
