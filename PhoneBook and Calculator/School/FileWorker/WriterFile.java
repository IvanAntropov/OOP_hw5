package School.FileWorker;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriterFile {

    public WriterFile() {
    }

    public void write(String path, String data) {
        try {
            PrintWriter output = new PrintWriter(new FileWriter(path, true));
            output.write(data);
        }catch(Exception e)
        {
            e.getStackTrace();
        }
    }

    public void writeWithoutAdd(String path, String data) {
        try {
            FileWriter output = new FileWriter(path);
            output.write(data);
        }catch(Exception e)
        {
            e.getStackTrace();
        }
    }

}