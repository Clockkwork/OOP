public class Car {
    private String brand;
    private String model;
    private String color;
    private String country;
    private int year;
    private double engineVolume;


    Car(String model,String brand,int year,String country,String color,double engineVolume){

        this.model = model;
        this.brand = brand;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;


        if (model == null|| model.equals(" ")){
            this.model = "default";
        } else if (brand == null || brand.equals(" ")) {
            this.brand = "default";
        } else if (country == null || country.equals(" ")) {
            this.country = "default";
        }else if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else if (color == null || color.equals(" ")) {
            this.color = "White";
        } else if (year <= 0){
            this.year = 2000;
        }
    }

    @Override
    public String toString() {
        return
                brand + " " +
                        model + "," +
                        year + " год выпуска," +
                        "сборка в " + country + "," +
                        color + " цвета" + "," +
                "объём двигателя - " + engineVolume + "l"
                ;

    }
}
