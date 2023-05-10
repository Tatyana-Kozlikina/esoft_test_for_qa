import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.opentest4j.AssertionFailedError;
import ru.example.first_project.MyRandomString;
import ru.example.first_project.MyCompareTo;
import org.junit.jupiter.api.RepetitionInfo;

public class CompareToTester {
   @RepeatedTest(value =1000)
   void test(RepetitionInfo info) {
      int currentRepetition = info.getCurrentRepetition();
      String[] str;
      String str1, str2;
      str = MyRandomString.randomString();
      str1 = str[0];
      str2 = str[1];
      try {
         int method = str1.compareTo(str2);
         int my_method = MyCompareTo.myCompareTo(str1, str2);
         Assertions.assertEquals(method, my_method, "compareTo сравниваем с myCompareTo");
         System.out.println("---------test "+currentRepetition+" is successful");
      }
      catch (AssertionFailedError e) {
         System.err.println("---------test "+currentRepetition+" is invalid");
      }
      catch (StringIndexOutOfBoundsException e) {
         System.err.println("StringIndexOutOfBoundsException\n"+"str1="+str1+" str2="+str2);
      }
   }
}



