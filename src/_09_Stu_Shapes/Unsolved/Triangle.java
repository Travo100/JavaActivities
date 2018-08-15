package _09_Stu_Shapes.Unsolved;

import java.lang.Math;

class Triangle {
    // Your implementation goes here.
    // The prefixed m is a naming convention, indicating "member."
    private final int mSideLength;

    Triangle(int mSideLength) {
        this.mSideLength = mSideLength;
    }

    /**
     * @return The height of this triangle.
     */
    double getHeight (int height) {
        return Math.sin(Math.toRadians(60)) * this.mSideLength;
    }
}
