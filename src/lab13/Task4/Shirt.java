package lab13.Task4;

import java.util.ArrayList;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String id, String name, String color, String size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public static ArrayList<Shirt> parseShirt(String[] args) {
        ArrayList<Shirt> shirts = new ArrayList<Shirt>();
        for (String s : args) {
            String[] parts = s.split(",");
            shirts.add(new Shirt(parts[0], parts[1], parts[2], parts[3]));
        }
        return shirts;
    }

     public String toString() {
        return id + "," + name + "," + color + "," + size + "," + color;
     }
}
