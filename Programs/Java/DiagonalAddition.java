public class DiagonalAddition {

    public static void main(String[] args) {

        System.out.println("Hello!");
        int sum = 0; int val = 1; int diagonal=0;
        int[][] arr = new int[3][3];

        System.out.println("Primary diagonal:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++, val++, diagonal++){
                arr[i][j] = val;             // user input value assumed
                // System.out.print(arr[i][j]+" ");
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                    sum += arr[i][j];
                } else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
        System.out.println("Sum of primary diagonal:"+sum);

        System.out.println("Secondary diagonal:");
        val = 1; sum=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++, val++, diagonal++){
                arr[i][j] = val;
                    // System.out.print(arr[i][j]+" ");
                    if(i==0 && j==arr.length-1){
                        System.out.print(arr[i][j]+" ");
                        sum += arr[i][j];
                    } else if(i==arr.length-1 && j==0){
                        System.out.print(arr[i][j]+" ");
                        sum += arr[i][j];
                    } else if((double)i==arr.length/2 && (double)j==arr.length/2){
                        System.out.print(arr[i][j]+" ");
                        sum += arr[i][j];
                    } else{
                        System.out.print("0"+" ");
                    }
            }
            System.out.println();
        }
        System.out.println("Sum of secondary diagonal:"+sum);
    }
}
