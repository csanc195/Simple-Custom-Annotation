import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by CarlosSanchez on 1/31/17.
 */
public class BookTest {
    Book someBook;
    Class clazz;

    @Before
    public void setUp() throws Exception {
        someBook = new Book();
        clazz = someBook.getClass();
    }

    @Test
    public void verifyThatAllClassMethodsHaveAnnotatedDoc() throws Exception {
        Method [] methods = clazz.getDeclaredMethods();
        boolean allAnnotated = true;

        for(Method m: methods){
            if(!m.isAnnotationPresent(ItemDoc.class)){
                allAnnotated = false;
                break;
            }
        }
        assertEquals(true, allAnnotated);
    }
}