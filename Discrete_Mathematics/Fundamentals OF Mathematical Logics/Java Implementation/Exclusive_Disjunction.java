
    // Java Implementation of Exclusive Disjunction Propositions

public class Exclusive_Disjunction {
    // Function to check Exclusive Disjunction proposition
        public boolean isExclusive_Disjunction(boolean p, boolean q) {
        if (((p || q) == true) && !(p && q == true)){
            return true;
        }
        else{
            return false;
        }

        }

    // test
    boolean output;

    public void main(String[] args) {
        output = isExclusive_Disjunction(true, true);
        System.out.println(output); // output: false

        output = isExclusive_Disjunction(false, true);
        System.out.println(output); // output: true

        output = isExclusive_Disjunction(true, false);
        System.out.println(output); // output: true

        output = isExclusive_Disjunction(false, false);
        System.out.println(output); // output: false
    }
    }

