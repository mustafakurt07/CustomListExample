package com.example.nbaplayers;

import java.io.Serializable;
//Players modelimiz
public class Players implements Serializable {
    private String name;
   private String age;
   private int pictureInteger;//android gorsellerı ınt deger tuttugu ıcın boyle bır property kullanarak veri aktarımını daha efektıf hale getırdım

    public Players(String name, String age, int pictureInteger) {
        this.name = name;
        this.age = age;
        this.pictureInteger = pictureInteger;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public int getPictureInteger() {
        return pictureInteger;
    }
}
