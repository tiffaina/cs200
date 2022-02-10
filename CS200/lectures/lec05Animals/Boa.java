package lec05Animals;

public class Boa extends SizedAnimal {
    public String name;
    public String eats;

    public Boa(String name, Integer length, String eats) {
        super(length);
        this.name = name;
        this.eats = eats;
    }

    @Override
    public boolean isNormalSize() {
        return isLenWithin(30, 60);
    }
}

