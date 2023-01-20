import java.util.Scanner;

public class User1 extends Player {

	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void shareCard() {
		System.out.println("유저1(나)이 카드 10장을 받았습니다.");
	}
	
}
