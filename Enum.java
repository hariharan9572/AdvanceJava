enum Status{
    Running, Failed, Pending, Success; // named constant
}

public class Enum{
    public static void main(String[] args){
        int i = 5;
    //    Status s = Status.Success;
        Status[] ss = Status.values();
    //    System.out.println(s); 

    //    System.out.println(s.ordinal());

        // for (i=0; i<=3;i++)
        // {
        //     System.out.println(ss[i] + " : "+ ss[i].ordinal());
        // }

        for (Status s : ss){ // enhance for loop
            System.out.println(s + " : " + s.ordinal());
        }
    }
}
