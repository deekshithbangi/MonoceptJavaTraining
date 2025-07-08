Serialization is the process of converting a Java object into a byte stream, so that the object can be:

- Saved to a file
- Transmitted over a network
- Stored in a database as a blob

The reverse process is called Deserialization, where we reconstruct the object from the byte stream.

Why Serialization?
Here are the common use cases:

Storing the state of an object (for persistence)

Sending objects over a network (e.g., in distributed systems like RMI, HTTP APIs)

Caching objects