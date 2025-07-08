import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int quantityCars=3;
        int timeRace=24;
        String nameRace ="24 часа Ле-Мана";

        Race LeMan=new Race(quantityCars, timeRace ,nameRace);
        Scanner scanner=new Scanner(System.in);

        System.out.println("\nПриветствуем Вас на гонке: "+nameRace+" !!!");
        System.out.println("Давайте создадим участников гонки! У нас их "+quantityCars+".");

        for(int i=0; i<quantityCars; i++) {
            System.out.println("Ведите название "+(i+1)+"-го автомобиля:");
            String nameCar = scanner.next();
            int speedCar=0;
            while (speedCar<=0 || speedCar>250) {
                System.out.println("Введите значение скорости "+(i+1)+" автомобиля:");
                if(scanner.hasNextInt()){
                    speedCar=scanner.nextInt();
                    scanner.nextLine();
                }
                else
                     scanner.next();
                if(speedCar<=0 || speedCar>250)
                    System.out.println("Некорректное значение!");
            }
            LeMan.createNewCar(nameCar, speedCar);
        }
        LeMan.printParticipant();
        LeMan.findLeader();
        scanner.close();
    }
}
