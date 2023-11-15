public class g {
	public static void main(String[] args){
	int x=4;
	int y=5;
	int z=x/y;
	double a=x/y;
	System.out.println(z);
	System.out.println(a);

	double a1=4.0,a2=5.0;

// 错误: 不兼容的类型: 从double转换到int可能会有损失
//	int av1=a1/a2;
	double av2=a1/a2;
//	System.out.println(av1);
	System.out.println(av2);
double b1=2,b2=3;
int c= (int) (b1*b2);
	System.out.println(c);
	}
}