package lesson7;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> partList = new ArrayList<>(3);
        partList.add(new Integer(1111));
        partList.add(new Integer(1211));
        partList.add(new Integer(1321));
        partList.add(new Integer(1411));

        System.out.println("first element " + partList.get(0));
        partList.add(0, new Integer(5555));
        System.out.println("first elelemnt " + partList.get(0));
    }
}
