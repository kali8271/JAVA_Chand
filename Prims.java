import java.io.*;
public class Prims {
    public static void main(String[] args) throws IOException {
        File f = new File("pb.text");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(2023);
        dos.writeFloat(45.45f);
        dos.writeChar('K');
        dos.write(345);
        System.out.println("Write Done");

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readFloat());
        System.out.println(dis.readChar());
        System.out.println(dis.read());

        dos.close();
        fos.close();
        dis.close();
        fis.close();
    }
}
