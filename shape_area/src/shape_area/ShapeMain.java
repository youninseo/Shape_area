package shape_area;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		while (true) {
			System.out.println("���� �ʺ� ���ϱ�");
			System.out.print("�簢��:1 �ﰢ��:2 ����:9 ");
			int choice = scanner.nextInt();
			
			Shape shape = null;
			ShapeType shapeType = null;
			int value1 = 0;
			int value2 = 0;
			double area = 0.0;
			
			switch (choice) {
			case 1:				
				System.out.print("�簢�� ���� ���� ");
				value1 = scanner.nextInt();
				
				System.out.print("�簢�� ���� ���� ");
				value2 = scanner.nextInt();
				
				shapeType = ShapeType.�簢��;
				shape = new Rect();
				break;
			case 2:
				System.out.print("�ﰢ�� �غ� ���� ");
				value1 = scanner.nextInt();
				
				System.out.print("�ﰢ�� ���� ���� ");
				value2 = scanner.nextInt();
				
				shapeType = ShapeType.�ﰢ��;
				shape = new Tri();
				break;
			case 9:
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				System.exit(0);
			}
			
			shape.setData(value1, value2);
			area = shape.calcArea();
			
			System.out.print(shapeType);
			System.out.println("�ʺ�: " + area);
			
		}
	}
}
