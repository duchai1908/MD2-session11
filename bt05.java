package btsession11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bt05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử cần thêm");
        int n = sc.nextInt();
        ArrayList<Integer> listInteger = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listInteger.add(sc.nextInt());
        }
        ArrayList<Integer> listInteger1 = new ArrayList<>();
        listInteger.removeIf(i -> i % 2 == 0);
        System.out.println(listInteger);
    }
}
