package DsaProgram.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapWithComparator {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " ( "+age+" ) ";
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(20);
        minHeap.add(30);
        minHeap.add(10);

        System.out.println("Min Heap data");
        while(!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.print("\n");

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(30);

        System.out.println("Max Heap data");
        while(!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.print("\n");

        PriorityQueue<Person> ageMinHeap = new PriorityQueue<>(Comparator.comparingInt(p -> p.age));

        ageMinHeap.add(new Person("A", 30));
        ageMinHeap.add(new Person("B", 35));
        ageMinHeap.add(new Person("C", 40));

        System.out.println("Min age from group of person");
        while(!ageMinHeap.isEmpty()) {
            System.out.print(ageMinHeap.poll().toString() + " ");
        }

        System.out.print("\n");

        PriorityQueue<Person> ageMaxHeap = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.age, p1.age));

        ageMaxHeap.add(new Person("X", 40));
        ageMaxHeap.add(new Person("Y", 60));
        ageMaxHeap.add(new Person("Z", 70));

        System.out.println("Max age from group of person");
        while(!ageMaxHeap.isEmpty()) {
            System.out.print(ageMaxHeap.poll().toString() + " ");
        }

        System.out.print("\n");

    }
}
