import java.util.Scanner;

public class InputProcess {
	public int choice = 0;
	public double inputWon=0;
		
	public Scanner input = new Scanner(System.in);
	
	public void inputChoice() {
		System.out.printf("환전할 종류 선택 (1:USD  2:EUR  3:JPY  0:종료)?");
		choice = input.nextInt();
	}
	public void inputWon() {
		System.out.print("받은 원화 입력:");
		inputWon = input.nextDouble();
	}
}
