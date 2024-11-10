# Terminal-Based Book Management Project

This project is a terminal-based application for managing a list of books. It allows users to list, add, update, delete, and sort books by various criteria. The data is mocked, and functionalities are organized into different packages for better structure and maintainability.

## Features

- **List Books:** Displays all books in the simulated database.
- **Search Book by Code:** Retrieves a specific book using its unique code.
- **Sort Books:**
  - **By Code:** Uses the bubble sort method.
  - **By Author:** Uses the selection sort method.
- **Add New Book:** Adds a new book to the database.
- **Update Book:** Updates information of a specific book using its code.
- **Delete Book:** Removes a book from the database by its code.

## Project Structure

- **`customSystem` Package:** Manages user interactions with the terminal.
- **`dataBase` Package:** Simulates the database with `get`, `add`, `update`, and `delete` methods.
- **`interface` Package:** Defines the structure of the book object.
- **`sort` Package:** Contains sorting methods.
- **Additional Classes:**
  - **`actions`:** Defines the main actions of the application.
  - **`getBookInfo`:** Collects and structures information for new books or updates.
  - **`showBookInfo`:** Displays book information in a defined format.

## Installation

1. Clone the repository.
2. Compile the project.
3. Run the application from the terminal.

## Usage

Each function is executed through commands in the terminal. Follow the on-screen instructions to add, update, list, or delete books, and to sort them according to your preferences.

![Screenshot 2024-11-10 at 4 20 44 PM](https://github.com/user-attachments/assets/2c54eeb8-f70c-47b2-bbc0-5182326f21eb)


## Requirements

![Screenshot 2024-11-10 at 4 20 06 PM](https://github.com/user-attachments/assets/fdd8b993-f482-4bce-9404-daec2eadc0eb)
