package java_exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * Ŭ������ ��� 
 * �Է� - �ܺ�
 * ó�� - ����
 * ��� - �ܺ�
 * 
 * ������� 4���� 
 * 	���ҵ�
 * 	�ſ���
 * 	������
 * 	�߱޻���
 * 
 * 1�Է� - Ű����
 * 	���ҵ� 
 * 	�ſ���
 * 	������
 * 	�߱޻���
 * 2 ó��
 * 
 * 3 ���
 * 	
 * @author bitcamp
 *
 */
public class Page_121_4_1 {
	private int annualIncome; //���ҵ� 0
	private char creditRating; // �ſ��� 0
	private boolean isMember; //������ false
	private String issuanceStatus; //�߱޻��� null �� �̷��� �ʱ�ȭ�� ��
	
	private BufferedReader reader;
	
	public Page_121_4_1() {
		reader = new BufferedReader( new InputStreamReader(System.in) );
	}
	public void consoleInput() {
		try {
		System.out.println("���ҵ�? "); 
		annualIncome = Integer.parseInt( reader.readLine() );
		
		System.out.println("A, B, C, D, F �߿� �Է��ϼ���.");
		System.out.println("�ſ���? ");
		
		String s =reader.readLine();
		if(s.length()==1 &&	s.equalsIgnoreCase("A")||s.equalsIgnoreCase("B")||
				s.equalsIgnoreCase("C") ) {
			creditRating = s.toUpperCase().charAt(0);
		}else {
			reInput("A, B, C, D, F �߿� �Է��ϼ���.");
			
		}
		
		System.out.println("�������� T, �ű԰��� F");
		System.out.println("������? ");
		s = reader.readLine();
		if(s.length()==1 && s.equalsIgnoreCase("T")|| s.equalsIgnoreCase("f") ) {
						
			isMember=true;
		}else {
			reInput("�������� T, �ű԰��� F");
			
		}
		membershipCondition();
		
		}catch (IOException e) {
			System.out.println("�Է��� �޾Ƽ� exception�� Ǯ��");
		}catch (NumberFormatException e) {
			reInput("���ڸ� �Է����ּ���.");
			
		}catch (Exception e) {
			reInput("�������� ���� ����");
			
		}
	}
	
	private void reInput(String msg) {
		System.out.println(msg);
		consoleInput();
	}
	protected void membershipCondition() {
		if(annualIncome >=50000000 || creditRating >='B') {
			if(isMember)issuanceStatus = "�߱޴��"; 
		}	
			else issuanceStatus = "�߱޴������";
		
	}
	public void consoleOutput() {
		System.out.println("���ҵ� �ſ��� ������ �߱޻���");
		System.out.printf("%12d %5c %8b %10s \n", 
				annualIncome, creditRating, isMember, issuanceStatus);
	}
		
	
	
	
}//class end
