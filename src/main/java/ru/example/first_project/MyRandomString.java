package ru.example.first_project;
import org.apache.commons.lang3.RandomStringUtils;

public class MyRandomString {
    public static String[] randomString() {
        int n1, n2;
        String f, k;
        String letter_1, letter_2;
        n1 = Integer.parseInt(RandomStringUtils.randomNumeric(1));
        n2 = Integer.parseInt(RandomStringUtils.randomNumeric(1));
        if (n1==0||n2==0) {
            n1=1;
            n2=1;
        }
        f=RandomStringUtils.random(1,false,true);
        k=RandomStringUtils.random(1,false,true);
       // System.out.println("n1="+n1+" n2="+n2+" Только буквы k="+k+" Только цифры f="+f);

        if (k==f) {
            // System.out.println("n[a-zA-Z]");
            letter_1=RandomStringUtils.randomAlphabetic(n1);
            letter_2=RandomStringUtils.randomAlphabetic(n2);
            //System.out.println("letter1"+letter_1);
            //System.out.println("letter2"+letter_2);
        }

        else if (k=="1"&f=="0") {
            // System.out.println("n[0-9]");
            letter_1=RandomStringUtils.randomNumeric(n1);
            letter_2=RandomStringUtils.randomNumeric(n2);
           // System.out.println("letter1"+letter_1);
            // System.out.println("letter2"+letter_2);
        }

        else {
           // System.out.println("n[a-zA-Z0-9]");
            letter_1=RandomStringUtils.randomAlphanumeric(n1);
            letter_2=RandomStringUtils.randomAlphanumeric(n2);
           // System.out.println("letter1"+letter_1);
           // System.out.println("letter2"+letter_2);
        }
        String [] list1_2 = {letter_1, letter_2};
        return list1_2;
    }
}
