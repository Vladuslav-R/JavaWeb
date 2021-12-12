package com.epam.triangle.repository;

import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;

public class FirstQuadrantSpecification implements Specification {



    @Override
    public boolean specified(TriangleIdentifiable triangle) {

        double aX = triangle.getA().getxCoordinate();
        double aY = triangle.getA().getxCoordinate();
        double bX = triangle.getA().getxCoordinate();
        double bY = triangle.getA().getxCoordinate();
        double cX = triangle.getA().getxCoordinate();
        double cY = triangle.getA().getxCoordinate();


        return aX>0 && aY>0 && bX>0 && bY>0 && cX>0 && cY>0;

    }
}
