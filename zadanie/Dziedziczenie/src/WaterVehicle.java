public class WaterVehicle extends Vehicle{
    protected String companyName;
    protected int yearOfProduction; //rok produkcji
    protected int fuelTankCapacity;
    private String waterType;

    public WaterVehicle(String name, int age, int enginePower, String vehType, String companyName, int yearOfProduction, int fuelTankCapacity, String waterType) {
        super(name, age, enginePower, vehType);
        this.companyName = companyName;
        this.yearOfProduction = yearOfProduction;
        this.fuelTankCapacity = fuelTankCapacity;
        this.waterType = waterType;

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    /********************************************************
     * nazwa funkcji: getInfo
     * parametry wejściowe: brak
     * wartość zwracana: Dokładne informacje na temat pojazdu wodnego
     * autor: Jan Kapuściński
     * ****************************************************/
    public void getInfo(){
        System.out.println("\nPojazd: " + name + "\nWyprodukowany " + age + " lat temu\nMoc silnika: " + enginePower + "\nTyp pojazdu: " + vehType + "\nNazwa firmy producenta: " + companyName + "\nRok produkcji" + yearOfProduction + "\nPojemność baku paliwa: " + fuelTankCapacity + "\nPrzystosowany pod: " + waterType);
    }

    /********************************************************
     * nazwa funkcji: getPower
     * parametry wejściowe: brak
     * wartość zwracana: moc silnika
     * autor: Jan Kapuściński
     * ****************************************************/
    public void getPower(){
        System.out.println("\nMoc silnika: " + enginePower);
    }

    /********************************************************
     * nazwa funkcji: getWaterVehName
     * parametry wejściowe: brak
     * wartość zwracana: Nazwa pojazdu
     * autor: Jan Kapuściński
     * ****************************************************/
    public String getWaterVehName(){
        String info;
        info = "\nPojazd: " + name;
        return info;
    }
}
