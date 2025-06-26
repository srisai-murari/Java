package oops.clonable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human boy1 = new Human(20, "ramudu");

        //cloning manually takes extra runtime
        Human cloneBoy1 = new Human(20, "ramudu");

        System.out.println(cloneBoy1.age);

//       cloning using functions
        //clones without using new keyword
        Human cloneBoy2 = (Human)(boy1.clone());
        System.out.println(cloneBoy2.age);
    }
}
