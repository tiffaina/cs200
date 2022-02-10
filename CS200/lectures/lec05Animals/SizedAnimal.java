package lec05Animals;

public abstract class SizedAnimal implements IAnimal {
    int length;

    // the constructor
    public SizedAnimal(int length) {
        this.length = length;
    }

    /**
     * Determines whether length is between the given bounds
     * @param low - the low bound
     * @param high - the high bound
     * @return true if this.length is between low and high, inclusive
     */
    public boolean isLenWithin(int low, int high) {
        return low <= this.length && this.length <= high;
    }
}

