package tests;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer();

        Notebook note = new Notebook();

        note.on();
        computer.setName("Mac");
        computer.setRam(16);
        computer.setHdd(350);
        computer.setOS("MacOS");

        Computer computer2 = new Computer("ASUS", 2, 400, "Windows");

        computer2.on();
        computer2.loading();
        computer2.off();

        computer.on();
        computer.loading();
        computer.off();
    }
}
