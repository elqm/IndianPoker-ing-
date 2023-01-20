import java.util.Random;

public class Player {

	public void shareCard() {
		
		CardDTO[] cards = new CardDTO[10];
		System.out.println("플레이어가 카드 10장을 받았습니다.");
		
	}
	
	public void selectCard() {
		
		CardDTO[] cards = new CardDTO[10];
		System.out.println("플레이어가 카드 1장을 선택했습니다.");
		
	}
	
	public void openCard() {
		
		CardDTO[] cards = new CardDTO[10];
		Random ranCard = new Random();
		System.out.println("플레이어가 상대에게 카드를 공개합니다.");
		System.out.println("상대의 카드는 [" + cards[ranCard.nextInt(10)] +"] 입니다.");
		
	}
	
	public void dualGame() {
		
		System.out.println("인디언 포커 시작!");
		
		
		
	}
	
	public void dieGame() {
		
		System.out.println("인디언 포커 포기...");
		
	}
	
	public void exitGame() {
		
		System.out.println("인디언 포커를 종료합니다.");
		
	}
	
	public void restartGame() {
		
		System.out.println("인디언 포커를 다시 시작합니다.");
		
	}
	
}
