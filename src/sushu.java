public class sushu {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 2;i<100;i++){
            boolean isSuShu = true;
            for(int j = 2;j<i;j++){
                if (i%j==0){
                    isSuShu = false;

                }
            }
            if (isSuShu){
                System.out.print(i+" ");
                count++;
                if(count%8==0){
                    System.out.println();
                }
            }
        }
    }
}
