package Lab1;

import java.util.*;

public class Aeiou {
	private Run r = new Run();

	public void calWord() {

		String word; // �红�ͤ������й��ҹѺ���
		Scanner scan = new Scanner(System.in);
		System.out.print("Please insert your word : ");
		word = scan.nextLine(); // ���Ѻ��ͤ���
		System.out.println("======================");
		System.out.println("Your word is " + word); // �ʴ��Ţ�ͤ�������Ѻ�����

		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'A' || word.charAt(i) == 'a' || // ����ҵ���ѡ���� A ���� a
					word.charAt(i) == 'E' || word.charAt(i) == 'e' || // ����ҵ���ѡ���� E ���� e
					word.charAt(i) == 'I' || word.charAt(i) == 'i' || // ����ҵ���ѡ���� I ���� i
					word.charAt(i) == 'O' || word.charAt(i) == 'o' || // ����ҵ���ѡ���� O ���� o
					word.charAt(i) == 'U' || word.charAt(i) == 'u' // ����ҵ���ѡ���� U ���� u
			) {
				count++; // �ӡ�ùѺ������� A E I O U
			}
		}
		System.out.println("Number of AEIOU = " + count); // �ʴ��ӹǹ��з��Ѻ��������㹵���� count
	}
}