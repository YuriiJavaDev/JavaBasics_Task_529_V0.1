### Imagine you're taking the first steps in creating an interactive control panel for your future smart home. Your first task is simply to demonstrate that the system is live and ready for interaction.

#### You'll need to develop a Java program that will open the main control window on the screen. This window, a JFrame, should contain a single button. This button should display a friendly greeting: "Hello, Smart Home!"

#### Key point: When the user finishes working and decides to close this window, your program should exit gracefully. At this stage, clicking the button itself shouldn't trigger any visible actions or messages—its role is purely for demonstration purposes.

```java
import javax.swing.*;

public class SmartHomeBootstrap {
    public static void main(String[] args) {
        // Create the UI on the Event Dispatch Thread - this is the thread for all Swing operations
        SwingUtilities.invokeLater(() -> {
            // Main control window
            JFrame frame = new JFrame("Smart Home");
            // When the window closes, terminate the entire application
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // One demo button with a greeting
            JButton helloButton =
            // Add the button to the center (default BorderLayout)
            frame.getContentPane().add(helloButton);
            
            frame.pack(); // Adjust the size to fit the contents
            frame.setLocationRelativeTo(null); // Center the window on the screen
            frame.setVisible(true); // Show the window
        });
    }
}
```
