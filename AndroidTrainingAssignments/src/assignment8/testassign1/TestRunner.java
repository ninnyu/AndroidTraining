package assignment8.testassign1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import assignment1.ArmstrongNum;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(ArmstrongNum.class);

      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
}  