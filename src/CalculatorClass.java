

public class CalculatorClass {

    private int firstNo;
    private int secondNo;
    int result;




    public CalculatorClass(int firstNo, int secondNo){
        this.firstNo=firstNo;
        this.secondNo=secondNo;

    }

    public int getFirstNo() {
        return firstNo;
    }

    public int getSecondNo() {
        return secondNo;
    }

    public double addition(){
        result =  firstNo+secondNo;
        System.out.println(result);
        return result;

    }
    public double substraction(){
        result =  firstNo-secondNo;
        System.out.println(result);
        return result;
    }
}
