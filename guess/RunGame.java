package cjlu.guess;

public class RunGame {
	public static void main(String[] args){
		System.out.println("********欢迎进入猜拳游戏！*********");
		Game game = new Game();
		game.roleInit();
		game.start();
	}
}
