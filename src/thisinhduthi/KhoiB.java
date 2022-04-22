package thisinhduthi;

public class KhoiB extends ThiSinh{
    private static final String toan = "toan";
    private static final String hoa = "hoa";
    private static final String sinh = "sinh";

    public KhoiB(String name, String address, int priority) {
        super(name, address, priority);
    }

    public KhoiB() {
    }

    @Override
    public String toString() {
        return "Khoi B{"+toan + " , "+ hoa + " ," + sinh + " } "+super.toString();
    }
}
