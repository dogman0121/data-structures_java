package lab20.Task1;

public class Class1<T, V, K> {
    T a;
    V b;
    K c;

    public Class1(T a, V b, K c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printVar() {
        System.out.println("Class1: a=" + a + ", b=" + b + ", c=" + c);
    }

    public void printVarTypes(){
        System.out.println("Class1: a=" + a.getClass() + ", b=" + b.getClass() + ", c=" + c.getClass());
    }
}
