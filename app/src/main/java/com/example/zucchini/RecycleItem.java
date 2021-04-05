package com.example.zucchini;

public class
RecycleItem {
    private int image;
    private String text1;
    private String text2;
    private String recipes;

    public RecycleItem(int image, String text1, String text2, String recipes){
        this.image=image;
        this.text1=text1;
        this.text2=text2;
        this.recipes=recipes;
    }

    public int getImageView(){
        return image;
    }
    public String getText1() {
        return text1;
    }
    public String getText2() {
        return text2;
    }
    public String getRecipes(){return recipes;}
}
