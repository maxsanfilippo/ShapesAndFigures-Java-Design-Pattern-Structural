package fr.iutvalence.info.dut.m3105.preamble;

public abstract class Shape
{
	public void draw(Position p)
	{
		System.out.println("drawing ["+ this.toString()+ "] � la position "+ p.getX() + ","+p.getY());
	}
}
