class name{
public static void main(String args[]){
int row=9;
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(i==0||j==(row-1)/2||i==row-1&&j<=(row-1)/2)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if( i+j==(row-1)/2 || j-i==(row-1)/2 || i==(row-1)/4&&j>1&&j<row-2)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
for(int i=0;i<row;i++){
for(int j=0;j<row;j++){
if(i==0||j==(row-1)/2||i==row-1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}