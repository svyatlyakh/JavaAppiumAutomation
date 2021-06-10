import com.sun.org.apache.xpath.internal.objects.XString;

public class MainClass
{
// Задание 1
    public int getLocalNumber ()
    {
        int number = 15;
        return number;
    }


// Задание 2
    public int getClassNumber ()
    {
        return class_number;
    }
    private int class_number;

    {
        class_number = 20;
    }


// Заданиее 3
    private String class_string = "Hello world";

    public String getClassString()
    {
        return class_string;
    }
}
