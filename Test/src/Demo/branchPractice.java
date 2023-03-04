package Demo;

public class branchPractice {
    public static void main(String[] args) {
        System.out.println("goodbye world");

        String[] input = {"This", "is", "Java", "Program"};
        String[] output = new String[input.length];
        for(int i=0;i<=input.length-1;i++){
            String revTem="";
            for (int j=input[i].length()-1;j>=0;j--){
                revTem+=input[i].charAt(j);
            }
            output[i]=revTem;
        }
        for (int i=0;i<=output.length-1;i++){
            System.out.print(output[i]+" ");
        }

        int z = 0;
        String revTem = "";
        for (int j = input[z].length() - 1; j >= 0; j--) {
            revTem += input[z].charAt(j);

            for (int i = 0; i <= output.length - 1; i++) {
            System.out.print(output[i]+" ");
            }
        }
    }
}
