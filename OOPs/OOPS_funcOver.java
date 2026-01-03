public class OOPS_funcOver {
    public static void main(String args[]){
        OOPS_funcOver outer = new OOPS_funcOver();
        calculator calc = outer.new calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(1.4f , 22.2f));
        System.out.println(calc.sum( 2,4,6));

    }
    class calculator{
        int sum(int a, int b){
            return a+b;
        }
        float sum(float a, float b){
            return a+b;
        }
        int sum(int a,int b, int c ){
            return a+b+c;
       
    }
}
}
    