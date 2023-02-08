public class Q6Panagram {
    public static void main(String[] args) {
        String sen="The Quick brown fox Jumps over Lazy DOg";
        sen=sen.replace(" ", "");
        int flag=0;
        char[] sarr=new char[sen.length()];
        for(int i=0;i<sen.length();i++){
            sarr[i]=sen.charAt(i);
        }
        for(int i=0;i<sarr.length;i++){
            if((int) sen.charAt(i)<97){
                sarr[i]=(char)((int)sarr[i]+32);
            }
        }
        int arr[]=new int[26];
        for(int i=0;i<sen.length();i++){
            arr[sarr[i]-97]++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                System.out.println("Not Panagram");
                flag++;
                break;
            }
        }
        if(flag==0){
            System.out.println("Panagram");
        }
}}
