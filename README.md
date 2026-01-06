# Hello World JavaFX Application

A simple JavaFX desktop application that displays a "Hello World" dialog window with a quit button.

## 📋 Table of Contents

- [About](#about)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Running Unit Tests](#running-unit-tests)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Development Notes](#development-notes)
- [Contributing](#contributing)
- [License](#license)

## 🎯 About

This is a basic JavaFX application that demonstrates the fundamental structure of a JavaFX desktop application. When launched, it displays a simple window containing a "Hello World!" message and a quit button.

## ✨ Features

- Simple and clean user interface
- Cross-platform desktop application
- Modular Java application structure
- Unit testing with JUnit 5
- Maven-based build system

## 📋 Prerequisites

Before running this application, ensure you have the following installed:

- **Java Development Kit (JDK) 21** or later
  - Download from: https://adoptium.net/
- **Apache Maven 3.6+**
  - Download from: https://maven.apache.org/download.cgi
- **JavaFX SDK 25.0.1**
  - Download from: https://gluonhq.com/products/javafx/

### Environment Setup

1. Install JDK 21 and set `JAVA_HOME` environment variable
2. Install Apache Maven and ensure `mvn` command is available in PATH
3. Download and extract JavaFX SDK to a known location (e.g., `C:\Program Files\JavaFX\javafx-sdk-25.0.1`)

## 🚀 Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/blu28/hw-cline.git
   cd hw-cline
   ```

2. **Update JavaFX path (if necessary):**
   - Open `pom.xml`
   - Update the `javafx.sdk.path` property to point to your JavaFX SDK installation:
     ```xml
     <javafx.sdk.path>C:/Program Files/JavaFX/javafx-sdk-25.0.1</javafx.sdk.path>
     ```

3. **Compile the project:**
   ```bash
   mvn clean compile
   ```

## 🎮 Running the Application

### Method 1: Using the Batch Script (Windows)
```bash
.\run.bat
```

### Method 2: Using Maven
```bash
mvn exec:exec
```

### Method 3: Direct Java Execution
```bash
java --enable-native-access=javafx.graphics --module-path "C:\Program Files\JavaFX\javafx-sdk-25.0.1\lib;target\classes" --add-modules javafx.controls,javafx.fxml --module com.example.helloworld/com.example.helloworld.Main
```

**Note:** Update the JavaFX path in the command above to match your installation directory.

When the application starts, you'll see a window with:
- A "Hello World!" message
- A "Quit" button to close the application

## 🧪 Running Unit Tests

### Method 1: Using Maven (Recommended)
```bash
mvn test
```

### Method 2: Generate Test Reports
```bash
mvn surefire-report:report
```

**Test Results:**
- **Test Class:** `MainTest`
- **Tests Included:**
  - JUnit framework verification
  - Basic class loading functionality

**Note:** The tests temporarily disable the module system during execution to avoid JavaFX dependency conflicts. This is handled automatically by the Maven configuration.

## 📁 Project Structure

```
hw-cline/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/example/helloworld/
│   │   │   │   ├── Main.java          # Main JavaFX application class
│   │   │   └── module-info.java       # Java module definition
│   ├── test/
│   │   └── java/
│   │       └── com/example/helloworld/
│   │           └── MainTest.java      # Unit tests
├── target/                            # Build output directory (ignored)
├── .gitignore                         # Git ignore rules
├── pom.xml                            # Maven project configuration
├── run.bat                            # Windows batch script to run app
└── README.md                          # This file
```

## 🛠 Technologies Used

- **Java 21** - Programming language and runtime
- **JavaFX 25.0.1** - GUI framework for desktop applications
- **JUnit 5.10.0** - Testing framework
- **Maven 3.11.0** - Build automation and dependency management
- **Windows Command Prompt** - Script execution environment

## 📝 Development Notes

### Module System
This project uses Java's module system (JPMS) for better encapsulation and dependency management. The module `com.example.helloworld` requires JavaFX modules for GUI functionality.

### Testing Challenges
Due to JavaFX module dependencies, unit tests are run in classpath mode (non-modular) to avoid compilation conflicts. The Maven Surefire plugin is configured to handle this automatically.

### JavaFX Native Access
The application uses `--enable-native-access=javafx.graphics` to allow JavaFX native graphics access, which is required for modern JavaFX applications.

### Build Configuration
- Source/target compatibility: Java 21
- UTF-8 encoding for source files
- Modular compilation with JavaFX module path

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 🆘 Troubleshooting

### Common Issues:

1. **"Module javafx.controls not found"**
   - Ensure JavaFX SDK is installed and path is correct in `pom.xml`
   - Verify `JAVA_HOME` is set to JDK 21+

2. **"mvn command not found"**
   - Install Apache Maven and add to PATH
   - Or use full path to mvn executable

3. **Tests failing with module errors**
   - The Maven configuration should handle this automatically
   - If issues persist, try `mvn clean test`

4. **Application won't start**
   - Ensure `target/classes` directory exists (run `mvn compile` first)
   - Check JavaFX SDK installation and paths

### Support

If you encounter issues:
1. Check the prerequisites are correctly installed
2. Verify all paths in `pom.xml` match your system
3. Run `mvn clean compile` to ensure the project builds
4. Check the console output for specific error messages

---

**Happy coding! 🎉**
