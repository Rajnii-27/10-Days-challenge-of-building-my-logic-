public class Main {
	public static int ProductOfNumber( int max1,max2,arr[]){
		int arr[]={ 6,8,9,10,3};
		int max1=Integer.MIN_VALUE;
		int max 2=Integer.MIN_VALUE;
		for(int num:arr){
			if(num>max1){
				max1=max2;
				num=max1;}
				else if(num>max2){
					max2=num;}				
				return max1*max2;}
	}
	public static void main(String[] args) {
		System.out.println("maximum product of two number inn given array is:" ProductOfNumber(max1,max2,arr[]))
}