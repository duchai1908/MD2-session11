package btsession11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bt06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử cần thêm");
        int n = sc.nextInt();
        List<Integer> listInteger = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listInteger.add(sc.nextInt());
        }
        List<Integer> listInteger1 = new ArrayList<>();
        for(Integer i : listInteger) {
            if(!listInteger1.contains(i)) {
                listInteger1.add(i);
            }
        }
        System.out.println(listInteger1);
    }
}
