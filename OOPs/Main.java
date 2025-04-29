package OOPs;
 

 class Animal {
    public void makeSound(){
 }
}
 class cat extends Animal {
    @Override
    public void makeSound(){
           System.out.println("barck");
    }
 }
 public class Main {
    public static void main(String[] args) {
       Animal myCat = new cat();       
       myCat.makeSound();    
    }
}