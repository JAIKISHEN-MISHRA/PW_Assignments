//Mutable string are those string that do allow changes to the same string object.Example:-
public class Q1Mutable {
    public static void main(String[] args) {
        StringBuffer sen=new StringBuffer("Jai");
        sen.append("Kishen");
        System.out.println(sen);
    }
}
