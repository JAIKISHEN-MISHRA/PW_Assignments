public class Q4CountConso {
    public static void main(String[] args) {
        String sen="absDc@akda asd";
        sen=sen.toLowerCase();
        char[] sarr=sen.toCharArray();
        int vowel=0,consonant=0,special=0;
        for(int i=0;i<sarr.length;i++){
            if((int) sarr[i]==97 || (int)sarr[i]==101 ||(int) sarr[i]==105|| (int) sarr[i]==111 || (int) sarr[i]==117){
               vowel++;
            }
            else if((int) sarr[i]>97 && (int) sarr[i]<=122){
                consonant++;
            }
            else
            special++;
        }
        System.out.println("Vowel is:"+vowel+" Consonat is:"+consonant+" Special character is:"+special);
    }
}
