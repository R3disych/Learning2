package tests;

public class recursionFucn {
    public static void main(String[] args) {
        recursionFucn();
    }
    public static void recursionFucn() {
        System.out.println("Привет");
        recursionFucn();
    }
}
