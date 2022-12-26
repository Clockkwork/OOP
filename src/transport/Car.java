package transport;
import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport{
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
            if (validityPeriod.isBefore(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatsNumber;
    private boolean tiresWinter;
    private Insurance insurance;
    private Key key;

    public Car(String brand, String model, double engineVolume, String bodyColor, int releaseYear, String productionCountry, int maxSpeed,
               String transmission, String bodyType, String registrationNumber, int seatsNumber, boolean tiresWinter) {
        super(brand,model,releaseYear,productionCountry,bodyColor,maxSpeed);
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "Механическая";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "Седан";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (seatsNumber <= 0) {
            this.seatsNumber = 5;
        } else {
            this.seatsNumber = seatsNumber;
        }
        this.tiresWinter = tiresWinter;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            System.out.println("Вы задали неверный параметр, попробуйте еще раз!");
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            System.out.println("Вы задали неверный параметр, попробуйте еще раз!");
        } else {
            this.transmission = transmission;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            System.out.println("Вы задали неверный параметр, попробуйте еще раз!");
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public boolean isTiresWinter() {
        return tiresWinter;
    }

    public void setTiresWinter(boolean tiresWinter) {
        this.tiresWinter = tiresWinter;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            System.out.println("Вы задали неверный параметр, попробуйте еще раз!");
        } else {
            this.key = key;
        }
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            System.out.println("Вы задали неверный параметр, попробуйте еще раз!");
        } else {
            this.insurance = insurance;
        }
    }

    public void changeTiresType(int month) {
        if (month <= 0 || month > 12) {
            System.out.println("Такого номера месяца не сущетсвует! Попробуйте еще раз.");
        } else tiresWinter = month < 5 || month > 9;
    }

    @Override
    public String toString() {
        return getBrand() + " " +
                getModel() + ", " +
                getReleaseYear() + " год выпуска. Страна-производитель: " +
                getProductionCountry() + ". Цвет кузова: " +
                getBodyColor() + ". Объем двигателя: " +
                engineVolume + ". Коробка передач: " +
                transmission + ". Тип кузова: " +
                bodyType + ". Регистрационный номер: " +
                registrationNumber + ". Кол-во мест: " +
                seatsNumber + ". Установлена зимняя резина: " +
                tiresWinter;
    }
}

