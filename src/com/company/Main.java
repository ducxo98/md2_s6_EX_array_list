package com.company;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        myList.addLastElement(1);
        myList.addLastElement(4);
        myList.addLastElement(5);
        myList.addLastElement(3);

        myList.add(4,9);

        System.out.println("Start List:");
        printList(myList);

        myList.remove(2);

        System.out.println("After remove number at index 2:");
        printList(myList);

        System.out.println("Clear List:");
        myList.clear();
        printList(myList);
    }

    private static void printList(MyList<Integer> myList) {
        for (int i = 0; i < myList.getSize()-1;i++){
            System.out.print(myList.get(i)+",");
        }
        System.out.print(myList.get(myList.getSize()-1) + ".");
        System.out.println();
    }

}
