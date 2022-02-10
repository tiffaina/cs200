package lec05Animals;

public class Zoo {
    IAnimal animal1;
    IAnimal animal2;

    public Zoo(IAnimal ani1, IAnimal ani2) {
        this.animal1 = ani1;
        this.animal2 = ani2;
    }

    /**
     * determines whether both animals are normal size
     * @return a string saying whether both animals passed the check
     */
    public String healthCheck() {
        if (animal1.isNormalSize() && animal2.isNormalSize()) {
            return "Passed";
        }
        else {
            return "Failed";
        }
    }
}
