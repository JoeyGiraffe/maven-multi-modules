package orz.joey.repository;

public class Girl {

    private String name;

    public Girl() {}

    public Girl(String name) {
        this.name = name;
    }

    public static Girl findTrueLove(String name) {
        return new Girl(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
