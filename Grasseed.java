/**
 * Solution to Grass Seed Inc.
 * Created by Tim on 2017-01-21.
 */
public class Grasseed {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        double cost = io.getDouble();
        double lawns = io.getDouble();
        double totcost = 0;

        for(int i = 0; i < lawns; i++){
            double area = io.getDouble() * io.getDouble();
            totcost += (area*cost);
        }

        io.println(String.format("%.7f", totcost));
        io.close();
    }
}
