package april.ex_13042024;

public class IQ003 {
    public static void main(String[] args) {
        int a=10;
        int b=45;
        System.out.println(a+b);
        String name="Nikita";
        //reads always left to right
        System.out.println(a+name); //10Nikita
        System.out.println(name+a); //Nikita10

        //imp: if int found first addition takes place,if string found first concatenation takes place
        System.out.println(a+b+name); //55Nikita
        System.out.println(a+name+b); //simple concat 10Nikita45

        //but but but.... remember below
        System.out.println(name+a+b);  //Nikita1045 only concat no addition
    }
}
