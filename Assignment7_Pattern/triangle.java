class triangle{
public static void main(String args[]){
int rows=15;
 for (int i = 1; i <= rows; i++) {
 
            // loop to print the number of spaces before the star
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
 
            // loop to print the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
 
            // for new line after printing each row
            System.out.println();
        }
    }
}