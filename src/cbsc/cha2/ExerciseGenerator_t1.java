package cbsc.cha2;
import java.util.Random;
/*
 *�������1��ɵĴ���
 */
public class ExerciseGenerator_t1 {	
	public static void generateExerciseOfAdditionEquations (){
		int m,n;
	
		for(int i=0;i<50;i++){
			n=generateOperand();
			m=generateOperand();
			System.out.println((i+1)+ ": "+n+" + "+m+" = ");  // ��ͬ������ʵ�ֲ�һ��
		}
	}

	public static int generateOperand(){
	// ����100���ڵ�����
		Random random = new Random();
		return (short)random.nextInt(101);
	}
	public static void printHeader(){
		System.out.println("------------------------------------");
		System.out.println("- �������50��100���ڵļӷ�����ʽ��ϰ�� -");
		System.out.println("------------------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHeader();
		generateExerciseOfAdditionEquations();
	}

}
