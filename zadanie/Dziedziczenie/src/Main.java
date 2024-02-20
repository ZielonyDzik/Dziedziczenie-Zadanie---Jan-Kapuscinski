public class Main {
    public static void main(String[] args) {

        Vehicle firstVehicle = new Vehicle("Subaru", 12, 130, "lądowy");
        Vehicle secondVehicle = new Vehicle("Boening", 14, 700, "powietrzny");
        Vehicle thirdVehicle = new Vehicle("Benetau Oceanis", 3, 180, "wodny");
        firstVehicle.getInfo();
        secondVehicle.getInfo();
        thirdVehicle.getInfo();

        firstVehicle.getPower();
        secondVehicle.getPower();
        thirdVehicle.getPower();

        firstVehicle.getVehName();
        secondVehicle.getVehName();
        thirdVehicle.getVehName();


        LandVehicle firstLandVehicle = new LandVehicle("Fiat 126p", 36, 24, "Lądowy", "FSM Bielsko Biała", 115000, "0.6L", "spalinowy");
        LandVehicle secondLandVehicle = new LandVehicle("Mercedes", 6, 224, "Lądowy", "Berlin Factory", 215000, "4.0", "spalinowy");
        LandVehicle thirdLandVehicle = new LandVehicle("Tesla Model X", 2, 324, "Lądowy", "Breda Netherlands", 24000, "-", "elektryczny");

        firstLandVehicle.getInfo();
        secondLandVehicle.getInfo();
        thirdLandVehicle.getInfo();

        firstLandVehicle.getPower();
        secondLandVehicle.getPower();
        thirdLandVehicle.getPower();

        firstLandVehicle.getLandVehName();
        secondLandVehicle.getLandVehName();
        thirdLandVehicle.getLandVehName();

        WaterVehicle firstWaterVehicle = new WaterVehicle("Oceanis 36CC", 9, 124, "wodny", "Benateu", 2015, 120, "wody średnie");
        WaterVehicle secondWaterVehicle = new WaterVehicle("Pegaz 696", 14, 24, "wodny", "Pegaz", 2010, 110, "wody płytkie");
        WaterVehicle thirdWaterVehicle = new WaterVehicle("Aquasun 34", 4, 424, "wodny", "Aquasun", 2020, 300, "wody głębokie");

        firstWaterVehicle.getInfo();
        secondWaterVehicle.getInfo();
        thirdWaterVehicle.getInfo();

        firstWaterVehicle.getPower();
        secondWaterVehicle.getPower();
        thirdWaterVehicle.getPower();

        firstWaterVehicle.getWaterVehName();
        secondWaterVehicle.getWaterVehName();
        thirdWaterVehicle.getWaterVehName();

    }

}