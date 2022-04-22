package thisinhduthi;

public class ThiSinh {
    private static int id = 0;
    private String name;
    private String address;
    private int priority;

    public ThiSinh( String name, String address, int priority) {
        this.id = id++;
        this.name = name;
        this.address = address;
        this.priority = priority;
    }

    public ThiSinh() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "id=" + id++ +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority +
                '}';
    }
}
