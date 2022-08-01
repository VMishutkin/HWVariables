public class Main {
    public static void main(String[] args) {
        // Задача 1
        byte varByte = 1;
        short varShort = 2;
        int varInt = 3;
        long varLong = 4L;
        float varFloat = 5.0f ;
        double varDouble = 6.0;
        char varChar = 'c' ;
        boolean varBoolean = true;

        // Задача 2
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight =  87.2f;
        System.out.println("Общий вес боксеров = " + (firstBoxerWeight + secondBoxerWeight )+ " кг.");
        System.out.println("Разница между боксерами = " + (secondBoxerWeight - firstBoxerWeight) + " кг.");
        // Задача 3
        int bananaWeight = 80;
        int bananaCount = 5;
        int milkWeightForMl = 105;
        int milkCount = 2;
        int icecreamWeight = 100;
        int icecreamCount = 2;
        int eggWeight = 70;
        int eggCount = 4;
        int summaryBreakfastWeightInG = bananaWeight * bananaCount + milkWeightForMl * milkCount +
                icecreamWeight * icecreamCount + eggWeight * eggCount;
        float summaryBreakFastWeightInKg = (float)summaryBreakfastWeightInG / 1000;
        //System.out.println("Вес завтрака в граммах = " + summaryBreakfastWeightInG);
        System.out.println("Общий вес завтрака = " + summaryBreakFastWeightInKg + " кг.");
        // Задача 4
        int daysForLosingWeightBy250 = 7000 / 250;
        int daysForLosingWeightBy500 = 7000 / 500;
        int daysForLosingWeightAvarage = (daysForLosingWeightBy250 + daysForLosingWeightBy500) / 2;
        System.out.println("Чтобы похудеть на 7 килограмм теряя по 250 грамм в день требуется " + daysForLosingWeightBy250 + " дней");
        System.out.println("Чтобы похудеть на 7 килограмм теряя по 500 грамм в день требуется " + daysForLosingWeightBy500 + " дней");
        System.out.println("В среднем на похудение потребуется "+ daysForLosingWeightAvarage + " дней");
        // Задача 5
        int mashaCurrentSalary = 67760;
        int denisCurrentSalary = 83960;
        int kristinaCurrentSalary = 76230;
        int mashaNewSalary = mashaCurrentSalary * 110 / 100 ;
        int mashaSalaryincrease = mashaNewSalary - mashaCurrentSalary;
        int denisNewSalary = denisCurrentSalary * 110 / 100 ;
        int denisSalaryincrease = denisNewSalary - denisCurrentSalary;
        int kristinaNewSalary = kristinaCurrentSalary * 110 / 100 ;
        int kristinaSalaryincrease = kristinaNewSalary - kristinaCurrentSalary;
        System.out.println("Маша теперь получает " + mashaNewSalary +" рублей. Годовой доход вырос на "+ mashaSalaryincrease + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary +" рублей. Годовой доход вырос на "+ denisSalaryincrease + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary +" рублей. Годовой доход вырос на "+ kristinaSalaryincrease + " рублей");
    }
}