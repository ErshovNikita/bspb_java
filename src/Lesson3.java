public class Lesson3 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Иванов Иван Иванович");
        person1.setAge(26);
        person1.setSex('M');
        Person person2 = new Person();
        person2.setName("Иванов Иван Иванович");
        person2.setAge(26);
        person2.setSex('M');
        Person person3 = new Person();
        person3.setName("Иванов Андрей Владимирович");
        person3.setAge(29);
        person3.setSex('M');
        Person person4 = new Person();
        person4.setName("Петров Олег Петрович");
        person4.setAge(19);
        person4.setSex('M');
        Person person5 = new Person();
        person5.setName("Устонов Юрий Артёмович");
        person5.setAge(56);
        person5.setSex('M');
        Person person6 = new Person();
        person6.setName("Семигласова Анна Борисовна");
        person6.setAge(18);
        person6.setSex('W');
        Person person7 = new Person();
        person7.setName("Василькова Инна Антоновна");
        person7.setAge(84);
        person7.setSex('W');
        Person person8 = new Person();
        person8.setName("Василькова Инна Антоновна");
        person8.setAge(84);
        person8.setSex('W');
        Person person9 = new Person();
        person9.setName("Петрова Ольга Петровна");
        person9.setAge(27);
        person9.setSex('W');
        Person person10 = new Person();
        person10.setName("Устонова Юлия Артёмовна");
        person10.setAge(35);
        person10.setSex('W');
    }
}
class Person{
    private String name;
    private int age;
    private char sex;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public char getSex(){
        return sex;
    }
    public Person () {


    }
}







