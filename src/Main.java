import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", "Жёлтый", "России", 2015, 1.7,
                "Механическая","Лифтбэк","А579АС",4,"Зимняя резина");


        Car audi = new Car("Audi", "A8 50 L TDI quattro", "чёрный", "Германии", 2020,
                3.0,"Автоматическая","Седан","A336АА",4,"Летняя резина ");


        Car bmw = new Car("BMW", "Z8", "чёрный", "Германии", 2021, 3.0,
                "Автоматическая","Купе","B228АА",2,"Летняя резина");


        Car kia = new Car("Kia", "Sportage 4-го поколения", "красный", "Южной Корeи", 2018,
                2.3,"Автоматическая","Кроссовер","K333ИА",5,"зимняя");


        Car hyundai = new Car("Hyundai", null, "", "", -323, 0,
                null,"",null,-2,"");


        System.out.println(lada);

        lada.changeTiresType(7);

        System.out.println("На автомобиле марки: " + lada.getBrand() + lada.getModel() + " установленна " + lada.getTiresType());

        Car.Key keyOptions1= new Car.Key(true, false);
        lada.setKey(keyOptions1);
        System.out.println(lada.getKey().isKeylessAccess());

        Car.Insurance insurance1 = new Car.Insurance(LocalDate.of(2021,12,15),10000,"12345678");
        lada.setInsurance(insurance1);
        lada.getInsurance().checkNumber();
        lada.getInsurance().checkExpirationDate();


        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
}
}