import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<IFigure> figureList = new ArrayList<>();
        figureList.add(Figure.createFigure(FigureType.generateRandomFigureType()));
        figureList.add(Figure.createFigure(FigureType.generateRandomFigureType()));
        figureList.add(Figure.createFigure(FigureType.generateRandomFigureType()));
        figureList.add(Figure.createFigure(FigureType.generateRandomFigureType()));
        boolean progress = true;
        while (progress) {
            System.out.print("1- wyświetl listę \n2- dodaj figurę; \n3- usuń figurę; \n4- wyświetl figurę; \n5- pomniejsz figurę; \n6- powiększ figurę; \n7- wyjście z programu");
            int choice;
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < figureList.size(); i++) {
                        System.out.println(i + " " + figureList.get(i));
                    }
                    break;
                case 2:
                    figureList.add(Figure.createFigure(FigureType.generateRandomFigureType()));
                    break;
                case 3:
                    System.out.println("Podaj index figury którą chcesz usunać");
                    figureList.remove(input.nextInt());
                    break;
                case 4:
                    System.out.println("Podaj index figury którą chcesz wyświelić");
                    System.out.println(figureList.get(input.nextInt()));
                    break;
                case 5:
                    System.out.println("Podaj index figury którą chcesz pomniejszyć");
                    int n = input.nextInt();
                    figureList.get(n).min();
                    System.out.println(figureList.get(n));
                    break;
                case 6:
                    System.out.println("Podaj index figury którą chcesz powiekszyć");
                    int m = input.nextInt();
                    figureList.get(m).max();
                    System.out.println(figureList.get(m));
                    break;
                case 7:
                    System.out.println("Program został zakończony");
                    progress = false;
                    break;
                default:
                    System.out.println("Nie ma takiej komendy");

            }
        }

    }
}
