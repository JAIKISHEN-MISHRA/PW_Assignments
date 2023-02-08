public class Q8MaxOccurString {
    public static void main(String[] args) {
        String sen="Jaikishen Mishra";
        sen=sen.replace(" ", "");
        sen=sen.toLowerCase();
        int []arr=new int[27];
        for(int i=0;i<sen.length();i++){
            arr[(int)sen.charAt(i)-97]++;
        }
        int max=arr[0];
        int key=0;
        for (int i = 1; i < arr.length; i++)
        if (arr[i] > max){
            max = arr[i];
            key=i;}
        char ans=(char)(key+97);
        System.out.println("Highest recurring character is "+ans);
    }
}
