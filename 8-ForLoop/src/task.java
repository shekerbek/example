
public class task {

	public static void main(String[] args) {
		//find numbers that can be divided by 7 and 9 between 0 and 900 and print sum and 
		//multiplication of those numbers
		//print how many numbers are can  be divided 
		int sum=0;
//		int counter=0;
		int totalNumbers=0;
		for(int i=1; i<=900; i++){
			if(i%7==0 && i%9==0){
				sum=sum+i;
				System.out.println("found number "+i);
				totalNumbers++;
				//counter=counter+i;
				
				
				
			}
			
			
		}
		//System.out.println("number can be divided are "+counter);
		System.out.println("sum of numbers can be divided "+totalNumbers);

	}

}
