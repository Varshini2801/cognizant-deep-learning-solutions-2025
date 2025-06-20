public class ComputerTest {
    public static void main(String[] args) {
        // Build a basic computer
        Computer basicComputer = new Computer.Builder("Intel i3", "8GB").build();

        // Build a high-end computer
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();

        System.out.println("Basic Computer Configuration:");
        basicComputer.displayConfig();

        System.out.println("\nGaming Computer Configuration:");
        gamingComputer.displayConfig();
    }
}
