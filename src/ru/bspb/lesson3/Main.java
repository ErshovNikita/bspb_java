package ru.bspb.lesson3;


import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Men ("Иванов Иван Иванович", 26, 'M');
        Person person2 = new Men("Иванов Иван Иванович", 26, 'M');
        Person person3 = new Men("Иванов Андрей Владимирович", 29, 'M');
        Person person4 = new Men("Петров Олег Петрович", 19, 'M');
        Person person5 = new Men("Устонов Юрий Артёмович", 56, 'M');
        Person person6 = new Women ("Семигласова Анна Борисовна", 18, 'W');
        Person person7 = new Women("Василькова Инна Антоновна", 84, 'W');
        Person person8 = new Women("Василькова Инна Антоновна", 84, 'W');
        Person person9 = new Women("Петрова Ольга Петровна", 27, 'W');
        Person person10 = new Women("Устонова Юлия Артёмовна", 35, 'W');

        Person[] people = new Person[]{
                person1,
                person2,
                person3,
                person4,
                person5,
                person6,
                person7,
                person8,
                person9,
                person10
        };

        int countMen = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Men) {
                countMen++;
            }
        }

        Person[] men = new Men[countMen];

        for (int i = 0; i < men.length; i++) {
            if (people[i] instanceof  Men){
                men[i]=people[i];
            }
        }

        for (int i = men.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (men[j].getAge() > men[j + 1].getAge()) {
                    Person tmp = men[j];
                    men[j] = men[j + 1];
                    men[j + 1] = tmp;
                }
            }
        }

        int countUnic = 0;

        for (int i = men.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (men[j] == men[j + 1]) {
                    countUnic++;
                }
            }
        }

        Person[] menUnic = new Men[countMen-countUnic];

        for (int i = men.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (men[j] != men[j + 1]) {
                    menUnic[j]=men[i];
                }
            }
        }

        for (int i = 0; i < menUnic.length; i++) {
            System.out.println(menUnic[i]);
        }
    }




}
