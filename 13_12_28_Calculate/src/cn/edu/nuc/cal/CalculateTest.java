package cn.edu.nuc.cal;

public class CalculateTest {

	public static void main(String[] args) {

		// ���������
		// + - * / % ++ ---

		// λ�����
		// & | ^ << >> >>>

		/** ��ֵ����� */
		// ��ֱ�������Ƹ�����
		int a = 5;
		// �ѱ��ʽ���Ƹ�����
		a = 5 + 6;
		// �����ø��Ƹ�����
		String s1 = "sss";
		String s2 = s1;
		// ��ֵ����������ֵ
		int b, c, d;
		a = b = c = d = 7;

		a = a + 6;
		// ��չ��ֵ�����
		// java���Ƽ�ʹ�����·�ʽ����
		a += 6;
		a -= 6;
		a *= 6;
		a /= 6;// --> a=a/6
		a &= 3;
		a |= 3;

		/** �Ƚ������ */
		// >,>=,<,<=,==,!=
		// ע�����ж�ʱ�á�==������Ҫ�á�=��
		// �����������͵�ʱ��ʹ��==��Ҫ����
		System.out.println(5 == 4);

		/** �߼������ */
		// &&,&,||,|,!,^
		a = 5;
		b = 9;
		// ��·��ǰ��ķ�������������Ĳ�����
		if (a > 7 && b++ > 7) {
			System.out.println("�ɹ�   a=" + a + "  b=" + b);
		} else {
			System.out.println("ʧ��   a=" + a + "  b=" + b);
		}
		a = 5;
		b = 9;
		if (a > 7 & b++ > 7) {
			System.out.println("�ɹ�   a=" + a + "  b=" + b);
		} else {
			System.out.println("ʧ��   a=" + a + "  b=" + b);
		}

		/** ��Ŀ����� */
		// ����
		int aa = 5 > 4 ? 7 : 2;
		String bb = a>b? "a��":"b��";
		System.out.println(bb);
		int cc = a>b?a++:b++;

	}

}
