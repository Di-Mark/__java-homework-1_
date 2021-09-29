package com.company;
import model.Kotik;
public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(5,"Max",5,"meeeow");
        Kotik kotik2 = new Kotik();
        kotik1.liveAnotherDay();
        kotik1.GetName();
        kotik1.GetWeight();
        kotik1.GetCountCat();
        kotik1.comparisonMeow(kotik1.Getmeow(),kotik2.Getmeow());
    }
}
