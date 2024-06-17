package btsession11.bt07;

public class MyListTest {
    public static void main(String[] args) {
        QuangTranList<Integer> list = new QuangTranList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        System.out.println("list 1: "+list.get(0));
//        System.out.println(list.size());
//
//        list.add(1,4);
//        System.out.println(list.size());
//        System.out.println(list);
        list.remove(1);
        System.out.println(list);

    }
}
