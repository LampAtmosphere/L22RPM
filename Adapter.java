import com.example.package.Charger220;
import com.example.package.Voltage380;

public class Adapter extends Charger220 {
private Voltage380 voltage;

public Adapter(Voltage380 voltage) {
    this.voltage = voltage;
}

@Override
public void charge() {
    int voltageValue = voltage.getVoltage();
    System.out.println("Используется адаптер для зарядки телефона через напряжение " + voltageValue + " вольт");
    super.charge();
}}