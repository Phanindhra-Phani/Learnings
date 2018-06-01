package generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardGenerics {

	public <E> void showShapes(List<? extends Shape> shapesList){
		
		for (Shape e : shapesList) {
			e.draw();
		}
	}
	
	public static void main(String[] args) {
		WildcardGenerics wildcardGenerics = new WildcardGenerics();
		
		List<Rectangle> rectangles = new ArrayList<Rectangle>();
		rectangles.add(new Rectangle());
		rectangles.add(new Rectangle());
		
		wildcardGenerics.showShapes(rectangles);
		
		List<Circle> circles = new ArrayList<Circle>();
		circles.add(new Circle());
		circles.add(new Circle());
		
		wildcardGenerics.showShapes(circles);
	}
}
