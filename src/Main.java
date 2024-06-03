interface Adapter {
    void plugIn();
}
class Voltage380V {
    public void plugIn380V() {
        System.out.println("Подключено напряжение 380 Вольт");
    }
}

class Charger220V {
    public void plugIn220V() {
        System.out.println("Подключено зарядное устройство 220 Вольт");
    }
}

class VoltageAdapter implements Adapter {
    private Voltage380V voltage380V;

    public VoltageAdapter(Voltage380V voltage380V) {
        this.voltage380V = voltage380V;
    }

    @Override
    public void plugIn() {
        System.out.println("Преобразование напряжения 380 Вольт в 220 Вольт");
        voltage380V.plugIn380V();
    }
}

public class Main {
    public static void main(String[] args) {
        Voltage380V voltage380V = new Voltage380V();
        Charger220V charger220V = new Charger220V();
        charger220V.plugIn220V();

        Adapter adapter = new VoltageAdapter(voltage380V);
        adapter.plugIn();
    }
}
