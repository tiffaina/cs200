package lec05Animals;

public class Fish extends SizedAnimal {
    double salinity;

    public Fish (int length, double salinity) {
        super(length);
        this.salinity = salinity;
    }

    @Override
    public boolean isNormalSize () {
        return isLenWithin(3, 15);
    }
}
