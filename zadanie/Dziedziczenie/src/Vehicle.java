public class Vehicle {
    protected String name;
    protected int age;
    protected int enginePower;
    protected String vehType;


    public Vehicle(String name, int age, int enginePower, String vehType) {
        this.name = name;
        this.age = age;
        this.enginePower = enginePower;
        this.vehType = vehType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getVehType() {
        return vehType;
    }

    public void setVehType(String vehType) {
        this.vehType = vehType;
    }


    /********************************************************
     * nazwa funkcji: getInfo
     * parametry wejściowe: brak
     * wartość zwracana: Dokładne informacje na temat pojazdu
     * autor: Jan Kapuściński
     * ****************************************************/
    public void getInfo(){
        System.out.println("\nPojazd: " + name + "\nWyprodukowany " + age + " lat temu\nMoc silnika: " + enginePower + "\nTyp pojazdu: " + vehType);
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
     * nazwa funkcji: getVehName
     * parametry wejściowe: brak
     * wartość zwracana: Nazwa pojazdu
     * autor: Jan Kapuściński
     * ****************************************************/
    public String getVehName(){
        String info;
        info = "\nPojazd: " + name;
        return info;
    }

}

