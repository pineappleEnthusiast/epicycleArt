public class Complex {
    double re,im;

    public Complex(double x, double y){
        re = x;
        im = y;
    }

    public Complex multiply(Complex c){
        double real = this.re * c.re - this.im * c.im;
        double imag = this.re * c.im + this.im * c.re;
        return new Complex(real, imag);
    }

    public void add(Complex c){
        this.re = this.re+c.re;
        this.im = this.im+c.im;
        //return new Complex(real,imag);
    }
}
