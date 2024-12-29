package ArrayList;

import java.util.ArrayList;

public class ColorArrayList {
	private ArrayList<String> colors;
	public ColorArrayList(){
		colors = new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
	}
	public boolean containsColor(String color){
		return colors.contains(color);
	}
}
