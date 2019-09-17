# Stream
Stream is a new concept introduced in JAVA 8 that provides a simple functional way to process a collecion of data. Stream does not hold or contain data, it allows only to process the data in parallel or sequential way using intermediate or terminal operations.

# Intermediate operations
Intermediate operation returns always another stream, which allows you to call multiple operations in a form of a query. When you invoke an intermediate operation on a stream, the operation is not executed immediately, it is only executed until a terminal operation is invoked! LAZY is not a bad thing after all :)

# Terminal operations
Terminal operation produces a non-stream result, it is the final step! You can not use the stream again after the terminal operation invocation. The stream becomes consumed!
