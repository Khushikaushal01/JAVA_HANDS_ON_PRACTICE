public class Computer {
    
    private final String CPU;
    private final String RAM;
    private final String storage;
    private final String graphicsCard;
    private final boolean isBluetoothEnabled;
    private final boolean isWifiEnabled;

    
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isWifiEnabled = builder.isWifiEnabled;
    }

    
    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return storage; }
    public String getGraphicsCard() { return graphicsCard; }
    public boolean isBluetoothEnabled() { return isBluetoothEnabled; }
    public boolean isWifiEnabled() { return isWifiEnabled; }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage 
               + ", graphicsCard=" + (graphicsCard != null ? graphicsCard : "Integrated") 
               + ", Bluetooth=" + isBluetoothEnabled + ", WiFi=" + isWifiEnabled + "]";
    }

    
    public static class Builder {
        
        private final String CPU;
        private final String RAM;

        
        private String storage = "256GB SSD";
        private String graphicsCard;
        private boolean isBluetoothEnabled = false;
        private boolean isWifiEnabled = false;

        
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Builder setWifiEnabled(boolean isWifiEnabled) {
            this.isWifiEnabled = isWifiEnabled;
            return this;
        }

        
        public Computer build() {
            return new Computer(this);
        }
    }
}
