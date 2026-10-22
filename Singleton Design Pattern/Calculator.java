class Calculator{
    int a;
    int b;
    private static Calculator obj=new Calculator();
    private Calculator(){}
    int sum() {return a+b;}
    public static Calculator getInstance(){
        return obj;
    }
    }
