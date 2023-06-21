interface Charger220V {
    void charge();
}

class PhoneCharger implements Charger220V {
    @Override
    public void charge() {
        System.out.println("Зарядка телефона через зарядное устройство 220V");
    }
}

interface Voltage380V {
    void connect();
}

class PowerSupply implements Voltage380V {
    @Override
    public void connect() {
        System.out.println("Подключено напряжение 380V");
    }
}

class Adapter implements Charger220V {
    private final Voltage380V powerSupply;
    private final PhoneCharger phoneCharger;

    public Adapter(Voltage380V powerSupply, PhoneCharger phoneCharger) {
        this.powerSupply = powerSupply;
        this.phoneCharger = phoneCharger;
    }

    @Override
    public void charge() {
        powerSupply.connect();
        phoneCharger.charge();
    }
}


public class Laba22 {
    public static void main(String[] args) {
        PhoneCharger phoneCharger = new PhoneCharger();
        Voltage380V powerSupply = new PowerSupply();
        Charger220V adapter = new Adapter(powerSupply, phoneCharger);

        // phoneCharger.charge();

        // Зарядка через адаптер и напряжение 380 вольт
        adapter.charge();
    }
}
