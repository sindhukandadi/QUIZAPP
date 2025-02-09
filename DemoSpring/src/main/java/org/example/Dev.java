package org.example;

public class Dev {

    private Computer comp;
    //private int age;

    public Dev(){
        System.out.println("dev consturctor");
    }
    /*
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Dev(int age) {
        this.age = age;
        System.out.println("dev1 ");
    }
    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    */

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build(){
        System.out.println("Helloooooooooooooooooooooo");
        comp.compile();
    }
}
