package mapprograms;

public class CapacityDummy {


	public static void main(String[] args) {
		
		int a[] = {10,20,30,40};//{10,20,30,40,50};

        int c = 80;//60;

       

        int n = a.length;
        System.out.println("n= "+n);
        int sum=0,count=0;

       

       

        for(int i=0; i< a.length; i++) {
        	
        	System.out.println("i= "+i);
             System.out.println("arr[i]= "+a[i]);

              sum = sum + a[i];
              System.out.println("sum1= "+sum);
              if(sum > c) {

                    count++;
                    System.out.println("count1= "+count);
                    i = i-1;
                    System.out.println("i= "+i);
                    sum=0;
                    System.out.println("sum2= "+sum);

              }

        }

       

        if( sum != 0) {

              count++;
              System.out.println("count2= "+count);

        }

       

        System.out.println("count3= "+count);



	}

}
