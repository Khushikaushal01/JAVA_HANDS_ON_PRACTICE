public class BuilderTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Builder Pattern ===");

        
        Computer basicComp = new Computer.Builder("Intel i3", "8GB").build();
        System.out.println("Basic PC: " + basicComp);

        
        Computer gamingComp = new Computer.Builder("Intel i9", "32GB")
                .setStorage("2TB NVMe SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setBluetoothEnabled(true)
                .setWifiEnabled(true)
                .build();
        System.out.println("Gaming PC: " + gamingComp);

        
        Computer officeComp = new Computer.Builder("AMD Ryzen 5", "16GB")
                .setStorage("512GB SSD")
                .setWifiEnabled(true)
                .build();
        System.out.println("Office PC: " + officeComp);

        System.out.println("=== Builder Pattern Test Complete ===");
    }
}
