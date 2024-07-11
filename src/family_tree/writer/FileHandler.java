package family_tree.writer;

import family_tree.family_tree.FamilyTree;

import java.io.*;


public class FileHandler implements Writer {
    private String filePath = "src/family_tree/Family_tree/writer";

    @Override
    public void save(Serializable serializable) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("filePath.txt"))) {
            objectOutputStream.writeObject(serializable);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Override
    public Object read() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            Object object = objectInputStream.readObject();
            return object;
        } catch (IOException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }

    }

    @Override
    public void setPath(String filePath) {
       this.filePath = filePath;
    }
}

