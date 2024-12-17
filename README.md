# Scala Implicit Conversion Bug

This example demonstrates a potential issue with implicit type conversions in Scala constructors.  The `MyClass` constructor attempts to implicitly convert a String to an Int. While this works for valid integer strings, it throws a `NumberFormatException` if the string is not a valid integer representation.

The solution showcases how to handle potential conversion errors gracefully.

## How to reproduce

1. Save the code in `bug.scala`
2. Compile and run the code.  Observe the `NumberFormatException` when trying to create `instance3`.
