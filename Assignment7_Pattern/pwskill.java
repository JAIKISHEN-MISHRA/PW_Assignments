class pwskill{
public static void main(String args[]){
int row=9;
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(i==0||j==0||i==(row-1)/2||j==row-1&&i<=(row-1)/2)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
System.out.println();
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(j==0&&i<=(row-1)/2||j==row-1&&i<=(row-1)/2||i+j==(row-1)/2||j-i==(row-1)/2)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(j==0&&i<=(row-1)/2||i==0||i==(row-1)/2||j==row-1&&i>=(row-1)/2||i==row-1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
System.out.println();
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(j==0||i<=5&&i+j==(row-1)/2||i>=5&&i-j==(row-1)/2)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(j==(row-1)/2||i==0||i==row-1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(j==0||i==row-1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(j==0||i==row-1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}
