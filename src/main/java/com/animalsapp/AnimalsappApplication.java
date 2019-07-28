class Animal{
    protected int food;
    protected int water;
    protected String name;

    public Animal(int food, int water, String name) {
        this.food = food;
        this.water = water;
        this.name = name;
    }
    public void feed() {
        water -= 100;
        food -=200;
    }
    public void addFood() {
        water += 500;
        food +=500;
        System.out.println("Resupplied water and food. Current " + name + " status is: " + water + " for water and :" + food + " for food.\n");
    }
    public int getFood() {
        return food;
    }
    public int getWater() {
        return water;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name + ", " + food + ", " + water;
    }
}
class Elephant extends Animal{
    protected int consumedWater = 0;
    protected int consumedFood = 0;

    public Elephant(int food, int water, String name, int consumedWater, int consumedFood) {
        super (food, water, name);
        this.consumedWater = consumedWater;
        this.consumedFood = consumedFood;
    }
    @Override
    public void feed() {
        water -= 300;
        food -= 400;
        consumedWater +=300;
        consumedFood += 400;
        System.out.println(name + " has been feeded.Consumed ammount of food was " + consumedFood + " and for water was: " + consumedWater + "\n");
    }
    @Override
    public String toString() {
        return food + " " + water + " " + name + consumedWater + " " + consumedFood;
    }


}
class Tiger extends Animal{
    protected int consumedWater = 0;
    protected int consumedFood = 0;

    public Tiger(int food, int water, String name, int consumedWater, int consumedFood) {
        super(food, water, name);
        this.consumedWater = consumedWater;
        this.consumedFood = consumedFood;
    }
    @Override
    public void feed() {
        water -= 80;
        food -= 200;
        consumedWater +=80;
        consumedFood += 200;
        System.out.println(name + " has been feeded. Consumed ammount of food was " + consumedFood + " and for water was: " + consumedWater + "\n");
    }
    @Override
    public String toString() {
        return food + " " + water + " " + name + consumedWater + " " + consumedFood;
    }
}
class AnimalsappApplication{
    public static void main (String [] args) {
        Elephant lilly = new Elephant (1000, 1000, "Lilly", 0, 0);
        Tiger bob = new Tiger (1000, 1000, "Bob", 0, 0);

        System.out.println("Taking care of elephant named " + lilly.getName() + ".\n");

        for(int i = 0; i <2; i++) {
            lilly.feed();
            lilly.feed();
            lilly.addFood();
            lilly.addFood();
            lilly.addFood();
        }

        System.out.println("Taking care of tiger named" + bob.getName() + ".\n");

        for(int j =0; j <2; j++) {
            bob.feed();
            bob.feed();
            bob.feed();
            bob.addFood();
        }

    }
}