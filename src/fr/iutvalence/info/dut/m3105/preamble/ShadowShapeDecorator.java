package fr.iutvalence.info.dut.m3105.preamble;

public class ShadowShapeDecorator extends Shape
{

	private int angle;
	private int intensity;
	private Shape shape;

	public ShadowShapeDecorator(Shape shape,int angle, int intensity)
	{
		this.shape=shape;
		this.angle=angle;
		this.intensity=intensity;
	}

	@Override
	public String toString()
	{
		return this.shape.toString()+", avec ombre (angle=" + angle + ", intensity="
				+ intensity+")" ;
	}
}
