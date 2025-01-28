public class NOT_gate {
    public String is_NOT_gate(int p){

        if (p == 0 || p == 1){

            if (p == 1){
                return "0";
            }
            else{
                return "1";
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
        output =  is_NOT_gate(0);
        System.out.println(output); // output: 1

        output =  is_NOT_gate(1);
        System.out.println(output); // output: 0
    }
}
