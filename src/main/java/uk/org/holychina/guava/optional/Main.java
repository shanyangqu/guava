package uk.org.holychina.guava.optional;

import com.google.common.base.Optional;

/**
 * Hello world!
 *
 */
public class Main {
	   public static void main(String args[]) {
	      Main guavaTester = new Main();
	      
	      Integer a =  null;
	      Integer b =  new Integer(10);
	      
//	      System.out.println(guavaTester.sum(a,b));
	      
	      Optional<Integer> oa =  Optional.of(a);
	      Optional<Integer> ob =  Optional.of(b);
	      
	      System.out.println(guavaTester.osum(oa,ob));      
	   }

	   public Integer sum(Integer a, Integer b){
	      return a + b;
	   }	
	   
	   public Integer osum(Optional<Integer> a, Optional<Integer> b){
		      return a.get() + b.get();
		   }	
	}