package thisinhduthi;

public class KhoiC extends ThiSinh{
    private static final String van = "van";
    private static final String su = "su";
    private static final String dia = "dia";

    public KhoiC(String name, String address, int priority) {
        super(name, address, priority);
    }

    public KhoiC() {
    }

    @Override
    public String toString() {
        return "Khoi C{"+van + " , "+ su + " ," + dia + " } "+super.toString();
    }
}
