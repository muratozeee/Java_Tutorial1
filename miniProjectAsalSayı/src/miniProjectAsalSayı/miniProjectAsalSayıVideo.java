package miniProjectAsalSayı;

public class miniProjectAsalSayıVideo {
	

	public static void main(String[] args) {
		
		int number=-5;
		
		if(number<2) {
			System.out.println("Geçersiz Sayı");
			return;
		}
		boolean isPrime=true;
		
			for(int i=2; i<number;i++) {
				
				if(number%i==0) {
					
					isPrime=false;
					
					
				}
				
			}
			
			if(isPrime) {
				
				System.out.println("Asal Sayıdır");
			}
			else {
				System.out.println("Asal Sayı Değildir...");
			}

	}
}
