package AllHomeWorks.HomeWork1;
import java.io.BufferedReader;
import java.io.IOException;

public class FlowerBedParametersTask {
    public static void doTask(BufferedReader br) throws IOException {

        System.out.println("Input radius of flower bed");
        int radius_flower_bed = Integer.parseInt(br.readLine());
        double Perimeter_flower_bed = 2*Math.PI*radius_flower_bed;
        double area_flower_bed = Math.PI*(radius_flower_bed*radius_flower_bed);


        System.out.println("Perimeter of flower bed = " + Perimeter_flower_bed);
        System.out.println("Area of flower bed = " + area_flower_bed);
    }
}
