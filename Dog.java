//Dog.java
public class Dog {
  private String name;
  private int age;
  private double weight;
  
  public Dog(String named, int aged, double weighted){ // constructor
    name = named;
    age = aged;
    weight = weighted;
  }
  
  public String getName() { //getters
    return name;
  }
  public int getAge() {
    return age;
  }
  public double getWeight() {
    return weight;
  }
  
  public void setAge(int setAgeTo) { //setters
    age = setAgeTo;
  }
  
  public String toString() { // toString is special
    return "Name: " + name + " Age: " + age + " Weight: " + weight;
  }
  
}