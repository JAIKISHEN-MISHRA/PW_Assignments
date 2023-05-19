import javax.sound.sampled.SourceDataLine;

//Q4.What are ENUMS in java Explain with example?
//Ans:-We can use to define a group of named constants.Example:-
public class Q4_Enums {
    enum Week{
        MON,TUE,WED,THUR,FRI,SAT;
    }
    public static void main(String[] args) {
        Week w=Week.MON;
        System.out.println(w);
    }
}
