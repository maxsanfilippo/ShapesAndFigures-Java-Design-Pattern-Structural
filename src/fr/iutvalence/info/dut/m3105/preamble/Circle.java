package fr.iutvalence.info.dut.m3105.preamble;

public class Circle extends Shape
{
	private int radius;
	
	public Circle(int r)
	{
		this.radius=r;
	}

	@Override
	public String toString()
	{
		return "Circle (radius=" + radius + ")";
	}
}
