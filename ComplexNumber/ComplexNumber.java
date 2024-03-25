public class ComplexNumber {
    private int realPart;
    private int imaginaryPart;
    public ComplexNumber(){
        this.realPart = 3;
        this.imaginaryPart = 5;
    }
    public ComplexNumber(int real, int imaginary){
        this.realPart = real;
        this.imaginaryPart = imaginary;
    }
    public String toString(){
        return realPart +" + "+imaginaryPart + "i";
    }

    public ComplexNumber add(ComplexNumber C2){
        int additionReal = this.realPart + C2.realPart;
        int additionImaginary = this.imaginaryPart + C2.imaginaryPart;
        return new ComplexNumber(additionReal, additionImaginary);
    }

    public ComplexNumber sub(ComplexNumber C2){
        int subReal = this.realPart - C2.realPart;
        int subImaginary = this.imaginaryPart - C2.imaginaryPart;
        return new ComplexNumber(subReal, subImaginary);
    }
    public ComplexNumber mul(ComplexNumber C2){
        int mulReal = this.realPart * C2.realPart;
        int mulImaginary = this.imaginaryPart * C2.imaginaryPart;
        int mulRealIm = (this.realPart * C2.imaginaryPart) + (this.imaginaryPart * C2.realPart);
        return new ComplexNumber(mulReal+ mulImaginary, mulRealIm);

    }
    public static void main(String[] args) {
        ComplexNumber C1 = new ComplexNumber(6,5);
        ComplexNumber C2 = new ComplexNumber(3,9);
        System.out.println("complex number addition: "+C1.add(C2));
        System.out.println("complex number subtraction: "+C1.sub(C2));
        System.out.println("complex number multiplication: " +C1.mul(C2));

    }
}
