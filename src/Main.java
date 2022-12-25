import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class Main {
    public static void main(String[] args) {


        Car first = new Car(" ","Lada",2015,"Russia","Yellow",1.7);
        System.out.println(first);

        Car second = new Car("A8 " + "50 L" + " TDI quattro ","AUDI",2020,"Germany","black",3);
        System.out.println(second);


        Car third = new Car("Z8", "BMW",2021,"Germany","Black",3);
        System.out.println(third);


        Car fourth = new Car("Sportage 4-ого поколения","Kia",2018,"South Korea","red",2.4);
        System.out.println(fourth);


        Car fifth = new Car("Avante","Hyundai",2016,"South Korea","Orange",1.6);
        System.out.println(fifth);

    }
}