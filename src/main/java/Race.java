import java.util.ArrayList;

public class Race {
    int quantityCars;
    String nameRace;
    int timeRace;

    Race(int quantityCars, int timeRace, String nameRace){
        this.quantityCars=quantityCars;
        this.nameRace= nameRace;
        this.timeRace=timeRace;
    }

    ArrayList<Car> car=new ArrayList<>(quantityCars);

    public void createNewCar(String nameCar, int speedCar){
        car.add(new Car(nameCar, speedCar));
    }

    public void printParticipant(){
        System.out.println("\nУчастники соревнования:");
        for(int i=0; i<car.size(); i++) {
            System.out.println(car.get(i).nameCar+" "+car.get(i).speedCar);
        }
    }

    public void findLeader(){
        int max = 0;
        String leader = "похоже гонка так и не началась";
        for (int i = 0; i < car.size(); i++) {
            if ((car.get(i).speedCar)*timeRace > max) {
                leader = car.get(i).nameCar;
                max = (car.get(i).speedCar) * timeRace;
            }
            else
                if ((car.get(i).speedCar)*timeRace == max)
                    leader="\nв этой гонке нет очевидного победителя!";
        }
        System.out.println("\nЛидер гонки: "+leader);
    }
}
