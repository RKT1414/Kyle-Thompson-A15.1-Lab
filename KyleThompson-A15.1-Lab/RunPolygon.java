import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*;            // for DrawingTool

public class RunPolygon
{public static void main(String [] Args)
    {IrregularPolygon quad = new IrregularPolygon();
     quad.add(new Point2D.Double(20,10));
     quad.add(new Point2D.Double(70,20));
     quad.add(new Point2D.Double(50,50));
     quad.add(new Point2D.Double(0,40));
     
     quad.draw();
     System.out.println(quad.perimeter());
     System.out.println(quad.area());
     
     
     
    }
}