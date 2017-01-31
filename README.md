# Simple-Custom-Annotation
Proof of concept, showing the ease of using Java <b>JPA</b> annotations and Reflection to browse through annotated code, Testing annotated methods using <b>JUnit</b>.

<h3>JPA Annotations</h3>
This simple project shows in a simple fashion, how java <b>JPA</b> annotations can be used and retrieved at runtime using <b>Reflection</b>. In this project a simple custom annotation is used as an alternative to the formal java docs to document code. Latter in a JUnit test a class is tested to verify
that all of its Methods are <i>"documented"</i>, that is: all of the Methods on this class are marked with the @ItemDoc annotation.

<h3>The @ItemDoc Annotation</h3>

``` java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ItemDoc {
    public String desc() default "";
    public String params() default "";
    public String returns() default "";
}

```
<ul>
  <li><h4>@RetentionPolicy</h4>
  <p>This Annotation describes how should this annotation be treated, in this case the annotation is preserved at runtime
  </p>
  </li>
  <li><h4>@Target</h4>
    <p>
    This annotation describes the targets unto which the custom annotation @ItemDoc can be applied, in this case the annotation can be applied to only Methods.
    </p>
  </li>
  <li>
  <h3>The Body of @ItemDoc</h3>
  <p>
    In the body of the custom tag, the following fields are declared:
    <i>"desc"</i>, which is to be used to describe the Method, <i>"params"</i> which is used to describe the Method's params, and <i>"returns"</i> which is to describe what the function returns.
  </p>
  </li>
</ul>


