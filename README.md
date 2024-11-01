
# 📟 Caluclator-Program-Lab-01

This repository contains a **Simple Calculator Program** built in Java. The program can perform basic arithmetic operations: **Addition, Subtraction, Multiplication, and Division**.

---

## 🌟 Features

- **User-Friendly Interface**: Prompts the user to select an operation.
- **Flexible Input**: Works with any two numbers of type `double`.
- **Error Handling**: Prevents division by zero.
- **Extensible**: Easily add more operations as needed.

---

## 🛠️ Requirements

- **Java**: Ensure Java Development Kit (JDK) is installed on your machine.
- **IDE** (Optional): You can use an IDE like IntelliJ IDEA, Eclipse, or run it in the command line.

---

## 📂 Project Structure

The code consists of a single Java file:
- **Calculator.java** - Contains all the functionality to perform the operations.

---

## 📝 Code Walkthrough

The calculator follows these steps:

1. **Prompt User**: Choose an operation.
2. **Input Numbers**: Enter two numbers for the calculation.
3. **Perform Calculation**: Based on the operation selected.
4. **Display Result**: Outputs the result of the calculation.

---

## 📜 Usage

### Clone the Repository
```bash
git clone https://github.com/your-username/Calculator.git
cd Calculator
```

### Run the Program
Compile and run the code from your terminal or command prompt:
```bash
javac Calculator.java
java Calculator
```

### Example
1. **Choose Operation**: You will be prompted to select one of the following options:
    - `1` - Addition
    - `2` - Subtraction
    - `3` - Multiplication
    - `4` - Division
2. **Input Values**: Enter two numbers as inputs.
3. **Get Result**: View the result directly in the console.

---

## 📘 Code Example

Here’s the complete code for the calculator:

```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation: 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division");
        int operation = scanner.nextInt();

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double result = 0;
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The result of subtraction is: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result of division is: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
        }

        scanner.close();
    }
}
```

---

## 🔥 Additional Features (Future Enhancements)

- **More Operations**: Add support for operations like exponentiation, square root, etc.
- **GUI**: Implement a graphical user interface using Java Swing or JavaFX.
- **Enhanced Input Validation**: Ensure only valid inputs are processed.

---

## 📜 License

This project is open source and available under the **MIT License**.

---

Feel free to **contribute**, **report issues**, or suggest **enhancements**!

---

### 📬 Contact

If you have any questions, feel free to reach out via:

- **Email**: [your-email@example.com](mailto:your-email@example.com)
- **GitHub**: [your-username](https://github.com/your-username)

---

Happy Coding! 😊

