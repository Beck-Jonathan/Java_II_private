package en.codegym.task.pro.task13.task1322;

public class Solution {
    //borken task grading, thanks to Dillon here to explain how to fix the grading
    //https://codegym.cc/tasks/en.codegym.task.pro.task13.task1322#discussion

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int cornerCount) {
        String shape;
        switch (cornerCount) {
            case 3:
                shape = "Triangle";
                break;
            case 4:
                shape = "Quadrangle";
                break;
            case 5:
                shape = "Pentagon";
                break;
            case 6:
                shape = "Hexagon";
                break;
            case 7:
                shape = "Heptagon";
                break;
            case 8:
                shape = "Octagon";
                break;
            default:
                shape = "Other shape";
                break;
        }
        return shape;
    }
}
