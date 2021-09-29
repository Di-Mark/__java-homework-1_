package model;

public class Kotik {
    private int satiety = 15;
    private int prettiness = 0;
    private String name = "default";
    private int weight = 0;
    private String meow = "default";
    private static int countCat = 0;
    private boolean condition_satiety = true;
    private int point_food = 10;
    private String CatFood = "Whiskas";

    public void liveAnotherDay(){
        for(int i = 0;i < 24;i++){
            if(condition_satiety == true){
                switch (GetrandomNamb(4)){
                    case 1:
                        play();
                        break;
                    case 2:
                        sleep();
                        break;
                    case 3:
                        chaseMouse();
                        break;
                    case 4:
                        walkAroundTheHouse();
                        break;

                }
            }
            else{
                switch (GetrandomNamb(3)){
                    case 1:
                        eat(point_food);
                        break;
                    case 2:
                        eat(point_food,CatFood);
                        break;
                    case 3:
                        eat();
                        break;
                }

            }
        }
    }
    public String GetName(){
        System.out.println("Имя кота: " + name);
        return name;
    }
    public int GetWeight(){
        System.out.println("Вес кота: " + weight);
        return weight;
    }
    public String Getmeow(){
        return meow;
    }
    public int Getprettines(){
        return prettiness;
    }
    public void GetCountCat(){
        System.out.println("Количество котов: " + countCat);
    }
    private int GetrandomNamb(int numb){
        double randNumber = Math.random() * numb + 1;
        return (int)randNumber;
    }
    public void comparisonMeow(String str1,String str2){
        boolean variable;
        if (str1.equals(str2)){
            System.out.println("Коты мяукают одинаково");
        }
        else{
            System.out.println("Коты мяукают не одинаково");
        }
    }
    private boolean play(){
        if (satiety > 0){
            satiety -= 3;
            System.out.println("Кот поиграл");
            condition_satiety = true;
        }
        else {
            System.out.println("Кот не поиграл.Он голоден и просит есть");
            condition_satiety = false;
        }
        return condition_satiety;
    }
    private boolean sleep() {
        if (satiety > 0) {
            satiety -= 2;
            System.out.println("Кот поспал");
            condition_satiety = true;
        } else {
            System.out.println("Кот не поспал.Он голоден и просит есть");
            condition_satiety = false;
        }
        return condition_satiety;
    }
    private boolean chaseMouse() {
        if (satiety > 0) {
            satiety -= 4;
            System.out.println("Кот побегал за кошкой");
            condition_satiety = true;
        } else {
            System.out.println("Кот не побегал за кошкой.Он голоден и просит есть");
            condition_satiety = false;
        }
        return condition_satiety;
    }
    private boolean walkAroundTheHouse() {
        if (satiety > 0) {
            satiety -= 2;
            System.out.println("Кот походил по дому");
            condition_satiety = true;
        } else {
            System.out.println("Кот не походил по дому.Он голоден и просит есть");
            condition_satiety = false;
        }
        return condition_satiety;
    }


    private void eat(int point_food){
        System.out.println("Кот поел!");
        satiety += point_food;
        condition_satiety = true;
    }
    private void eat(int point_food,String catFood){
        System.out.println("Кот поел!");
        satiety += point_food;
        condition_satiety = true;
    }
    private void eat(){
        eat(point_food,CatFood);
        condition_satiety = true;
    }


    public Kotik(int prettiness, String name, int weight, String meow){
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        countCat++;
    }
    public Kotik(){
        countCat++;
    }
}
