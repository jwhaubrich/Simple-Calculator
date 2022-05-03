package JoeCo;

//how is the below static integers going to effect the program overall?
//will the same static variables be shared across
public abstract class OperatorTemplate {
    int firstNumber;
    int secondNumber;

    public OperatorTemplate(int a, int b){
        this.firstNumber = a;
        this.secondNumber = b;
    }

}
