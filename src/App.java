import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        int figureType = 0, flatFigure = 0, spaceFigure = 0;
        int[] numbers = {1, 2, 3, 4, 5};

        while (true){
            do {
                System.out.println("CHOOSE THE FIGURE TYPE: ");
                System.out.println("[1] - Flat Fifures");
                System.out.println("[2] - Space Fifures");
                figureType = tec.nextInt();
                tec.nextLine();
                System.out.println();
            } while (figureType != 1 || figureType != 2);

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
                        } while (contains(numbers, flatFigure) == false);
                        


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
                        } while (contains(numbers, spaceFigure) == false);
                        
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
