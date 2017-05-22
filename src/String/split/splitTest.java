package String.split;

public class splitTest {
	
	public static void main(String[] args) {
		//String[] aa = "aaa|bbb|ccc".split("|");

//	    String[] aa = "aaa|bbb|ccc".split("\\|"); //这样才能得到正确的结果
//
//	    for (int i = 0 ; i <aa.length ; i++ ) {
//
//	      System.out.println("--"+aa[i]); 
//
//	    }
		
		/**
		 * 

		String aa = "123元";
		System.out.println(aa.split("元")[0]);//输出结果为123
				 */
		String[] source = { "::0.0.0.1:0", "::0.0.0.2:0", "::0.0.0.3:0", "::0.0.0.4:0" };
		for (String line : source) {
		System.out.println(line.split(":")[0]+line.split(":")[1]+ line.split(":")[3] );
		}
	    
	    
	}

}
