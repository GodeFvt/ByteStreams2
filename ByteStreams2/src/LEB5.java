import java.io.*;
import java.util.logging.Logger;

public class LEB5 {
    public static void main(String[] args) {
        Student s1 = new Student("65054", "Phuttinan");
        try {
            FileOutputStream file = new FileOutputStream("object.dat");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(s1);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LEB5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LEB5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        try {
            FileInputStream file = new FileInputStream("object.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            Student s2 = (Student) input.readObject();
            System.out.println(s2);
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LEB5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LEB5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LEB5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }
}
