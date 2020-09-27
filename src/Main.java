import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        //call BUILD UI
        UI input = new UI();
        //send data to IMAGE PROCESSING
        //send feedback to POINT EXTRACTION
        //send data to READ DATA
        ArrayList<double[]> points = readData.read();
        double angle = 0;
        int skip = 0;
        Complex [] c = new Complex[points.size()];
        for(int a = 0;a<points.size();a+=1)
        {
            angle = a;
            c[a] = new Complex(points.get(a+skip)[0], points.get(a+skip)[1]);
        }
         double[][]fourierPoints = Fourier.DFT(c);
        fourierPoints =  sort(fourierPoints);
        EpicycleGenerator gen = new EpicycleGenerator();
        gen.addEpicylce(Math.PI/2,fourierPoints);
    }

    public static double[][] sort(double[][] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int max_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j][3] > arr[max_idx][3])
                    max_idx = j;

            // Swap the found minimum element with the first
            // element
            double [] temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
