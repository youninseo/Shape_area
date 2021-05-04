package shape_area;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		while (true) {
			System.out.println("도형 너비 구하기");
			System.out.print("사각형:1 삼각형:2 종료:9 ");
			int choice = scanner.nextInt();
			
			Shape shape = null;
			ShapeType shapeType = null;
			int value1 = 0;
			int value2 = 0;
			double area = 0.0;
			
			switch (choice) {
			case 1:				
				System.out.print("사각형 가로 길이 ");
				value1 = scanner.nextInt();
				
				System.out.print("사각형 세로 길이 ");
				value2 = scanner.nextInt();
				
				shapeType = ShapeType.사각형;
				shape = new Rect();
				break;
			case 2:
				System.out.print("삼각형 밑변 길이 ");
				value1 = scanner.nextInt();
				
				System.out.print("삼각형 높이 길이 ");
				value2 = scanner.nextInt();
				
				shapeType = ShapeType.삼각형;
				shape = new Tri();
				break;
			case 9:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}
			
			shape.setData(value1, value2);
			area = shape.calcArea();
			
			System.out.print(shapeType);
			System.out.println("너비: " + area);
			
		}
	}
}
