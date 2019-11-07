import java.io.*;
public class R00_IDS03_J{
    /*
    public void deleteFile() {
        File someFile = new File("someFileName.txt");
        //Do something with someFile
        someFile.delete();
    }
    */

    public static void deleteFile() {
        File someFile = new File("someFileName.txt");
        //Do something with someFile
        if (!someFile.delete()) {
            //Handle failure to delete the file
        }
    }
    
    public static void main(String []args) {
        deleteFile();
    }
}
