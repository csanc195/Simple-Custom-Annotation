import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by CarlosSanchez on 1/31/17.
 *
 * This is a simple custom annotation that serves as proof of conccept
 * to show how easy it is to get started and apply your own custom annotations
 * to your existent java code.

 *
 * The official Oracle specifications can be found here:
 * https://docs.oracle.com/javase/7/docs/api/java/lang/annotation/RetentionPolicy.html
 *
 * The following custom interface is just an example of an interface that can be used to
 * tag all needed methods and ensure that they are being properly documented. It may not
 * be the best way to document code but it serves the purpose to show the simplicity of
 * java annotations. In this case the annotation is specified to be retained
 * during runtime. But annotations can be retained using two other retention policies
 * "SOURCE" and "CLASS", and each has their own use and application. I suggest the
 * following source to learn more about them:
 * * http://www.java2novice.com/java-annotations/retention-policy/
 * This annotation has 3 fields, which are "desc", which will include the method's
 * description, "params" which describes the function's parameters and returns which
 * describes the function's return if anny.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ItemDoc {
    String desc() default "";
    String params() default "";
    String returns() default "";
}
