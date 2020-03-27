import java.io.*;

public class Driver {

    private static final String FilePath = "Record.dat";

    public static void main(String[] args) {
        writeToFile(FilePath);
        readFromFile(FilePath);
    }

    private static void writeToFile(String filePath) {
        try (ObjectOutputStream recordOOS = new ObjectOutputStream(new FileOutputStream(filePath));) {
            Record r1 = new Record();
            Record r2 = new Record();
            recordOOS.writeObject(r1);
            recordOOS.writeObject(r2);

            r2.setSongTitle("title");
            r2.setArtist("artist");
            // have to call reset to update values
            recordOOS.reset();
            recordOOS.writeObject(r2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile(String filePath) {
        try (ObjectInputStream recordOIS = new ObjectInputStream(new FileInputStream("Record.dat"));) {
            while (true) {
                System.out.println(recordOIS.readObject());
            }
        } catch (EOFException ignored) {
        } catch (Exception err) {
            System.out.println(err);
        }
    }
}
