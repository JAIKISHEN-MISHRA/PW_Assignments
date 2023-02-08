public class Q7Unique {
    public static void main(String[] args) {
    String sen="jai@j";
    sen=sen.replace(" ", "");
    int arr[]=new int[128];
    int flag=0;
    for(int i=0;i<sen.length();i++){
        arr[(int)sen.charAt(i)]++;
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]==1){
            flag++;
        }
    }
    if(flag==sen.length()){
        System.out.println("All values are unique");
    }
    else
    System.out.println("All values are not unique");
}
}