import java.io.*;

public class FileMover {

    public static String copyFile(String addr, String where){

        File file = new File(where);

        try {
            file.createNewFile();
        } catch (IOException e) {
            return "error creating copy";
        }

        try (FileInputStream fstr = new FileInputStream(addr)) {
            byte [] data = new byte[fstr.available()];
            fstr.read(data);
            fstr.close();
            try (FileOutputStream ostr = new FileOutputStream(where)) {
                ostr.write(data);
                ostr.close();
            } catch (IOException e) {
                return "error creating copy";
            }

        } catch (IOException e) {
            return "file not found";
        }
        return "Copied!!";
    }
    public static String replFile(String addr, String where){

        File file = new File(where);
        File file1 = new File(addr);

        try {
            file.createNewFile();
        } catch (IOException e) {
            return "Error copying";
        }

        try (FileInputStream fstr = new FileInputStream(addr)) {
            byte [] data = new byte[fstr.available()];
            fstr.read(data);
            fstr.close();
            try (FileOutputStream ostr = new FileOutputStream(where)) {
                ostr.write(data);
                ostr.close();
            } catch (IOException e) {
                return "error writing file";
            }

        } catch (IOException e) {
            return "error reading file";
        }
        file1.delete();
        return "File was replaced";

    }
}
