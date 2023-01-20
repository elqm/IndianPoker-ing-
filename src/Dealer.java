import java.util.Scanner;

public class Dealer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Player player = new Player();
		
		while(true) {
			System.out.println("======= 인디언 포커 =======");
			System.out.println("|1. 카드 배분             |");
			System.out.println("|2. 카드 선택             |");
			System.out.println("|3. 카드 공개             |");
			System.out.println("|4. 인디언 포커 승부(Dual)	|");
			System.out.println("|5. 인디언 포커 포기(Die)	|");
			System.out.println("|9. 게임 재시작           	|");
			System.out.println("|0. 게임 종료             |");
			System.out.println("=========================");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1 :
				player.shareCard();
				break;
			case 2 :
				player.selectCard();
				break;
			case 3 :
				player.openCard();
				break;
			case 4 :
				player.dualGame();
				break;
			case 5 :
				player.dieGame();
				break;
			case 9 :
				System.out.println("인디언 포커를 종료합니다.");
				return;
			case 0 :
				player.exitGame();
				break;
			default :
				player.restartGame();
				break;
			}
			
		}
		
	}
	
}
