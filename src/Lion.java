public class Lion extends Animal {
    //instance variables
    private int age;
    private String name;
    public static int numLion = 0;

    public static int numLion() {
        return numLion;
    }


    //default constructor
    public Lion() {
        super();
        name = null;
        age = 0;
        numLion++;
    }


    public Lion(String anName, int anAge, String food, int life){
        super(food, life);
        age = anAge;
        name = anName;
        numLion++;
    }



    public String getName() {
        return name;
    }

    public void setName(String aName)
    {
        name = aName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int anAge) {
        age = anAge;
    }





    public String toString() {
       String result = "";
       if (name !=null) result += name + " is ";
       else result += "This un-named lion is ";
       if (age > 0) result += age + " years old. ";
       else result += "of unknow age. ";
       result += super.toString();
       return result;
    }


    }
