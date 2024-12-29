package ArrayList;

//TODO Первая задача
public class Main {
	public static void main(String[] args) {
        ColorArrayList colors = new ColorArrayList();
		System.out.println(colors.containsColor("red"));//Цвет содержится в списке
		System.out.println(colors.containsColor("black"));//Цвет не содержится в списке
	}
}