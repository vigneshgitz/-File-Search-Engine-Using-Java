# -File-Search-Engine-Using-Java
This project is a Java-based search engine that allows users to search for files within a specified directory. It leverages Java NIO's Files.walkFileTree to recursively traverse directories and locate files based on user input. The program efficiently handles symbolic links and includes robust error handling mechanisms.
# Java Search Engine Project

## Overview
This Java-based search engine project allows users to efficiently search for files within a directory.

## Features
- Uses `Files.walkFileTree` to traverse directories.
- Implements `SimpleFileVisitor` to handle file searching.
- Supports symbolic links.
- User input for search criteria.
- Error handling for failed file accesses.

## How to Use
1. Clone the repository.
2. Compile and run the `SearchFile.java` file.
3. Enter the filename or keyword to search.
4. The program will display matching files.

## Installation
```sh
javac SearchFile.java
java SearchFile
```

## Example Output
```
Enter the file name:
example.txt
File you have searched: /home/user/documents/example.txt
```

## Technologies Used
- Java
- NIO File API

## Contributing
Feel free to fork the repository and submit pull requests for improvements.

## License
This project is licensed under the MIT License.
