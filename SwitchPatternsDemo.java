public class SwitchPatternsDemo {
	public static double getPerimeter(Shape shape) {
		if(shape instanceof Circle c) {
			return 2* Math.PI * c.radius();
		} else if(shape instanceof Rectangle r) {
			return 2* r.length() * r.width();
		} else {
			throw new IllegalArgumentException();
		}
	}
	public static void main(String[] args ) {
		System.out.println(getPerimeter(new Circle(14)));
	}
}
