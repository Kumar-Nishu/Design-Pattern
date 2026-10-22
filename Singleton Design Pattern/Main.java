class Main{
    public static void main(String[] args){
        Calculator c1=Calculator.getInstance();
        c1.a=10;
        c1.b=20;
        System.out.println(c1.sum());
    }
}