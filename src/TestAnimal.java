public class TestAnimal extends Lion {

    public static void main(String[] args) {

   Lion myLion1 = new Lion("Leo", 8, "zebras", 54);
   Lion myLion2 = new Lion();


  myLion1.setAge(3);


        System.out.println(myLion1);
        System.out.println(myLion2);


System.out.println("There are " + Lion.numLion() + " lions created !");





    }

}
