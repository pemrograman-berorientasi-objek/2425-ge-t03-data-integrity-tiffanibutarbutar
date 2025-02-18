package academic.model;

/**
 * @author 12S23001-Kevin Gultom
 * @author 12S23010-Tiffani Butar-butar
 */
public class Student {
    private final String id;
    private String name;
    private final int year;
    private String major;

    public Student(String id, String name, int year, String major) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return id + "|" + name + "|" + year + "|" + major;
    }
}