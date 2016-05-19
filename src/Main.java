
public class Main {

	public static void main(String[] args) {
		int a[] = new int[7];
		int sum = 0;
		for(int i=0;i<a.length;i++){
			a[i]=i+1;
			System.out.println(a[i]);
		}
		for(int b: a)
			if(b%2 == 0){
				sum+=b;
			}
		System.out.print("The sum is: " + sum);
			
	
	}

}
