class pattern{
public static void main(String args[]){
int row=11;
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(i==0||j==0||i==row-1||j==row-1||i+j<=(row-1)/2||j-i>=(row-1)/2)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}