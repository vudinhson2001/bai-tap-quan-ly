package thisinhduthi;

public class KhoiA extends ThiSinh{
    private static final String toan= "Toan";
    private static final String ly= "ly";
    private static final String hoa= "hoa";

    public KhoiA(String name, String address, int priority) {
        super(name, address, priority);
    }

    public KhoiA() {
    }

    @Override
    public String toString() {
        return "Khoi A{"+toan + " , "+ ly + " ," + hoa + " } "+super.toString();
    }
}
