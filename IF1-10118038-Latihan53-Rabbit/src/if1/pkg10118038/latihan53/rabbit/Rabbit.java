/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan53.rabbit;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan informasi Rabbit
 */
public class Rabbit extends Animal {
    private final String color;
    private final String name;

    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
        this.name = name;
        System.out.println("Hello, his name is " + name);
        System.out.println(name + " is Vegetarian? " + veg);
        System.out.println(name + " eats " + food);
        System.out.println(name + " has " + legs + " legs");
        System.out.println(name + " color is " + color);
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
    
    
}
