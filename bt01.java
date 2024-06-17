package btsession11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class bt01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10 +1));
        }
        System.out.println("Phan tu co gia tri lon nhat: " +Collections.max(list));
        System.out.println(list);
        System.out.println("Phan tu dao nguoc: ");
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("Sap xep tang dan");
        Collections.sort(list);
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2);

    }
}
