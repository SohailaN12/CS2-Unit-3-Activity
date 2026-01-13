public class Pet {

   // 1. Declare INSTANCE VAEIABLES 
   private String name;
   private int age;
   private double weight;
   private String type;
   private boolean sterile;


   // 2. Define CONSTRUCTOR
   public Pet() {
    this.name = "Lucy";
    this.age = 13;
    this.weight = 18.000;
    this.type = "Tyrannosaurus";
    this.sterile = true;
   }

   // 3. Define METHODS 

    public Pet( String n, String t, int a) {
    this.name = n;
    this.age = a;
    this.weight = 18.000;
    this.type = t;
    this.sterile = true;
   }

   // getters

   public String getName() {
    return name;
   }

   public int getAge() {
    return age;
   }

   public double getWeight() {
    return weight;
   }

   public String getType() {
    return type; 
   }

   public boolean getSterils() {
    return sterile;
   }

   // toString

   public String toString() {
        String state = "Pet[" + name + "," + age + "," + weight + "," + type + "," + sterile + "]";
        return state;
   }

   // setters

   public void setName( String newName) {
        this.name = newName;
   }

   public void setType( String newType) {
    this.name = newType;
   }

   public void setAge( int newAge) {
    this.name = newAge;
   }



    } // end class 