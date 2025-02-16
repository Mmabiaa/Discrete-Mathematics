// Java Implementation of Negation Propositions

public class Negation {

    // Function to check negation proposition

    public boolean isNegation(boolean p){
        if(p == true){
            return false;
        }
        else{
            return true;
        }
    }

    // Test
    boolean output;
    public void main(String[] args){
        output = isNegation(true);
        System.out.println(output); //output: false

        output = isNegation(false);
        System.out.println(output); //output: true
    }
}
