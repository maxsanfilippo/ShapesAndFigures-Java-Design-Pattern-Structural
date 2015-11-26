package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		Circle newcircle = new Circle(7);
		//newcircle.draw(new Position(3,4));
		ShadowShapeDecorator shadows = new ShadowShapeDecorator(newcircle, 5, 4);
		//shadows.draw(new Position(3,4));
		
		BorderDecorator border = new BorderDecorator(shadows, 4);
		//border.draw(new Position(3,4));
		
		SolidFillDecorator couleur = new SolidFillDecorator(border, Color.RED);
		couleur.draw(new Position(3,4));
		
		//Rectangle newrectangle = new Rectangle(4, 5);
		//newrectangle.draw(new Position(1,8));
		
		
	}

}
