import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
// Задание 1
    @Test
    public void testGetLocalNumber ()
    {
        int a = this.getLocalNumber();
        if (a == 14) {
            System.out.println("Success");
        } else {
            System.out.println("Number != 14");
        }
    }

// Задание 2
    @Test
    public void testGetClassNumber ()
    {
        int b = this.getClassNumber();
        if (b > 45) {
            System.out.println("Success");
        } else {
            System.out.println("Number < 45");
        }

    }

// Задание 3
    @Test
    public void testGetClassString()
    {
        String c = this.getClassString();
        Assert.assertTrue("Подстрока 'hello'/'Hello' не входит в строку",(c.contains("Hello")) | (c.contains("hello")));

    }
}
