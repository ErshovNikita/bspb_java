package ru.bspb.lesson3;

public class Women extends Person{
    private char sex;

    public Women (String name, int age, char sex) {
        super(name, age);
        this.sex = sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }
}
