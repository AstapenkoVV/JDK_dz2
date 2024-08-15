package ru.gb.lisson2_dz;

public class SimpleGenericClass <T>{
    public T first;
    public T second;

    public SimpleGenericClass() {
    }

    public void sumElements(T first, T second) {
        if (first instanceof Integer && second instanceof Integer) {
            int sum = (Integer) first + (Integer) second;
            System.out.println(sum);
        } else if (first instanceof String && second instanceof String) {
            String sum = (String) first + second;
            System.out.println(sum);
        } else System.out.println("Разные типы!");
    }
}
