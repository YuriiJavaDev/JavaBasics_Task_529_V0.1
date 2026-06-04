package com.yurii.pavlenko.app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Entry point validating graphic runtime setup and window lifecycle bindings for the Smart Home workspace.
 */
public class SmartHomeBootstrap {

    public static void main(String[] args) {
        // Push UI creation routine to the Event Dispatch Thread (EDT) for thread-safe rendering
        SwingUtilities.invokeLater(() -> {

            // Instantiate the main presentation window container with a specific header title
            JFrame frame = new JFrame("Smart Home");

            // Map the frame close button to fully exit the virtual machine process execution
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Instantiate the demonstration interactive component with the greeting label
            JButton helloButton = new JButton("Hello, Smart Home!");

            // Append the interactive component directly into the default center layout lane
            frame.getContentPane().add(helloButton);

            // Automatically recalculate window boundaries based on embedded asset geometry
            frame.pack();

            // Calculate coordinate offset to display the frame directly at the monitor center
            frame.setLocationRelativeTo(null);

            // Flip the window state flag to active to draw the interface components live
            frame.setVisible(true);
        });
    }
}
