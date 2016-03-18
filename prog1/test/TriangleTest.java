import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;

/**
 * Created by luvian on 16/3/18.
 */
public class TriangleTest {
    @Test
    public void test() {
        Set<String>typeSet = new HashSet<String> ();
        typeSet.add("Equilateral");
        typeSet.add("Isosceles");
        typeSet.add("Scalene");

        Triangle t1 = new Triangle("a", "b", "c");
        String type1 = t1.determineTriangleType();
        if(typeSet.contains(type1)){
            fail("error of type");
            }

        Triangle t2 = new Triangle("1", "1", "1");
        String type2 = t2.determineTriangleType();
        if(!typeSet.contains(type2)){
            fail("error of type");
            }
        assertEquals("Isosceles", type2);
        }
}
