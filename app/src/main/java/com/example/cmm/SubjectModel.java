package com.example.cmm;

public class SubjectModel {

    String name;
    int img;
    int prog;

    public SubjectModel(String name, int img, int prog) {
        this.name = name;
        this.img = img;
        this.prog = prog;
    }

    public int getProg() {
        return prog;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }
}
