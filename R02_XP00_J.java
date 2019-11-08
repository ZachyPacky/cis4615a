 edit
import java.io.*;
public class R02_XP00_J{ //EXP03-J. Do not use the equality operators when comparing values of boxed primitives
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

public void deleteFile() {
  File someFile = new File("someFileName.txt");
  //Do something with someFile
  if (!someFile.delete()) {
    //Handle failure to delete the file
  }
 master
}
