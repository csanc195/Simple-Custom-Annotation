# Simple-Custom-Annotation
Proof of concept, showing the ease of using Java JPA annotations and Reflection to browse through annotated code, Testing annotated methods using JUnit.

<h3>JPA Annotations</h3>
This simple project shows in a simple fashion, how java JPA annotations can be used and retrieved at runtime using Reflection. In this project a simple 
custom annotation is used as an alternative to the formal java docs to document code. Latter in a JUnit test a class is tested to verify
that all of its Methods are "documented", that is: all of the Methods on this class are marked with the @ItemDoc annotation.
