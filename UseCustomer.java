import java.util.HashMap;
import java.util.Iterator;
public class UseCustomer {
	public static void main(String[] args) {
		
		Customer c1=new Customer("Arun",24,19000,123457890l,true);
		Customer c2=new Customer("Bakash",23,23330,333457890l,true);
		Customer c3=new Customer("roja",24,34550,65457890l,false);
		Customer c4=new Customer("Rajesh",19,55000,567457890l,true);
		Customer c5=new Customer("megalai",24,24567,17585757890l,false);
		
		
		HashMap<Long,Customer> c = new HashMap<>();
		
		c.put(c1.getAadharNum(),c1);
		c.put(c2.getAadharNum(),c2);
		c.put(c3.getAadharNum(),c3);
		c.put(c4.getAadharNum(),c4);
		c.put(c5.getAadharNum(),c5);
		
	/*	for(Long m : c.keySet()) {
			System.out.println(m);
		}
		//******
		for(Customer id : c.values()) {
			System.out.println(id);
		}
		
		*/
		//****
		/*for(Long l : c.keySet()) {
			System.out.println(c.get(l));
		}*/
		
		//*************************************
		//System.out.println(c1);
		//********************************
		// c.keySet().forEach((a)->System.out.println(a));
		 //c.values().forEach((k)->System.out.println(k));
		 
			//c.forEach((key,value)->System.out.println(key+" "+value));
		
		//******************************
          /* for(Customer i : c.values()) {
        	   if(i.getIsMale()!=true) {
        		   System.out.println(i);
        	   }
           }*/

	    /*  c.values().forEach(n->{
		if(n.getIsMale()==false) {
			System.out.println(n);
		}
	      }); */
		//********************************************
	/*	c.values().forEach(r->{
			if(r.getName().startsWith("s")) {
				System.out.println(r);
			}
		
		});                    // forEachMethod

		for(Customer no : c.values()) {
			if(no.getName().startsWith("s")) {
				System.out.println(no);
			}
		}                        //enounce method
		*/
		
		
		//********************************************
		int min=c1.getAge();
		String name="";
		for(Customer na : c.values()) {
			if(na.getAge()>=min) {
				min=na.getAge();
				name=na.getName();
			}
		}
		System.out.println(min);
		System.out.println(name);
		
	 /*     c.values().forEach(x->{
	    	  if(x.getName().equalsIgnoreCase("Arun")) {
	    		  System.out.println(x);
	    	  }
	      });
	    */
	      
	  /*    for(long x: c.keySet()) {
	    	  if(c.get(x).getAmountAva()>=20000) {
	    		  System.out.println(c.get(x));
	    	  }
	      }
	      
	*/
		
		//***************************itertor********************************
		
		/*Iterator <Customer>itr =  c.values().iterator();
		
		while(itr.hasNext()) {
			if(itr.next().getName().startsWith("A")) {
				itr.remove();
			}
		}
		c.forEach((x,y)->System.out.println(x+" "+y));
		*/
		
	/*	Iterator <Long>itr =  c.keySet().iterator();

		while(itr.hasNext()) {
			if(itr.next()==c3.getAadharNum()) {
				itr.remove();
			}
		}
		c.forEach((x,y)->System.out.println(x+" "+y));
	*/
		//*********************************************************
		
		
		/*Iterator <Customer>itr1 =  c.values().iterator();

		while(itr1.hasNext()) {
			if(itr1.next().getAge()>=20 || itr1.next().getIsMale()==true) {
				itr1.remove();
			}
		}
		c.values().forEach((x)->System.out.println(x));	*/
		
		
		
		/*Iterator <Customer>itr2 =  c.values().iterator();

		while(itr2.hasNext()) {
			if(itr2.next().getAmountAva()<=20000) {
				itr2.remove();
			}
		}
		c.values().forEach((x)->System.out.println(x));		*/
	}
	}

