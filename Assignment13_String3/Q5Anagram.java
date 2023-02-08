import java.util.Arrays;

public class Q5Anagram {
    public static void main(String[] args) {
        String sen1="Jai Kishen";
        String sen2="Jai Kishen";
        sen1=sen1.replace(" ", "");
        sen2=sen2.replace(" ", "");
        char[] sarr1=new char[sen1.length()];
        char[] sarr2=new char[sen1.length()];
        for(int i=0;i<sen1.length();i++){
            sarr1[i]=sen1.charAt(i);
        }
        for(int i=0;i<sen2.length();i++){
            sarr2[i]=sen2.charAt(i);
        }
         for(int i=0;i<sarr1.length;i++){
            if((int) sen1.charAt(i)<97){
                sarr1[i]=(char)((int)sarr1[i]+32);
            }
        }
        for(int i=0;i<sarr2.length;i++){
            if((int) sen1.charAt(i)<97){
                sarr2[i]=(char)((int)sarr2[i]+32);
            }
        }
        Arrays.sort(sarr1);
        Arrays.sort(sarr2);
        if(Arrays.equals(sarr1, sarr2)){
            System.out.println("Anagram");
        }
        else
        System.out.println("Not Anagram");
    }
}
