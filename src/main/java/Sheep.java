public class Sheep extends FarmAnimal{

    public Sheep(String species) {
        super(species);
    }

    @Override
    public String makeANoise() {
        return "baaa baaa";
    }

    @Override
    public String introduceYourself() {
        return super.introduceYourself() + ", " + makeANoise();
    }


}
