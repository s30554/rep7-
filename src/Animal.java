//zadanie.2
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getType();

    public String getName() {
        return name;
    }
}
