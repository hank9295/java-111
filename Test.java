public class Test{
    public static void main(String[] args){
        int row=0,ans=5;
        for(int runtimes=1;runtimes<ans*2;runtimes++){
            row=runtimes;
            if(row>ans){
                row=ans*2-row;
            }
            for(int space=ans-row;space>0;space--){
                System.out.printf(" ");
            }
            row=row*2-1;
            for(int j=row;j>0;j--){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}