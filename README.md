# Simple-Custom-Annotation
Proof of concept, showing the ease of using Java <b>JPA</b> annotations and Reflection to browse through annotated code, Testing annotated methods using <b>JUnit</b>.

<h3>JPA Annotations</h3>
This simple project shows in a simple fashion, how java <b>JPA</b> annotations can be used and retrieved at runtime using <b>Reflection</b>. In this project a simple custom annotation is used as an alternative to the formal java docs to document code. Latter in a JUnit test a class is tested to verify
that all of its Methods are <i>"documented"</i>, that is: all of the Methods on this class are marked with the 
```@ItemDoc``` annotation.
