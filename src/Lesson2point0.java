public class Lesson2point0 {
    public static void main(String[] args) {
        String[] surname = new String[]{"Айвазов", "Базаров", "Володин", "Петров", "Юмашева", "Галкина", "Ефимова", "Петрова", "Рыбкова", "Ушаков"};
        String[] name = new String[]{"Иван", "Олег", "Артём", "Айнур", "Ольга", "Яна", "Анна", "Александра", "Ирина", "Юрий"};
        String[] middlename = new String[]{"Владимирович", "Владимирович", "Владимирович", "Петрович", "Андреевна", "Ивановна", "Ивановна", "Петровна", "Никитична", "Ивановна"};
        int[] age = new int[]{15, 22, 54, 64, 22, 62, 15, 25, 88, 19};
        char[] sex = new char[]{'M', 'M', 'M', 'M', 'W', 'W', 'W', 'W', 'W', 'M'};
        int counter = 0;
        for (int i = 0; i < sex.length; i++) {
            if (sex[i] == 'M') {
                counter++;
            }
        }
        int[] sexBuffer = new int[counter];
        int[] ageBuffer = new int[counter];
        int indexSexBuffer = 0;
        for (int i = 0; i < sex.length; i++) {
            if (sex[i] == 'M') {
                sexBuffer[indexSexBuffer] = i;
                ageBuffer[indexSexBuffer] = age[i];
                indexSexBuffer++;
            }
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < ageBuffer.length; i++) {
                if (ageBuffer[i] < ageBuffer[i - 1]) {
                    int temp = ageBuffer[i];
                    int temp1 = sexBuffer[i];
                    ageBuffer[i] = ageBuffer[i - 1];
                    sexBuffer[i] = sexBuffer[i - 1];
                    ageBuffer[i - 1] = temp;
                    sexBuffer[i - 1] = temp1;
                    isSorted = false;
                }
            }
        }
        String[] output = new String[counter];
        int indexOutput = 0;
        for (int i = 0; i < sexBuffer.length; i++) {
            output[indexOutput] = name[sexBuffer[i]];
            System.out.println(output[i]);
            indexOutput++;
        }

    }
}