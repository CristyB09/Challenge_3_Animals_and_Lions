public class Animal {

    public String foodtype;
    public int lifeExpentancy;

    public Animal() {
        foodtype = null;
        lifeExpentancy = 0;
    }

    public Animal(String food){
        foodtype = food;
        lifeExpentancy = 0;
    }

    public  Animal(int life) {
        foodtype = null;
        lifeExpentancy = life;
    }

    public  Animal(String food, int life) {
        foodtype = food;
        lifeExpentancy = life;
    }

    public  String toString() {
        String result = "This ";
        if (foodtype != null) result += foodtype + " eater ";
        if (lifeExpentancy == 0)
            result += "lives for an unknown number of year.";
        else result += "typically lives for " + lifeExpentancy + " years.";
        return result;
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(3);
        Animal animal3 = new Animal("grass");
        Animal animal4 = new Animal("meat", 10);

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);



    }


}
