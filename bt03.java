package btsession11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bt03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 đoạn văn bản");
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        List<String> str2 = new ArrayList<String>();
        str2.addAll(List.of(str1));
        String min = str2.get(0);
//        String max = Collections.min(str2);
//        System.out.println(max);
        for(String s : str2) {
            if(min.length() > s.length()){
                min = s;
            }
        }
        List<String> str3 = new ArrayList<>();
        for(String s : str2) {
            if(min.length() == s.length()){
                str3.add(s);
            }
        }
        System.out.println(str3);
    }
}
