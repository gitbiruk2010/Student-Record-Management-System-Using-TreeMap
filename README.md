# TreeMap Student Management System
![image](https://github.com/user-attachments/assets/123daaac-71ae-45ce-a497-45038c3036a3)
![image](https://github.com/user-attachments/assets/d5df9219-993f-4c48-8330-e4b3a71bbb4a)

A Simple Java application demonstrating student record management using TreeMap for natural ordering and efficient operations. Part of the Java Collections Framework learning path.

## Features

- **CRUD Operations**:
    - Add new student records with unique IDs
    - Delete existing records by student ID
    - Update student GPA while maintaining ID order
    - Display all records sorted by student ID
- **Advanced Query**:
    - Find students with GPA above specified threshold
- **Efficient Sorting**:
    - Automatic sorting using TreeMap's natural ordering
    - Red-Black Tree implementation for O(log n) operations
- **Error Handling**:
    - Duplicate ID prevention
    - Non-existent ID operations handling

## Installation & Usage

### Prerequisites
- JDK 8 or higher
- IntelliJ IDEA (recommended)

### Setup
1. Clone the repository: https://github.com/gitbiruk2010/Student-Record-Management-System-Using-TreeMap

Running the Application
  Click on play button to run the program or use run button from the menu
## Technical Details
TreeMap Implementation
*     Internal Structure: Red-Black Tree
*     Time Complexity: O(log n) for add/remove/update
*     Sorting: Natural ordering of Integer keys
*     Documentation: Oracle TreeMap Docs
