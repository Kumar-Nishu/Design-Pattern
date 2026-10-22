// class Calculator{
//     int a;
//     int b;
//     private static Calculator obj=new Calculator();
//     private Calculator(){}
//     int sum() {return a+b;}
//     public static Calculator getInstance(){
//         return obj;
//     }
//     }

// > We created an object eagarly in the class
// > If Nobody calls getInstance() method but object already created and takes lots of space in memeory


//-----------------------------------------------------------

// class Calculator{
//     int a;
//     int b;
//     private static Calculator obj;
//     private Calculator(){}
//     int sum() {return a+b;}
//     public static Calculator getInstance(){
//         if(obj==null) obj=new Calculator();
//         return obj;
//     }
//     }

//     > Now we have fixed 1st problem object gets created we call getInstance()
//     > But what if two thread executes this line if(obj==null) same time both will get different object
//     >So Somehow we have to manage the thread come to this enviroment one by one
//-----------------------------------------------------------------------------------

// class Calculator{
//     int a;
//     int b;
//     private static Calculator obj;
//     private Calculator(){}
//     int sum() {return a+b;}
//     public synchronized static Calculator getInstance(){
//         if(obj==null) obj=new Calculator();
//         return obj;
//     }
//     }

//     > THis also come with an drawbacks
//     >Like if first thred locks and then create an object then second thread has to wait unit first comes out
//     >After that if second goes in, it will also put locks which does not need because thread 1 is alredy created to to wait

//     > to avoid this we use double check locking mechnism
//---------------------------------------------------------------------

class Calculator{
    int a;
    int b;
    private static Calculator obj;
    private Calculator(){}
    int sum() {return a+b;}
    public  static Calculator getInstance(){
        if(obj==null){
            synchronized(Calculator.class){
                if(obj==null) obj=new Calculator();
            }
        }
        return obj;
    }
    }

    // Above one is final one