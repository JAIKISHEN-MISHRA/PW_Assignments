public class Q2Reverse {
    public static void main(String[] args) {
        String sen="PWSKILLS";
        StringBuilder rev=new StringBuilder();
        for(int i=sen.length()-1;i>=0;i--){
            rev.append(sen.charAt(i));
        }
        System.out.print(rev);
    }
}
