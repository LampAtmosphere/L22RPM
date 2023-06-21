import com.example.package.Adapter;
import com.example.package.Charger220;
import com.example.package.Voltage380;


public class Main {
public static void main(String[] args) {
Voltage380 voltage = new Voltage380();
Charger220 charger = new Adapter(voltage);
charger.charge();
}
}