import java.util.ArrayList;
import java.util.List;

public class Student implements ISaveable {
    private String name;
    private int score;
    private int height;
    private String specialty;

    public Student(String name, int score, int height, String specialty) {
        this.name = name;
        this.score = score;
        this.height = height;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getHeight() {
        return height;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", height=" + height +
                ", specialty='" + specialty + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, name);
        values.add(1, "" + score);
        values.add(2, "" + height);
        values.add(3, specialty);
        return null;
    }

    @Override
    public void read(ArrayList<String> valuesSaved) {
        if(valuesSaved != null && valuesSaved.size() > 0) {
            this.name = valuesSaved.get(0);
            this.score = Integer.parseInt(valuesSaved.get(1));
            this.height = Integer.parseInt(valuesSaved.get(2));
            this.specialty = valuesSaved.get(3);
        }
    }
}
