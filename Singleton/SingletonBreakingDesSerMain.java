import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonBreakingDesSerMain {
    public static void main(String[] args) throws Exception {
        SingletonBreakingDesSer singletonBreakingDesSer1 = SingletonBreakingDesSer.getInstance();
        System.out.println(singletonBreakingDesSer1.hashCode());

        // Serialize the singleton instance to a file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.ob"));
        oos.writeObject(singletonBreakingDesSer1);
        oos.close();

        // Deserialize the object from the file
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.ob"));
        SingletonBreakingDesSer singletonBreakingDesSer2 = (SingletonBreakingDesSer) ois.readObject();
        ois.close();
        System.out.println(singletonBreakingDesSer2.hashCode());

        // Because of readResolve(), both hashcodes are identical.
        // Without readResolve(), deserialization would create a new instance,
        // breaking the Singleton pattern.

    }
}
