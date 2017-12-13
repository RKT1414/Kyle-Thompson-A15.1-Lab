import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for myPolygon
import gpdraw.*;            // for DrawingTool

public class KyleThompson implements Polygon
{
    private ArrayList <Point2D.Double> myPolygon;
    SketchPad myPaper = new SketchPad(500,500);
    DrawingTool pencil = new DrawingTool (myPaper);
    // constructors
    public KyleThompson() 
    {myPolygon = new ArrayList <Point2D.Double>();
    }

    // public methods
    public void add(Point2D.Double aPoint) 
    { myPolygon.add(aPoint);
    }

    public String getName()
    {return "Kyle Thompson";
    }

    public void draw()
    {
        pencil.up();
       pencil.move(myPolygon.get(0).getX(), myPolygon.get(0).getY());
        pencil.down();
        for(int i = 1; i < myPolygon.size(); i++)
        {
          pencil.move(myPolygon.get(i).getX(), myPolygon.get(i).getY());
        }
         pencil.move(myPolygon.get(0).getX() , myPolygon.get(0).getY());
    }


    public double perimeter() 
    {double perimeter = 0.0;
     for (int i = 1; i < myPolygon.size(); i++)
        {double x1 = myPolygon.get(i - 1).getX();
            double x2 = myPolygon.get(i).getX();
            double y1 = myPolygon.get(i - 1).getY();
            double y2 = myPolygon.get(i).getY();
            perimeter += Point2D.Double.distance(x1,y1,x2,y2);
        }
        double finalMoveX1 = myPolygon.get(0).getX();
        double finalMoveX2 = myPolygon.get(myPolygon.size()-1).getX();
        double finalMoveY1 = myPolygon.get(0).getY();
        double finalMoveY2 =myPolygon.get(myPolygon.size()-1).getY();
        perimeter += Point2D.Double.distance (finalMoveX1, finalMoveY1, finalMoveX2, finalMoveY2);
        return perimeter;
    }

    public double area() 
    {double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < myPolygon.size() - 1; i++)
        {sum1 += myPolygon.get(i).getX() * myPolygon.get(i +1).getY();
            sum2 += myPolygon.get(i).getY() * myPolygon.get(i +1).getX();
        }
        sum1 += myPolygon.get(myPolygon.size() - 1).getX() * myPolygon.get(0).getY();
        sum2 += myPolygon.get(myPolygon.size() - 1).getY() * myPolygon.get(0).getX();
        return .5 * Math.abs(sum1 - sum2);
    }
}