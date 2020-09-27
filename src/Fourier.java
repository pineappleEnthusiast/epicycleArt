public class Fourier
{
    public static double[][] DFT(Complex [] points)
    {   double[][]X = new double[points.length][5];
        final int N = points.length;
       // System.out.println(N);
        //n is fine
        for(int k=0; k<N; k++)
        {
            //double re = 0;
            //double im = 0;
            Complex sum = new Complex(0,0);
            for(int n = 0; n<N; n++)
            {
                double phi = 2*Math.PI*k*n/N;
                Complex c = new Complex(Math.cos(phi), -1*Math.sin(phi));
                //System.out.println(c.re);
                sum.add(points[n].multiply(c));
                //System.out.println(points[n].re + " " + sum.re);
                //sum.re += points[n].re*Math.cos(phi);
                //sum.im -= points[n].im*Math.sin(phi);
            }
            sum.re/=N;
            sum.im/=N;
            //System.out.println(sum.re);
            double freq = k;
            double amp = Math.sqrt(sum.re*sum.re+sum.im*sum.im);
            double phase = Math.atan2(sum.im,sum.re);
            double[]params = {sum.re,sum.im,freq,amp, phase};
            X[k] = params;
            //System.out.println(sum.re);
        }
        //for(int a = 0;a<5;a++)
          //  System.out.println(X[a][0]);

        return X;
    }
}
