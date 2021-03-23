package ru.bspb.lesson3;

public class Men extends Person{
    private char sex;

    public Men(String name, int age, char sex) {
        super(name, age);
        this.sex = sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public String toString(){
        return "Клиент "+getName()+", возраста "+getAge()+" лет , пол "+getSex();
    }
}
