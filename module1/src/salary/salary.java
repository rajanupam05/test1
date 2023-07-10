package salary;

public class salary 
{
	float c,d;
	public float m1(int basic)
	{
		c=basic*1000;
		d=(float)(c+(c*0.02));
		System.out.println("level 1 salary is: "+d);
		return d;
	}
	float e,f;
	public float m2(int basic)
	{
		e=basic*1000;
		f=(float)(e+(e*0.02));
		System.out.println("level 2 salary is: "+f);
		return f;
	}
}
