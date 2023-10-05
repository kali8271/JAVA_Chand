import java.io.*;
public class CopyData {
    public static void main(String[] args) throws IOException {
        File in = new File("ABC.text");
        File out = new File("XYZ.txt");
        FileOutputStream fos = new FileOutputStream(in);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(2023);
        dos.writeFloat(45.45f);
        dos.writeChar('K');
        dos.write(345);
        // System.out.println("Write Done");

        FileInputStream fis = new FileInputStream(in);
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readFloat());
        System.out.println(dis.readChar());
        System.out.println(dis.read());

        

        FileReader fr = null;
        FileWriter fw = null;
        try 
        {
            fr = new FileReader(in);
            fw = new FileWriter(out);
            int ch;
            while ((ch = fr.read())!= -1) 
            {
                fw.write(ch);
            }
            System.out.println("Write Done");
        } catch (Exception e) 
        {
            System.out.println(e);
        }
        finally
        {
            try 
            {
                fr.close();
                fw.close();
            } catch (Exception e) 
            {
                System.out.println(e);
            }

        }
        dos.close();
        fos.close();
        dis.close();
        fis.close();
    }
}
