import java.io.*;
import java.util.*;
public class R03_NUM03_J{ //NUM03-J. Use integer types that can fully represent the possible range of unsigned data
    /*
    public static int getInteger(DataInputStream is) throws IOException {
            return is.readInt();
    }
    */


    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
    }

    public static void main(String []args) throws IOException{

        InputStream input = new FileInputStream("someFileName.txt");
        DataInputStream data = new DataInputStream(input);

        getInteger(data);
    }
}
