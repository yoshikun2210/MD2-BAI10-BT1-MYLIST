public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add(0, "a");
        list.add(1, "b");
        list.add(1, "c");
        list.add(1, "d");

        list.remove(3);

        for (Object s : list.elements) {
            System.out.println(s);
        }


        System.out.println(list.contains("a"));
    }
}