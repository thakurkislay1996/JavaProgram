package AreasandPerimeter;

public class Cube 
{
	static int cube(int x)
	{
		return x*x*x;
	}
	public static void main(String[] args)
	{
		int result=Cube.cube(5);
				System.out.println("Cube of Given Number is:"+result);
	}
}
