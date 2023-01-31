class Alphabet{
public static void main(String args[]){
int row=9;
//A
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if( i+j==(row-1)/2 || j-i==(row-1)/2 || i==(row-1)/4&&j>1&&j<row-2)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
//B
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(i==0&&j<row-1||j==0&&i<row-1||j==row-1&&i%4!=0||i==row-1&&j<row-1||i==(row-1)/2&&j<row-1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
//C
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(i==0||j==0||i==row-1&&j!=0)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
//D
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(j == 1 || ((i == 0 || i == row-1) &&
               (j > 1 && j < row-2)) || (j == row-2 &&
                i != 0 && i != row-1))
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
//E
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(j==0||i==0||i==row-1||i==(row-1)/2)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
//F
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(j==0||i==0||i==(row-1)/2)
System.out.print("*");
else
System.out.print(" ");
}
//G
System.out.println();
}
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(j==0||i==0||i==row-1||j==row-1&&i+j>11)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
//H
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(j==0||j==row-1||i==(row-1)/2)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}