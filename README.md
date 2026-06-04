# Smart Home Core Bootstrap Interface (JavaBasics_Task_529_V0.1)

## 📖 Description
Every advanced automated ecosystem begins with a foundational connection confirmation. This project initiates establishing a baseline graphical verification frame for a smart home interaction desk. It constructs a standardized window framework utilizing Java Swing's **`JFrame`** structure, embedding a single non-operational demonstrative **`JButton`** containing a static welcome greeting. The application lifecycle is bound directly to the frame layer, ensuring that closing the user interface gracefully terminates all background processes.

## 📋 Requirements Compliance
- **Verification Component Setup**: Created an operational window container titled "Smart Home" running on the Event Dispatch Thread (EDT).
- **Demonstration Anchor Integration**: Allocated and centered a single `JButton` displaying the required text asset "Hello, Smart Home!".
- **Graceful Lifecycle Execution**: Configured explicit close operations to drop process runtime allocations immediately when the frame drops.
- **Clean Component Resizing**: Leveraged frame packaging routines to scale window geometry relative to the underlying button dimensions.

## 🚀 Architectural Stack
- Java 17+ (Java Swing GUI Library, Concurrency Event Dispatch Threading)

## 🏗️ Implementation Details
- **SmartHomeBootstrap**: Operational root class managing safe thread bootstrapping and sequential component assembly.

## 📋 Expected result
- Running the program displays a small centered window with a button labeled "Hello, Smart Home!".
- Closing the frame via the system window control stops the execution with exit code 0.

## 💻 Code Example

Project Structure:

    JavaBasics_Task_529/
    ├── src/
    │   └── com/yurii/pavlenko/
    │                 └── app/
    │                     └── SmartHomeBootstrap.java
    ├── LICENSE
    ├── TASK.md
    ├── THEORY.md
    └── README.md

Code
```java
package com.yurii.pavlenko.app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SmartHomeBootstrap {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Smart Home");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JButton helloButton = new JButton("Hello, Smart Home!");
            frame.getContentPane().add(helloButton);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
```

## ⚖️ License
This project is licensed under the **MIT License**.

Copyright (c) 2026 Yurii Pavlenko

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files...

License: [MIT](LICENSE)
