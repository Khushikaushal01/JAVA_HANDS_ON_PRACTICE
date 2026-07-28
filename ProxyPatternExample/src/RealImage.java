public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromRemoteServer();
    }

    private void loadFromRemoteServer() {
        System.out.println("Loading image: '" + fileName + "' from remote server (simulating network latency)...");
        try {
            
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Image: '" + fileName + "' successfully loaded from server.");
    }

    @Override
    public void display() {
        System.out.println("Displaying Real Image: '" + fileName + "'");
    }
}
