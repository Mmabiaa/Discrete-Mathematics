// Java Implementation of AND gate

public class OR_gate {

    public String is_OR_gate(int p, int q){

        if ((p == 0 || p == 1)&&(q == 0||q==1)){

            if (p == 1 || q==1){
                return "1";
            }
            else{
                return "0";
            }
        }

        else{
            System.out.println("Invalid input \n Input must be 0 or 1...");
        }
        return "";
    }


    // Test
    String output;
    public void main(String[] args) {
        output =  is_OR_gate(1,1);
        System.out.println(output); // output: 1

        output = is_OR_gate(0, 0);
        System.out.println(output); // output: 0

        output = is_OR_gate(1, 0);
        System.out.println(output); // output: 1

        output = is_OR_gate(0, 1);
        System.out.println(output); // output: 1
    }
}
