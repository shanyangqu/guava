package uk.org.holychina.guava.string;

import com.google.common.base.CaseFormat;

public class CastFormatTester {
   public static void main(String args[]){
      CastFormatTester tester = new CastFormatTester();
      tester.testCaseFormat();
   }

   private void testCaseFormat(){
      String data = "test_data";
      System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, "test-data"));
      System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "test_data"));
      System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "test_data"));
   }
}