package edu.bzu.assignment1;

public class Food {

    private String name;
    private int imageID;

    public static final Food[] foods = {
            new Food("Burger", R.drawable.burger1),
            new Food("Sandwech", R.drawable.sandwich),
            new Food("Chicken", R.drawable.chicken),
            new Food("Chinese", R.drawable.chinese),
            new Food("Fototchini", R.drawable.fototchini),
            new Food("Diavolo", R.drawable.diavolo),
    };

    private Food(String name, int imageID) {
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){return name;}

    public int getImageID(){return imageID;}

}
