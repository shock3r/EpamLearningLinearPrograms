import static java.lang.Math.*;
public class Main {

    public static void main(String[] args) {

        // Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
        //принадлежит закрашенной области, и false — в противном случае:

        // first coordinate quarter
        //x [0, 2], y [0, 4]

        // second coordinate quarter
        // x [-2, 0], y [0, 4]

        // third coordinate quarter
        // x [-4, 0], y [-3, 0]

        // fourth coordinate quarter
        // x [0, 4], y [-3, 0]

        int x=0;
        int y=-1;

        if ((x>=0 && x<=2) && (y>=0 && y<=4)) {
            System.out.println(true);
        } else if ((x>=-2 && x<=0) && (y>=0 && y<=4)) {
            System.out.println(true);
        } else if ((x>=-4 && x<=0) && (y>=-3 && y<=0)) {
            System.out.println(true);
        } else if ((x>=0 && x<=4) && (y>=-3 && y<=0)) {
            System.out.println(true);
        } else { System.out.println(false);}


    }
}
