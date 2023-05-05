package entities;

import android.widget.ImageView;

public class Animals {

    private String name;
    private ImageView img;

    public Animals(String name, ImageView img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageView getImg() {
        return img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", img=" + img +
                '}';
    }
}
