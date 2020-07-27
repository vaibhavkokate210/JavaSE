package Basic;
/* 1)create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access these attributes directly.
provide accessor methods on these attributes and allow them to call from outside of your class.
*/
class shape
{
	private int height;
	private int width;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
public class Basic1 {

	public static void main(String[] args) {
	   shape s=new shape();
	   s.setHeight(100);
	   s.setWidth(50);
	   System.out.println("height is = "+s.getHeight());
	   System.out.println("width is = "+s.getWidth());

	}

}
