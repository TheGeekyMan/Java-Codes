import java.util.*;

abstract class Adult{
    abstract int adultInterest()
}

class Bank extends Adult,Young{

        int adultInterest(){
            return 7;
        }
        int youngInterest(){
            return 5;
        }
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.all();
    }
}
