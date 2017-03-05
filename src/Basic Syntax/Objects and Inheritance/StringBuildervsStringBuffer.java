package tutorial;



/*----------------------------------------------------------------------------------
                                    String                    StringBuffer         StringBuilder
----------------------------------------------------------------------------------                 
Storage Area | Constant String Pool           Heap                       Heap 
Modifiable    |   No (immutable)            Yes( mutable )          Yes( mutable )
Thread Safe   |   Yes                       Yes                          No
 Performance  |   Fast                      Very slow                    Fast
-----------------------------------------------------------------------------------*/


public class StringBuildervsStringBuffer {
	 public static void main(String[] args) {
	        int N = 77777777;
	        long t;

	        {
	            StringBuffer sb = new StringBuffer();
	            t = System.currentTimeMillis();
	            for (int i = N; i --> 0 ;) {
	                sb.append("");
	            }
	            long buffer_time=(System.currentTimeMillis() - t);
	            System.out.printf("The buffer time is: %d \n", buffer_time);
	        }

	        {
	            StringBuilder sb = new StringBuilder();
	            t = System.currentTimeMillis();
	            for (int i = N; i --> 0 ;) {
	                sb.append("");
	            }
	            long builder_time=(System.currentTimeMillis() - t);
	            System.out.printf("The builder time is: %d", builder_time);
	        }
	    }
}
