package fr.iutvalence.info.dut.m3105.preamble;

public class BorderDecorator extends Shape
{
	private int thickness;
	private Shape shape;
	
	public BorderDecorator(Shape shape, int thickness)
	{
		this.shape=shape;
		this.thickness=thickness;
	}

	@Override
	public String toString()
	{
		return this.shape.toString()+"BorderDecorator [thickness=" + thickness + " ]";
	}
	
}
