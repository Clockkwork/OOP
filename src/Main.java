import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class Main {
    public static void main(String[] args) {


        Car first = new Car(null,"Lada",2015,"России","жёлтого",1.7);
        System.out.println(first);

        Car second = new Car(null , "AUDI" ,2020,"Германии","чёрного",3);
        System.out.println(second);


        Car third = new Car(null, "BMW",2021,"Германии","чёрного",3);
        System.out.println(third);


        Car fourth = new Car("Sportage 4-ого поколения","Kia",2018,"Южной Кореии","красного",2.4);
        System.out.println(fourth);


        Car fifth = new Car("Avante","Hyundai",2016,"Южной Кореии","оранжевого",1.6);
        System.out.println(fifth);

    }
}