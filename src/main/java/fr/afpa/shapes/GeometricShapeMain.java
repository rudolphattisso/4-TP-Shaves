package fr.afpa.shapes;

import java.util.ArrayList;

/*
	Objectif : développer des classes représentant des formes géométriques (Rectangle, Cercle et Triangle)
	Pour chacune de ces classes il faudra implémenter deux méthodes :
	 - une qui renverra le périmètre -> double calculatePerimeter()
	 - une qui renverra l'aire -> double calculateArea()

	Pour apprendre à implémenter une interface vous pouvez vous référer au diaporama présenté en formation
	Vous pouvez également regarder la vidéo suivante : https://www.youtube.com/watch?v=OkEwPtRaqY4

	TODO implémentez une classe "Rectangle" comprenant les attributs présentés sur le diagramme UML contenu dans le sous-dossier "doc"
	Le diagramme UML est sous format "uxf". Pour pouvoir le lire il vous faudra le logiciel UMLET
	UMLET est disponible à l'adresse suivante : https://www.umlet.com/

	TODO implémentez une classe "Circle" comme présentée par le diagramme UML

	TODO créez une interface nommée "Shape" comprenant deux méthodes abstraites de calcul :
	 - double calculatePerimeter()
	 - double calculateArea()

	TODO faites en sorte que la classe "Rectangle" implémente l'interface "Shape" et implémentez les deux méthodes 
	Rappel de calcul :
	 - perimetre_rectangle = 2 * longueur + 2 * largeur
	 - aire_rectangle = longueur * largeur

	TODO faites en sorte que la classe "Circle" implémente l'interface "Shape" et implémentez les deux méthodes
	Rappel de calcul :
	 - périmètre du cercle = 2 * π * rayon
	 - aire_cercle = π * rayon^2

	 La valeur π peut être retrouvée en Java en utilisant "Math.PI" 
	 La puissance de 2 peut être effectuée en utilisant la méthode static "pow" de la classe "Math" 
	 -> plus d'informations par ici https://codegym.cc/fr/groups/posts/fr.575.math-pi-en-java

*/
class GeometricShapeMain
{
	public static void main(String[] args) 
	{
		// TODO instancier plusieurs objets des classes Rectangle et Circle (2 instances de chaque)
		Rectangle rectangle1 = new Rectangle(6,5);
		Circle circle1 = new Circle(4.5);
		rectangle1.calculateArea(rectangle1);
		rectangle1.calculatePerimeter(rectangle1);
		circle1.calculateArea(circle1);
		circle1.calculatePerimeter(circle1);
		
		// TODO ajouter ces objets à une instance de la classe "ArrayList"
		ArrayList<Rectangle> arrayRectangles = new ArrayList<>();

		
		ArrayList<Circle> arrayCircle1 = new ArrayList<>();


		// plus d'information sur la classe "ArrayList" -> https://info.clg.qc.ca/java/structures/array-list
		// TODO boucler sur les éléments de la liste afin d'afficher le périmètre et l'aire de chaque objet
		arrayRectangles.add(rectangle1);
		for (Rectangle rectangle : arrayRectangles) {
		}

		arrayCircle1.add(circle1);
		for (Circle circle : arrayCircle1) {		
		}

	}	
}
