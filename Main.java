// Main.java

class Main {
    public static void main(String[] args) {
    	Dog fido = new Dog("fido",5,11.1);
    	System.out.println(fido.getName());
    	System.out.println(fido.getAge());
    	System.out.println(fido.getWeight());
    	
    	System.out.println(fido); 
    }
}