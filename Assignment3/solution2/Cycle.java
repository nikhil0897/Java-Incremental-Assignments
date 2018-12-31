package solution2;

public class Cycle {
    Cycle(){
        System.out.println("Cycle created.");
    }
}

class Unicycle extends Cycle{
    public void balance(){
        System.out.println("This balance is for Unicycle.");
    }
}

class Bicycle extends Cycle{
    public void balance(){
        System.out.println("This balance is for Bicycle.");
    }
}

class Tricycle extends Cycle{

}

