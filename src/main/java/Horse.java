public class Horse extends FarmAnimal {
    private String breed;

    public Horse(String species, String breed){
        super(species);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String makeANoise() {
        return "neigh";
    }

    @Override
    public String introduceYourself() {
        return super.introduceYourself() + ", " + makeANoise();
    }
}
