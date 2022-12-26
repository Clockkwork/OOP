import transport.Bus;
import transport.Car;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015,
                "Россия",160,"Механическая","Лифтбэк","L312",4,true);


        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,
                "Германия",200,"Автоматическая","Седан","A436",4,false);


        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021,
                "Германия",250,"Автоматическая","Купе","B257",2,false);

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный",
                2018, "Южная Корея",180,"Автоматическая","Кроссовер","K311",5,true);

        Car hyundai = new Car("Hyundai", null, -2, "", -323, "",
                -200,null,"",null,-2,true);

        System.out.println(lada);
        lada.changeTiresType(7);
        System.out.println("Резина зимняя: " + lada.isTiresWinter());

        Car.Key keyOptions1 = new Car.Key(true, false);
        lada.setKey(keyOptions1);
        System.out.println(lada.getKey().isKeylessAccess());

        Car.Insurance insurance1 = new Car.Insurance(LocalDate.of(2022,12,22),10000,"12345678");
        lada.setInsurance(insurance1);
        lada.getInsurance().checkNumber();
        lada.getInsurance().checkExpirationDate();

        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        Bus bus1 = new Bus("Автобус №217", "Для пассажиров", 1950, "Россия",
                "желтый", 100);

        Bus bus2 = new Bus("Автобус №227", "Для пассажиров", 1980, "Италия",
                "красный", 50);

        Bus bus3 = new Bus("Автобус №267", "Для пассажиров", 1950, "Франция",
                "черный", 75);

        System.out.println(bus1);

        System.out.println(bus2);

        System.out.println(bus3);



    }
}