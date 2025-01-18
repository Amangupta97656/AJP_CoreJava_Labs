public class LEDLight {

  public static void main(String[] args) {
    int lightState = 0b000; // Initial state: All lights are OFF (binary 000)

    // Turn ON Light 1 (Bit 0)
    lightState = lightState | 0b001; // Using bitwise OR to set Bit 0 to 1
    System.out.println("Light 1 turned ON. Current state: " + toBinaryString(lightState));

    // Check if Light 2 (Bit 1) is ON or OFF
    boolean isLight2On = (lightState & 0b010) != 0; // Using bitwise AND to check Bit 1
    System.out.println("Light 2 is " + (isLight2On ? "ON" : "OFF"));

    // Turn OFF Light 3 (Bit 2)
    lightState = lightState & 0b011; // Using bitwise AND to set Bit 2 to 0
    System.out.println("Light 3 turned OFF. Current state: " + toBinaryString(lightState));

    // Display the final state of all lights in binary format
    System.out.println("Final state of lights (binary): " + toBinaryString(lightState));
  }

  // Helper method to display a 3-bit binary representation of the light state
  private static String toBinaryString(int num) {
    return String.format("%3s", Integer.toBinaryString(num)).replace(' ', '0');
  }
}
