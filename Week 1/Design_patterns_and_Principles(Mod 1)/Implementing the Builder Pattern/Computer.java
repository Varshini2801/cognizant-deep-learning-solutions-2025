public class Computer {
    // Required attributes
    private String CPU;
    private String RAM;

    // Optional attributes
    private String storage;
    private String graphicsCard;
    private String operatingSystem;

    // Private constructor
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;
        private String operatingSystem;

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

        public Builder setOperatingSystem(String os) {
            this.operatingSystem = os;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void displayConfig() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + (storage != null ? storage : "Not specified"));
        System.out.println("Graphics Card: " + (graphicsCard != null ? graphicsCard : "Not specified"));
        System.out.println("Operating System: " + (operatingSystem != null ? operatingSystem : "Not specified"));
    }
}
