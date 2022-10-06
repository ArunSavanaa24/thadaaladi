import java.util.HashMap;
public class LmsTest {
	public static void main(String[] args) {
		HashMap<Integer,String> lms=new HashMap<>();
		lms.put(12, "anil");
		lms.put(13, "arun");
		lms.put(14,"vasugi");
		lms.put(15, "dhanapal");
		lms.put(16, "akash");
		
		/*for(Integer id : lms.keySet()) {
			System.out.println(id);
		}   */                               // ella keys ha mattu print panna
		//(***************************************************************)
		
		/*for(String id : lms.values()) {
			System.out.println(id);
		}                                  // ella values ha mattu print panna
		*/
		//(****************************************************************)
		
		/*for(Integer id : lms.keySet()) {
			System.out.println(lms.get(id));
		}*/                                     //keyset vatchi values kupdalam        
		//(****************************************************************)
		/*for(String name : lms.values()) {
			System.out.println(lms.get(name));
		}*/                                      //values kuduthu keys get panna mudiyathu,because duplicate

	//***************************************************************************
		
		//lms.forEach((x,y)->System.out.println(x+" "+y));

		//lms.keySet().forEach(x->System.out.println(x));
		
		//lms.values().forEach(y->System.out.println(y));       // for each method


	//*****************************************************
/*	lms.keySet().forEach(id -> {
		if(id%2==0) {
			System.out.println(id+"is even");
		}
		else {
			System.out.println(id+"is odd");
		}
	});*/
		
		//************
		for(Integer a : lms.keySet()) {
			if(a%2==0) {
				System.out.println(a+"its add");
			}
			else {
				System.out.println(a+"its even");
			}
		}
		
		
		
		
		
		
		//**********************************************
		/*for(String name : lms.values()) {
			if(name.contains("a") || name.contains("e") || name.contains("i") || name.contains("o") || name.contains("u")) {
				System.out.println(name+"contains vowels");
			}
			else {
				System.out.println(name+"it not contains vowels");
			}
		
	}*/
		
	//*****************************************************	
		/*  lms.values().forEach((x)->{
			if(x.contains("a") || x.contains("e") || x.contains("i") || x.contains("o") || x.contains("u")) {
				System.out.println(x+" contain vowels");
			}
			else {
				System.out.println(x+"not contains vowels");
			}
		});    */

	}
	}

