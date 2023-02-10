public class Q3Reverse {
    public static void main(String[] args) {
        String sen1="Think Twice";
        sen1=sen1.toLowerCase();
        String sen2="";
        for(int i=sen1.length()-1;i>=0;i--){
            sen2=sen2+sen1.charAt(i);
        }
        String sen3="";
        String[] sarr=sen2.split(" ");
        for(int i=sarr.length-1;i>=0;i--){
            sen3=sen3+sarr[i]+" ";
        }
        System.out.println(sen3);
    }
}
