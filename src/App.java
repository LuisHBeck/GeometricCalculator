import java.util.Scanner;

import FlatFigures.Circle;
import FlatFigures.Hexagon;
import FlatFigures.Rectangle;
import FlatFigures.Square;
import FlatFigures.Triangle;
import SpaceFigures.Ball;
import SpaceFigures.Cilinder;
import SpaceFigures.Cube;
import SpaceFigures.Parallelepiped;
import SpaceFigures.SquareBasePyramid;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        int figureType = 0, flatFigure = 0, spaceFigure = 0;
        int[] numbersFigures = {1, 2, 3, 4, 5};

        while (true){
            do {
                System.out.println("CHOOSE THE FIGURE TYPE: ");
                System.out.println("[1] - Flat Fifures");
                System.out.println("[2] - Space Fifures");
                System.out.println("[3] - EXIT");
                figureType = tec.nextInt();
                tec.nextLine();
                System.out.println();
            } while (contains(numbersFigures, figureType) == false);

                switch (figureType){
                    case 1:
                        do {
                            System.out.println("Flat Figures selected");
                            System.out.println("Now choose your figure:");
                            System.out.println("[1] - Square");
                            System.out.println("[2] - Rectangle");
                            System.out.println("[3] - Circle");
                            System.out.println("[4] - Hexagon");
                            System.out.println("[5] - Equilateral Triangle");
                            flatFigure = tec.nextInt();
                            tec.nextLine();
                            System.out.println();
                        } while (contains(numbersFigures, flatFigure) == false);

                        switch (flatFigure){
                            case 1:
                                System.out.print("Input the Square side>> ");
                                double sqrSide = tec.nextDouble();
                                tec.nextLine();
                                Square square = new Square(sqrSide);
                                System.out.println(square.toString());
                                break;

                            case 2:
                                System.out.print("Input the Rectangle base>> ");
                                double recBase = tec.nextDouble();
                                tec.nextLine();
                                System.out.print("Input the Rectangle height>> ");
                                double recHeight = tec.nextDouble();
                                tec.nextLine();
                                Rectangle rectangle = new Rectangle(recBase, recHeight);
                                System.out.println(rectangle.toString());
                                break;

                            case 3:
                                System.out.print("Input the Circle ray>> ");
                                double circleRay = tec.nextDouble();
                                tec.nextLine();
                                Circle circle = new Circle(circleRay);
                                System.out.println(circle.toString());
                                break;

                            case 4:
                                System.out.print("Input the Hexagon side>> ");
                                double hexSide = tec.nextDouble();
                                tec.nextLine();
                                Hexagon hex = new Hexagon(hexSide);
                                System.out.println(hex.toString());
                                break;

                            case 5:
                                System.out.print("Input the Equilateral side>> ");
                                double eqSide = tec.nextDouble();
                                tec.nextLine();
                                Triangle equTriangle = new Triangle(eqSide);
                                System.out.println(equTriangle.toString());
                                break;
                        }
                        break;
                        
                    case 2:
                        do {
                            System.out.println("Space Figures selected");
                            System.out.println("Now choose your figure:");
                            System.out.println("[1] - Cube");
                            System.out.println("[2] - Ball");
                            System.out.println("[3] - Cilinder");
                            System.out.println("[4] - Parallelepiped");
                            System.out.println("[5] - Square Base Pyramid");
                            spaceFigure = tec.nextInt();
                            tec.nextLine();
                            System.out.println();
                        } while (contains(numbersFigures, spaceFigure) == false);

                        switch (spaceFigure){
                            case 1: 
                                System.out.print("Input the Cube side>> ");
                                double cubeSide = tec.nextDouble();
                                tec.nextLine();
                                Cube cube = new Cube(cubeSide);
                                System.out.println(cube.toString());
                                break;

                            case 2:
                                System.out.print("Input the Ball ray>> ");
                                double ballRay = tec.nextDouble();
                                tec.nextLine();
                                Ball ball = new Ball(ballRay);
                                System.out.println(ball.toString());
                                break;

                            case 3:
                                System.out.print("Input the Cilinder ray>> ");
                                double cilinderRay = tec.nextDouble();
                                tec.nextLine();
                                System.out.print("Input the Ball height>> ");
                                double cilinderHeight = tec.nextDouble();
                                tec.nextLine();
                                Cilinder cilinder = new Cilinder(cilinderRay, cilinderHeight);
                                System.out.println(cilinder.toString());
                                break;

                            case 4:
                                System.out.print("Input the Parallelepiped weight>> ");
                                double paraWeight = tec.nextDouble();
                                tec.nextLine();
                                System.out.print("Input the Parallelepiped height>> ");
                                double paraHeight = tec.nextDouble();
                                tec.nextLine();
                                System.out.print("Input the Parallelepiped depth>> ");
                                double paraDepth = tec.nextDouble();
                                tec.nextLine();
                                Parallelepiped parallelepiped = new Parallelepiped(paraWeight, paraHeight, paraDepth);
                                System.out.println(parallelepiped.toString());
                                break;

                            case 5:
                                System.out.print("Input the Square Base Pyramid side>> ");
                                double pyramidSide = tec.nextDouble();
                                tec.nextLine();
                                System.out.print("Input the Square Base Pyramid height>> ");
                                double pyramidHeight = tec.nextDouble();
                                tec.nextLine();
                                System.out.print("Input the Square Base Pyramid face height>> ");
                                double pyramidFaceHeight = tec.nextDouble();
                                tec.nextLine();
                                SquareBasePyramid pyramid = new SquareBasePyramid(pyramidSide, pyramidHeight, pyramidFaceHeight);
                                System.out.println(pyramid.toString());
                        }
                    case 3:
                        System.out.println("Thanks buddy!!");
                        break;        
            }
            if (figureType == 3){
                break;
            }
        }
    }
    public static boolean contains(final int[] array, final int v) {
        boolean result = false;
        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }
        return result;
    }
}
