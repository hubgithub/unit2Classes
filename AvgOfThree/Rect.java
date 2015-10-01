
public class Rect
{
    private double width;
    private double length;
    private double dia;
    private double area;
    public Rect(double wi, double len)
    {
        width = wi;
        length = len;

    }


    public double ardia()
    {
        area = width * length;
        dia = Math.pow(width,2) + Math.pow(length,2);
        dia = Math.sqrt(dia);
        
        System.out.println("The area of the Rectange is " + area);
        System.out.println("The diagonal is " + dia);
        
        return area;
        
    }

}
