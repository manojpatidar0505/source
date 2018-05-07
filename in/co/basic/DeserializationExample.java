package in.co.basic;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class DeserializationExample implements Serializable
{
    private String name;
    DeserializationExample(String name)
    {
        this.name = name;
    }
 
    public static void main(String[] args)
    {
        try
        {
            DeserializationExample d =
                    new DeserializationExample("GeeksForGeeks");
            FileOutputStream f = new FileOutputStream("/E:/file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(f);
            oos.writeObject(d);
            oos.close();
            f.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

