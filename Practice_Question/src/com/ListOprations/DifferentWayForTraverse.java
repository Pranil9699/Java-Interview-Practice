package com.ListOprations;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DifferentWayForTraverse {

    public static void main(String[] args) {
        List<Integer> of = List.of(12, 56, 78, 98, 4, 0, 5, 123, 9, 3423);

        System.out.println("********************");
        Iterator<Integer> iterator = of.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " - ");
        }
        System.out.println("\n********************");
        ListIterator<Integer> listIterator = of.listIterator(of.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " - ");
        }
        System.out.println("\n********************");
        of.forEach(e -> {
            System.out.print(e + " - ");
        });
        System.out.println("\n********************");
        iterator.forEachRemaining(e -> {System.out.print(e + " - ");
        });
    }
}
