package lec05Animals;

public class Dillo extends SizedAnimal {
    public boolean isDead;

    public Dillo(int len, boolean isD) {
        super(len);
        this.isDead = isD;
    }

    // determine whether dillo is long and dead
    public boolean canShelter() {
        return this.isDead && (this.length > 60);
    }

    @Override
    // determine whether length between 12 and 24
    public boolean isNormalSize() {
        return isLenWithin(12,24);
    }
}
