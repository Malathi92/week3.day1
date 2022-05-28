package Org.system;

public class Desktop extends Computer {
	public void  desktopSize(String size)
	{
		System.out.println("size of the desktop is:"+size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop d=new Desktop();
		d.computerModel("AcerOne14z2-485");
		d.desktopSize("12.5 inches");

	}

}
