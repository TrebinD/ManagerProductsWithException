public class Smartphone extends Product {
    protected String manufacture;

    public Smartphone(int id, String name, int coast, String manufacture) {
        super(id, name, coast);
        this.manufacture = manufacture;
    }
}
