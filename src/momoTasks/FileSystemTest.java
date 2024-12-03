package momoTasks;

import java.io.File;

public class FileSystemTest {
    public static void main(String[] args) {
        //объявляем объект для каталога
        File someDir = new File("C://someDir");
        File someDir2 = new File("C://someDir", "SomeDir2");
        File someFile1 = new File("C://someDir", "Hello.txt");
        File someFile2 = new File(someDir, "Hello2.txt");
        File realDir = new File("C://Program Files");
        File realDir2 = new File("C://SomeDir//NewDir");

        boolean created = realDir2.mkdir();
        if(created) {
            System.out.println("Directory created");
        }

        File newRealDir1 = new File("C://SomeDir//NewRealDirRenamed");
        realDir2.renameTo(newRealDir1);
        boolean deleted = newRealDir1.delete();
        if(deleted) {
            System.out.println("Directory deleted");
        }

        String path = someFile1.getAbsolutePath();
        String path2 = someFile2.getAbsolutePath();

        //if(realDir.isDirectory()) {
            //for(File item : realDir.listFiles()) {
                //if(item.isDirectory()) {
                    //System.out.println(item.getName() + "\t folder");
                //} else {
                    //System.out.println(item.getName() + "\t file");
                //}
            //}
        //}
    }
}
