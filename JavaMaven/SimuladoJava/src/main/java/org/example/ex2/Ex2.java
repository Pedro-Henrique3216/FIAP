package org.example.ex2;

public class Ex2 {

    public static void main(String[] args) {
        ArrayPeek arrayPeek = new ArrayPeek(new int[] {1, 5, 6 ,50, 20, 10});
        System.out.println(arrayPeek.peek());
        System.out.println(arrayPeek);
        System.out.println(arrayPeek.pop());
        System.out.println(arrayPeek);
        System.out.println(arrayPeek.popFirst());
        System.out.println(arrayPeek);
    }
}
