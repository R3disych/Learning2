package tests;

public class Computer {
    private String name;
    private int ram;
    private int hdd;
    private String  OS;

    public Computer(String name, int ram, int hdd, String OS) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.OS = OS;
    }

    public Computer() {}

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String newOS) {
        OS = newOS;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int newRam) {
        if(newRam > 0) {
            ram = newRam;
        } else {
            System.out.println("Оперативная память компьютера не может быть отрицательной!" + " " + newRam);
        }
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int newHdd) {
        if(newHdd > 0) {
            hdd = newHdd;
        } else {
            System.out.println("Емкость жесткого диска системы не может быть отрицательной!" + " " + newHdd);
        }
    }

    public void on() {
        System.out.println("Компьютер включен. Модель вашего компьютера: " + name);
    }

    public void loading() {
        System.out.println("Загружается операционная система. Операционна система " + name + " : " + OS);
        System.out.println("Вместимость жесткого диска: " + hdd + "Гб");
    }

    public void off() {
        System.out.println("Компьютер выключен");
    }
}
