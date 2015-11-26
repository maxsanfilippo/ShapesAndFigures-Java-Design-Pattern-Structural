package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		/*
		 * Application du pattern décorateur
		 */
		Circle newcircle = new Circle(7);
		ShadowShapeDecorator shadows = new ShadowShapeDecorator(newcircle, 5, 4);
		BorderDecorator border = new BorderDecorator(shadows, 4);
		SolidFillDecorator couleur = new SolidFillDecorator(border, Color.RED);
		couleur.draw(new Position(3,4));
		
		/*
		 * Application pattern composite
		 */
		
		ShapeComposite conteneur = new ShapeComposite();
		
		Rectangle newrectangle = new Rectangle(4, 5);
		Circle circle2 = new Circle(3);
		conteneur.addElement(newrectangle);
		conteneur.addElement(circle2);
		conteneur.draw(new Position(2,8));
		
	}

}
