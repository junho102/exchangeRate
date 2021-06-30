
public class ExchangeRate {

	public static void main(String[] args) {
		final double EXCAHNGE_RATE_USD = 1131.80;
		final double EXCAHNGE_RATE_EUR = 1346.23;
		final double EXCAHNGE_RATE_JPY = 10.25;
		
		InputProcess inputPs = new InputProcess();
		DataProcess dataPs = new DataProcess();
		String selectType = null;
		
		while(true) {
			
			inputPs.inputChoice();
			
			if (inputPs.choice == 1) { selectType = "USD"; dataPs.exchangeRate = EXCAHNGE_RATE_USD;} 
			else if (inputPs.choice == 2) { selectType = "EUR";	dataPs.exchangeRate = EXCAHNGE_RATE_EUR;} 
			else if (inputPs.choice ==3) { selectType = "JPY"; dataPs.exchangeRate = EXCAHNGE_RATE_JPY;}
			else{ System.out.print("다시 입력해주세요\n"); break;}
			
			inputPs.inputWon();
				
			dataPs.processExchange(selectType, inputPs.inputWon);
				
			switch(inputPs.choice){
				case 1: dataPs.processUSD(selectType);break;
				case 2: dataPs.processEUR(selectType);break;
				case 3: dataPs.processJPY(selectType);break;}
			
			dataPs.processKR(inputPs.choice);
		}
	}

}
