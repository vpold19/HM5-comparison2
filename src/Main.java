public class Main {
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        System.out.println("Задача 1");
        int clientOS=0;
        switch (clientOS){
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для IOS по ссылке");
                break;
            default:
                System.out.println("Еще нет такой версии");
        }
    }
    public static void task2(){
        System.out.println("Задача 2");
        int clientOS2=1;
        int clientDeviceYear=2015;
        String osString;
        if(clientOS2 ==0){
           osString="Android";
        } else {
            osString="IOS";
        }
        String version= clientDeviceYear>2015 ? "": " облегченную ";
        System.out.println("Установите " + version + " версия приложения для " + osString + " по ссылке");
    }
    public static void task3(){
        System.out.println("Задача 3");
        int year=2028;
        if((year % 4 ==0 &&year%100 !=0)|| (year %400==0)){
            System.out.println( year +" год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        int deliveryDistance=95;
        if(deliveryDistance<20){
            System.out.println("Срок доставки занимает один день");
        } else if( deliveryDistance>=20 && deliveryDistance<60){
            System.out.println(" Срок доставки занимает двое дней");
        } else if( deliveryDistance>=60 && deliveryDistance<=100){
            System.out.println(" Срок доставки занимает три дня");
        }else{
            System.out.println(" доставки нет");
        }
    }
    public static void task5(){
        System.out.println("Задача 5");
        int monthNumber=12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("нет такого времени года");
        }
    }
}