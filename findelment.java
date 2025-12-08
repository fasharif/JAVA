public class findelment {
    public  static void main(String[] args) {
        int[] num = {1 , 2 , 3 , 4 , 5};
        int target = 2;
        boolean isFound = false;
        for(int i = 0; i < num.length; i++){
            if(num[i] == target){
                isFound = true;
                System.out.print("Target number is Found in Array");
                break;
            }
        }
    if(!isFound){
            System.out.println("Not found");
        }
    }
}
