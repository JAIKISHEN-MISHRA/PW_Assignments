//Q5.What are Built in Annotation?
//ANS:-Built In annotation give some additonal information About code.Starts with @ .Example:-
@FunctionalInterface
interface stud{
    public void name();
}
class Jai implements stud{
    @Override
    public void name(){
        System.out.println("JAIKISHEN MANOJ MISHRA");
    }
}
public class Q5_BuiltAnnotation {
    public static void main(String[] args) {
        Jai j=new Jai();
        j.name();
    }
}
