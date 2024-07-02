package fr.afpa.shapes;

// TODO implémenter la classe Circle
// se référer au diagramme UML contenu dans le sous-dossier "doc" pour retrouver les informations concernant ses attributs

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public void calculatePerimeter(Shape shape) {
        System.out.println(2 * Math.PI *radius);
    }

    @Override
    public void calculateArea(Shape shape) {
        System.out.println(Math.PI * Math.pow(radius, 2));
    }
}
