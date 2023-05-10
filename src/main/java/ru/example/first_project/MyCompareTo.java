package ru.example.first_project;

public class MyCompareTo {
    public static int myCompareTo(String str1, String str2) {
        int i;
        int answer = 0;
        int len1=str1.length();
        int len2=str2.length();
        int len=Math.min(len1,len2);
        if (len>0) {
            for (i = 0; i <= len; i = i + 1) {
                char ch1 = str1.charAt(i);
                char ch2 = str2.charAt(i);
                if (ch1 == ch2) {
                    i++;
                } else if (ch1 != ch2) {
                    int delta_i = ch1 - ch2;
                    answer = delta_i;
                    break;
                }
            }
        }
        else {
            int delta_len=len1-len2;
            if (delta_len>0) {
                System.out.println("1");
                answer=1;
            }
            else if (delta_len<0) {
                System.out.println("-1");
                answer=-1;
            }
        }
        return answer;
    }

}
