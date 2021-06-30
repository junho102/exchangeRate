import java.util.Scanner;

public class ExchangeRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				final double EXCAHNGE_RATE_USD = 1131.80;
				final double EXCAHNGE_RATE_EUR = 1346.23;
				final double EXCAHNGE_RATE_JPY = 10.25;
				
				double inputKrWon, exchangeRate = 0, exchange;
				int returnMoney, returnKrMoney;
				String selectType = null;
				
				Scanner myInput = new Scanner(System.in);
				
				while(true) {
					System.out.printf("환전할 종류 선택 (1:USD  2:EUR  3:JPY  0:종료)?");
					int choice = myInput.nextInt();
					
					if (choice == 1) {
						selectType = "USD";
						exchangeRate = EXCAHNGE_RATE_USD;			
					} else if (choice == 2) {
						selectType = "EUR";
						exchangeRate = EXCAHNGE_RATE_EUR;
					} else if (choice ==3) {
						selectType = "JPY";
						exchangeRate = EXCAHNGE_RATE_JPY;
					} else {
						break;
					}
					
					System.out.print("받은 원화 입력:");
					inputKrWon = myInput.nextDouble();
					
					exchange = inputKrWon / exchangeRate;
					returnMoney = (int) exchange;
					exchange = exchange - returnMoney;
					returnKrMoney = (int) (exchange * exchangeRate);
					returnKrMoney = returnKrMoney / 10 * 10;
					
					System.out.printf("받으실 금액은 %d %s  과   %d 원입니다.\n", returnMoney, selectType, returnKrMoney);
					
					switch(choice){
					case 1:
						
						
						int[] USD = {100,50,20,10,5,2,1};
						for(int i=0;i<USD.length;i++) {
							System.out.printf("%d %s\t:\t%d\n", USD[i],selectType,returnMoney/USD[i]);
							returnMoney %= USD[i];
						}
			
					break;
						
					case 2: 
						int[] EUR = {500,200,100,50,20,10,5,2,1};
						for(int i=0;i<EUR.length;i++) {
							System.out.printf("%d %s\t:\t%d\n", EUR[i],selectType,returnMoney/EUR[i]);
							returnMoney %= EUR[i];
						}
					break;
						
					case 3:
						int[] JPY = {500,100,50,10,5,1};
						for(int i=0;i<JPY.length;i++) {
							System.out.printf("%d %s\t:\t%d\n", JPY[i],selectType,returnMoney/JPY[i]);
							returnMoney %= JPY[i];
						}	
					break;
					}
					if(choice==1||choice==2||choice==3) {
						int[] won = {1000,500,100,50,10};
						for(int i=0;i<won.length;i++) {
							System.out.printf("%d 원\t:\t%d\n", won[i],returnKrMoney/won[i]);
							returnKrMoney %= won[i];
						}
						System.out.println("------------------------------------------------");
						
					}
				}
				myInput.close();
	}

}
