package transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car {
        private final String brand;
        private final String model;
        private String color;
        private final String country;
        private final int year;
        private double engineVolume;

        private String transmission;

        private final String bodyType;

        private String regNumber;

        private final int seatsNumber;

        private boolean rubber;

        private String tiresType;
        private Insurance insurance;
        private Key key;

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;

        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }
    public static class Insurance {
        private final LocalDate validityPeriod;
        private final double price;
        private final String number;

        public Insurance(LocalDate validityPeriod, double price, String number) {
            this.validityPeriod = Objects.requireNonNullElseGet(validityPeriod, LocalDate::now);
            if (price >= 0) {
                this.price = price;
            } else {
                this.price = 0;
            }
            if (number == null || number.isEmpty()) {
                this.number = "default";
            } else {
                this.number = number;
            }
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }


        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpirationDate() {
            if (validityPeriod.isBefore(LocalDate.now().minusDays(365))) {
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }

        public Car(String brand,  String model, String color,  String country, int year, double engineVolume,
                   String transmission,  String bodyType, String regNumber, int seatsNumber, String tiresType) {
            if (brand == null || brand.equals("")) {
                this.brand = "default";
            } else{
                this.brand = brand;
            }
            if (model == null || model.equals("")) {
                this.model = "default";
            } else {
                this.model = model;
            }
            if (color == null || color.equals("")) {
                this.color = "Белого";
            } else {
                this.color = color;
            }
            if (country == null || country.equals("")) {
                this.country = "default";
            } else {
                this.country = country;
            }
            if (year <= 0) {
                this.year = 2000;
            } else {
                this.year = year;
            }
            if (engineVolume <= 0) {
                this.engineVolume = 1.5;
            } else {
                this.engineVolume = engineVolume;
            }
            if (transmission == null || transmission.equals("")) {
                this.transmission = "АКПП";
            } else {
                this.transmission = transmission;
            }
            if (bodyType == null || bodyType.equals("")) {
                this.bodyType = "Хэтчбек";
            } else {
                this.bodyType = bodyType;
            }
            if (regNumber == null || regNumber.equals("")) {
                this.regNumber = "default";
            } else {
                this.regNumber = regNumber;
            }
            if (seatsNumber <= 0) {
                this.seatsNumber = 4;
            } else {
                this.seatsNumber = seatsNumber;
            }
            if (tiresType == null || tiresType.equals(" ") || tiresType.equalsIgnoreCase("Летняя резина")) {
                rubber = false;
            } else if (tiresType.equalsIgnoreCase("Зимняя резина")) {
                rubber = true;
            }


        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public String getCountry() {
            return country;
        }

        public int getYear() {
            return year;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getEngineVolume() {
            return engineVolume;
        }

        public void setEngineVolume(double engineVolume) {
            this.engineVolume = engineVolume;
        }
        public String getBodyType() {
        return bodyType;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public boolean isRubber() {
        return rubber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }
    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;

    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }


    public void changeTiresType(int month) {
        if (month <= 0 || month > 12) {
            System.out.println("Такого месяца не существует");
        } else {
            rubber = month < 5 || month > 9;
        }
    }
    public String getTiresType() {
        if (rubber) {
            return "Зимняя резина";
        } else {
            return "Летняя резина";
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
                            "объём двигателя - " + engineVolume + "l" +
                            "коробка передач : " + transmission + "," +
                            "Тип кузова: " + bodyType + "," +" Регистрационный номер " + "," +
                            regNumber + "," +  " количество мест: " + seatsNumber + "," +
                            " резина: " + rubber + "."
                    ;
        }
    }

