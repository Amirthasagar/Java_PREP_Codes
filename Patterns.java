public class Pattern {
    public static void main(String[] args){
        int n =5;
        int c=0;
        for(int row=1;row<=2*n;row++){
            if(row<n) c =row;
            else c = 2*n-row;
            for(int space=0;space< n-c;space++){
                System.out.print("  ");
            }
            for(int col=c;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col = 2; col<=c;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

/*  *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *

  int n = 5;
        int c = 0;
        for(int i=0;i<2*n;i++){
            if(i<=n) {
                c=i;
            }
            else {
                c = (2 * n) - i;
            }
            for(int space=n-c;space>=0;space--) {
                System.out.print(" ");
            }
            for(int j=0;j<c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

 */


/* *
           **
           ***
           ****
           *****
           ****
           ***
           **
           *
        int n = 5;
        int c=0;
        for(int row=1;row<=2*n ;row++){
            if(row<n) c=row;
            else c=(2*n)-row;
            for(int col=1;col<=c;col++){
                System.out.print("*");
            }
            System.out.println();
        }

         */

/*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
 int n =5;
        for(int row=1;row<=n;row++){
            for(int space=0;space< n-row;space++){
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col = 2; col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

 */