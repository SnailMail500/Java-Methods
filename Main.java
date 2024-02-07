public class Main {
    static void newMethod(){//static means that the method belongs to class Main and is not an object of that class
        //void means that nothing will be returned
        //Basically a subroutine (or a function if it returns something)
        System.out.println("This method has been executed if this statement prints");
    }
    static String returnString(String input){//the function takes the parameter and changes its identifier temporarily to "input"
        return input;//then immediately sends it back
    }
    public static void main (String[] args){
        newMethod();
        String name = "bob";
        System.out.println(returnString(name));//about as simple a method involving return as possible- takes name... passes it straight back to be printed.
        //name is passed through as an argument, which becomes a parameter to the function. Simples.
    }
}
