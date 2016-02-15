package uk.org.holychina.guava.string;

import com.google.common.base.Splitter;

public class SpliterTest {
   public static void main(String args[]) {
      SpliterTest tester = new SpliterTest();
      tester.testSplitter();
   }

   private void testSplitter() {
      System.out.println(Splitter.on(',')
         .trimResults()
         .omitEmptyStrings()
         .split("the ,quick, ,brown, fox, jumps, over, the, lazy, little dog."));
   }
}