import java.util.Scanner ;

class Prac4{
    
    public static void main (String argd[]){
        Scanner scanner = new Scanner(System.in);
        int i, j;
        int[][] ary1 = new int[3][3];
        int[][] ary2 = new int[3][3];
        int[][] arySum = new int[3][3];

        System.out.println("Enter Values for first matric");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print("For array1 Enter number at "+ (i+1) +","+ (j+1) + " : ");
                ary1[i][j] = scanner.nextInt();
            }
        }
        
        
        System.out.println("Enter Values for second matric");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print("For array2 Enter number at "+ (i+1) +","+ (j+1) + " : ");
                ary2[i][j] = scanner.nextInt();
            }
        }



        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                arySum[i][j] = ary1[i][j] + ary2[i][j];
            }
        }
        System.out.println("Resulting Matrix :");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print(arySum[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}