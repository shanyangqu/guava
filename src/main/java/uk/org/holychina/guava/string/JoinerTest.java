package uk.org.holychina.guava.string;

import java.util.Arrays;
import com.google.common.base.Joiner;

public class JoinerTest {
   public static void main(String args[]){
      JoinerTest tester = new JoinerTest();
      tester.testJoiner();	
   }

   private void testJoiner(){
      System.out.println(Joiner.on(",")
         .skipNulls()
         .join(Arrays.asList(1,2,3,4,5,null,6)));
   }
}