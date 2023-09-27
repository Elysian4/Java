public class powersof2{

    public static void main(String[] args){
        System.out.println(powers(8));
    }

    static int powers(int n){
        if(n<1){
            return 0;
        }
        else if(n==1){
            System.out.println(1);
            return 1;
        }
        else{
            int prev=powers(n/2);
            int curr=prev*2;
            System.out.println(curr);
            return curr;
            
        }
    }
}