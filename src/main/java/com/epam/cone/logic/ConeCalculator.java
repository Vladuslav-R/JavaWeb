package com.epam.cone.logic;

import com.epam.cone.entity.Cone;
import com.epam.cone.entity.Point;

public class ConeCalculator {

    public double calculateHight(Cone cone) {
//      Point center = new Point(cone.,3);
//       Point vertex = new Point(3,9);
//       double hight =vertex.getxCoordinate() -  center.getxCoordinate();
      double centerXCoordinate = cone.getCenter().getxCoordinate();
        double vertexXCoordinate = cone.getVertex().getxCoordinate();

        double hight = centerXCoordinate-vertexXCoordinate;
       return hight;

    }

 public double coneSide (Cone cone) {
 return  Math.pow(cone.getRadius(),2) + Math.pow(calculateHight(cone),2) ;

 }
}
