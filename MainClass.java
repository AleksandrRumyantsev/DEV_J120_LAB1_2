package Lab3_1;

public class MainClass {
    public static void main(String[] args) {

        List <String> slist = new List<>();
        slist.addLastValue("aaaaa");
        slist.addLastValue("bbbbb");
        slist.addLastValue("ccccc");

        slist.print();
        System.out.println();

        List <Integer> inList = new List<>();
        inList.addLastValue(1);
        inList.addLastValue(2);
        inList.addLastValue(3);

        inList.print();
        System.out.println();

        for (Object in:inList){
            System.out.print(in + ", ");
        }
        for (Object sl: slist){
            System.out.print(sl + ", ");
        }


//        System.out.println("list.getLastValue = " +list.getLastValue());
//        System.out.println();
//        list.addFirstValue("AAAAA");
//        list.print();
//        System.out.println("getFirstValue");
//        System.out.println(list.getFirstValue());
//        System.out.println("getFirstValueAndDel");
//        System.out.println(list.getFirstValueAndDel());
//        System.out.println("printAll");
//        list.print();
//        System.out.println("getLastValueAndDel");
//        System.out.println(list.getLastValueAndDel());
//        System.out.println("printAll");
//        list.print();
//        System.out.println("isContainsValue");
//        System.out.println(list.isContainsValue("aaaaa"));
//        System.out.println(list.isContainsValue("jjjjj"));
//        System.out.println("findAndDel");
//        list.findAndDel("bbbbb");
//        list.print();
    }
}
