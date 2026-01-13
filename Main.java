public class Main {

   public static void main(String []args) {
     
      Pet basicPet = new Pet();
      System.out.println(basicPet); 

      Pet tyrannosaurus = new Pet ("Lucy", "Tyrannosaurus", 70);
      System.out.println(tyrannosaurus);

      System.out.println(tyrannosaurus.getType() );

      double weight = tyrannosaurus.getWeight();
      System.out.println( weight );

      tyrannosaurus.setName("Lucy");
      tyrannosaurus.setType("tyrannosaurus");
      tyrannosaurus.setAge(13);

      System.out.println(tyrannosaurus);
      
   }
}