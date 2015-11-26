package fr.iutvalence.info.dut.m3105.preamble;

public class ShapeComposite extends Shape
{
	private Shape elements[];
	private int nbelements;
	
	public ShapeComposite()
	{
		this.elements = new Shape[10];
		this.nbelements = 1;
	}
	
	public void addElement(Shape shape)
	{
		this.elements[nbelements] = shape ;
		nbelements++;
	}
	public void draw(Position p)
	{
		for(int index = 0; index < 10 ; index++)
		{
			elements[index].draw(p);
		}
	}
}
