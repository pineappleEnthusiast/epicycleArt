import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
//import org.opencv.core.Core;

public class readData {
    public static ArrayList<double[]> read() {

        ArrayList<double[]> points = new ArrayList<>();
        File file = new File("C:\\Users\\kanga\\IdeaProjects\\epicycleArt\\Test Data\\output.txt");
        try {
            Scanner sc = new Scanner(new FileInputStream(file));
            while (sc.hasNextDouble()) {
               // sc.nextLine();
            double[]pair = {sc.nextDouble(),sc.nextDouble()};
            //pair[0] = sc.nextInt();
            //sc.nextLine();
            //pair[1] = sc.nextInt();
            points.add(pair);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(points.size());
        return points;
    }


    public static boolean isNumeric(String str) {
        try {
            int num = Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
