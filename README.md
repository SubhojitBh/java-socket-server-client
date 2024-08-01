# Java Socket Server-Client

This repository contains a simple implementation of a server-client architecture using Java sockets. The server listens for incoming connections on a specified port and the client connects to the server to exchange messages.

## Features

- Server listens on port 4999 for incoming client connections.
- Client connects to the server on localhost.
- Client sends a message to the server.
- Server reads the message and responds back to the client.
- Resources are managed using try-with-resources to ensure proper closure.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- Basic understanding of Java I/O and networking

### Running the Server

1. Compile the `MyServer` class:
    ```sh
    javac MyServer.java
    ```

2. Run the `MyServer` class:
    ```sh
    java MyServer
    ```

### Running the Client

1. Compile the `MyClient` class:
    ```sh
    javac MyClient.java
    ```

2. Run the `MyClient` class:
    ```sh
    java MyClient
    ```