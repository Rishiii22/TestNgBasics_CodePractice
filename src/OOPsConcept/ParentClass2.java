package OOPsConcept;

public class ParentClass2 extends ParentClass3 {
int num;
public ParentClass2(int num) {
	// TODO Auto-generated constructor stub
	super(num);
	this.num=num;
}
public  int incrementNumber()
{
	num=num++;
	return num;
}
}
