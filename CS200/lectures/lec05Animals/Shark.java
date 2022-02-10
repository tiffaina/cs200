package lec05Animals;

public class Shark extends Fish {
    int attacks;

    public Shark (int length, int attacks) {
        super(length, 3.75);
        this.attacks = attacks;
    }
}

