
    // Java Implementation of Conjunction Propositions

public class Conjunction {

    // Function to check Conjunction proposition
    public boolean IsConjunction(boolean p, boolean q){
        if (p && q == true){
            return true;
        }
        else{
            return false;
        }
    }

    //Test
    boolean output;
    public void main(String[] args){

        output = IsConjunction(true, true);
        System.out.println(output); // output: true

        output = IsConjunction(false, false);
        System.out.println(output); // output: false

        output = IsConjunction(true, false);
        System.out.println(output); // output:false

        output = IsConjunction(false,true);
        System.out.println(output); // output:false
    }
}
