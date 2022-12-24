import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class Main {
    public static void main(String[] args) {


        Car first = new Car(null,"Lada",2015,"Russia","Yellow",1.7);
        first.model = "Granta";
        first.brand = "Lada";
        first.year = 2015;
        first.country = "России";
        first.color = "Жёлтого";
        first.engineVolume = 1.7;
        System.out.println(first);


        Car second = new Car("A8 " + "50 L" + " TDI quattro ","AUDI",2020,"Germany","black",3);
        second.model = "A8 " + "50 L" + " TDI quattro";
        second.brand = "Audi";
        second.year = 2020;
        second.country = "Германии";
        second.color = "кузов" + " чёрного";
        second.engineVolume = 3.0;
        System.out.println(second);


        Car third = new Car("Z8", "BMW",2021,"Germany","Black",3);
        third.model = "Z8";
        third.brand = "BMW";
        third.year = 2021;
        third.country = "Германии";
        third.color = "кузов" + " чёрного";
        third.engineVolume = 3.0;
        System.out.println(third);


        Car fourth = new Car("Sportage 4-ого поколения","Kia",2018,"South Korea","red",2.4);
        fourth.model = "Sportage 4-ого поколения";
        fourth.brand = "Kia";
        fourth.year = 2018;
        fourth.country = "Южной Корее";
        fourth.color = "кузов" + " красного";
        fourth.engineVolume = 2.4;
        System.out.println(fourth);


        Car fifth = new Car("Avante","Hyundai",2016,"South Korea","Orange",1.6);
        fifth.model = "Avante";
        fifth.brand = "Hyundai";
        fifth.year = 2016;
        fifth.country = "Южной Корее";
        fifth.color = "кузов" + " оранжевого";
        fifth.engineVolume = 1.6;
        System.out.println(fifth);

    }
}