package Triangle;

public class Triangle {
    public static String classifyTriangle(int side1, int side2, int side3) {
        boolean checkTriangle = side1 > 0 && side2 > 0 && side3 > 0 && side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2;
        if (checkTriangle) {
            if (side1 == side2 && side2 == side3) return "Tam giác đều";
            else if (side1 == side2 || side2 == side3 || side1 == side3) return "Tam giác cân";
            else return "Tam giác thường";
        } else
            return "Không phải là tam giác";
    }
}
