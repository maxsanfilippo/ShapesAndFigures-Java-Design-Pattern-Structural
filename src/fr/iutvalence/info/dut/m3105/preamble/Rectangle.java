package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle extends Shape
{

		private int width;
		private int height;
		
		public Rectangle(int w, int h)
		{
			this.width = w;
			this.height = h;
		}

		@Override
		public String toString()
		{
			return "Rectangle (width=" + width + ", height=" + height + ")";
		}

	
}
