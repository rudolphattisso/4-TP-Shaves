package fr.afpa.shapes;

// TODO implémenter la classe Rectangle
// se référer au diagramme UML contenu dans le sous-dossier "doc" pour retrouver les informations concernant ses attributs


public class Rectangle implements Shape{

    private double lenght;
    private double width;


public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

@Override
    public void calculatePerimeter(Shape shape){
         System.out.println(2 * lenght + 2 * width);
    }
@Override
    public void calculateArea(Shape shape) {
        System.out.println(lenght * width);
    }




}