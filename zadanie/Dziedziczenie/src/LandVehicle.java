public class LandVehicle extends Vehicle{
    protected String factoryName;
    protected int course;
    protected String engine;
    protected String landVehType;

    public LandVehicle(String name, int age, int enginePower, String vehType, String factoryName, int course, String engine, String landVehType) {
        super(name, age, enginePower, vehType);
        this.factoryName = factoryName;
        this.course = course;
        this.engine = engine;
        this.landVehType = landVehType;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getLandVehType() {
        return landVehType;
    }

    public void setLandVehType(String landVehType) {
        this.landVehType = landVehType;
    }

    /********************************************************
     * nazwa funkcji: getInfo
     * parametry wejściowe: brak
     * wartość zwracana: Dokładne informacje na temat pojazdu lądowego
     * autor: Jan Kapuściński
     * ****************************************************/
    public void getInfo(){
        System.out.println("\nPojazd: " + name + "\nWyprodukowany " + age + " lat temu\nMoc silnika: " + enginePower + "\nTyp pojazdu: " + vehType + "\nWyprodukowano w: " + factoryName + "\nPrzebieg: " + course + "\nSilnik: " + engine + "\nTyp pojazdu lądowego: " + landVehType);
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
     * nazwa funkcji: getLandVehName
     * parametry wejściowe: brak
     * wartość zwracana: Nazwa pojazdu
     * autor: Jan Kapuściński
     * ****************************************************/
    public String getLandVehName(){
        String info;
        info = "\nPojazd: " + name;
        return info;
    }
}
