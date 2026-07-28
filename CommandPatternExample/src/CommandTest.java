public class CommandTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Command Pattern ===");

        
        Light livingRoomLight = new Light();

        
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        
        RemoteControl remote = new RemoteControl();

        
        System.out.println("--- Pressing remote button for Light ON ---");
        remote.setCommand(lightOn);
        remote.pressButton();

        
        System.out.println("--- Pressing remote button for Light OFF ---");
        remote.setCommand(lightOff);
        remote.pressButton();

        System.out.println("=== Command Pattern Test Complete ===");
    }
}
