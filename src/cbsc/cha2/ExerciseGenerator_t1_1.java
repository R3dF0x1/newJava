package cbsc.cha2;

import java.util.Random;
/*
 *�������1��ɵĴ���
 *���ӽ��Լ����������ӡ���
 *ʹ���߶��⡢�жϽ��
 */
public class ExerciseGenerator_t1_1 {	
	public static void generateExerciseOfAdditionEquations (){
		int m,n,v;
		for(int i=0;i<50;i++){
			n=generateOperand();
			do{
				m=generateOperand();
				v=m+n;
			}while (v >= 100);
			System.out.println((i+1)+ ": "+n+" + "+m+" = "+v);  // ��ͬ������ʵ�ֲ�һ��
		}
	}

	public static int generateOperand(){
	// ����100���ڵ�����
		Random random = new Random();
		return (short)random.nextInt(101);
	}
	public static void printHeader(){
		System.out.println("------------------------------------");
		System.out.println("- �������50��100���ڵļӷ�����Ŀ����� -");
		System.out.println("------------------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHeader();
		generateExerciseOfAdditionEquations();
	}

}