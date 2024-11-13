import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

class FileHandler {
    // Private member variable to manage file writing
    private FileWriter file;

    // Constructor that opens the file for writing
    public FileHandler(String filename) {
        try {
            file = new FileWriter(filename); // Opens the file for writing
            System.out.println("File '" + filename + "' opened for writing.");
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
    }

    // Method to write data to the file
    public void writeData(String data) {
        if (file != null) {
            try {
                file.write(data + "\n"); // Write data to file followed by a newline
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        } else {
            System.out.println("Cannot write, file is not open."); // Handle case if file is not open
        }
    }

    // Destructor-like method to close the file
    public void closeFile() {
        if (file != null) {
            try {
                file.close(); // Close the file
                System.out.println("File closed successfully.");
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
            file = null; // Set file to null after closing to avoid further access
        } else {
            System.out.println("File is already closed or not open."); // Handle already closed file case
        }
    }

    // Method to read and display the contents of the file
    public void displayFileContents(String filename) {
        System.out.println("The file \"" + filename + "\" is created with the following contents:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line from the file
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the filename from the user
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();

        // Create a FileHandler object which opens the file
        FileHandler fileHandler = new FileHandler(filename);

        // Get data from the user to write to the file
        System.out.println("Enter data to write to the file (type 'exit' to stop):");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break; // Stop the loop when 'exit' is typed
            }
            fileHandler.writeData(input); // Write the input to the file
        }

        // Close the file (this acts like a destructor)
        fileHandler.closeFile();

        // Display the contents of the file
        fileHandler.displayFileContents(filename);

        // Close the scanner
        scanner.close();
    }
}
