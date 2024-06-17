package btsession11;

import java.util.ArrayList;
import java.util.List;

public class bt02 {
    public static void main(String[] args) {
        String str = "Rikkei Academy để nông dân biết code";
        String[] str1 = str.split(" ");
        List<String> str2 = new ArrayList<String>(List.of(str1));
        System.out.println(str2);
        for(String s : str2) {
            if(s.length() >= 3){
                System.out.println(s);
            }
        }
    }
}
