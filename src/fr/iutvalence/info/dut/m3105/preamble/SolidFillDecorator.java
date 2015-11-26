package fr.iutvalence.info.dut.m3105.preamble;

public class SolidFillDecorator extends Shape
{
	public Color color;
	public Shape shape;

	public SolidFillDecorator(Shape shape, Color color)
	{
		this.shape = shape;
		this.color = color;
	}

	@Override
	public String toString()
	{
		return this.shape.toString()+" avec couleur  (color=" + color + ")";
	}
	
	
	
}
