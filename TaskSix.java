public class TaskSix{
public static void main(String... ericalli){
	System.out.println("Powers of the multiples of 4 between 1 and 10: ");

	for(int count = 1; count  < 11; count++)
		if(count % 4 == 0){
			System.out.printf("Powers of count" , count);
			int result = count;
			for (int count = 1; count  <= 5; count++)
				System.out.println(result);
					result = result + count;


}
  }
   
      }