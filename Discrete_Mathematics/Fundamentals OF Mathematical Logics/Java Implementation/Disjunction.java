// Java Implementation of Disjunction Propositions

public class Disjunction {

    // Function to check proposition
    public boolean IsDisjunction(boolean p, boolean q){
        if(p || q == true){
            return true;
        }
        else{
            return false;
        }
    }

    // tests
    boolean output;
    public void main(String[] args) {
        output =IsDisjunction(true, false);
        System.out.println(output); // output: true

        output =IsDisjunction(true, true);
        System.out.println(output); // output: true

        output =IsDisjunction(false, false);
        System.out.println(output); // output: false

        output =IsDisjunction(false, true);
        System.out.println(output); // output: true
    }
}
