package factoryPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape shape = shapeFactory.getShape("CIRCLE");
		shape.drow();

	}

}
