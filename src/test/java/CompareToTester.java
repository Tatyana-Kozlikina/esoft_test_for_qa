import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import ru.example.first_project.MyRandomString;
import ru.example.first_project.MyCompareTo;

public class CompareToTester {

    @RepeatedTest(1000)
     void test() {
        String[] str;
        String str1, str2;
        str = MyRandomString.randomString();
        str1 = str[0];
        str2 = str[1];
        int my_method = MyCompareTo.myCompareTo(str1, str2);
        int method = str1.compareTo(str2);
        Assertions.assertEquals(method, my_method, "compareTo сравниваем с myCompareTo");
        }
}
