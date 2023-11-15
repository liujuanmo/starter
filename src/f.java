public class f {
	public static void main(String[] args){
	int x=3;
	int y=2;
	int z=x/y;
	double a=x/y;
	System.out.println(z);
	System.out.println(a);

   	int x1=20,x2=40,x3=50;
	int av1=(x1+x2+x3)/3;
	double a1=20.0,a2=40.0,a3=50;

// 错误: 不兼容的类型: 从double转换到int可能会有损失
        int av0= (int) ((a1+a2+a3)/3);
	double av2=(a1+a2+a3)/3;
	System.out.println(av1);
	System.out.println(av0);
	System.out.println(av2);

	double y1=3.0,y2=2.0;

//错误: 不兼容的类型: 从double转换到int可能会有损失
	int y3= (int) (y1/y2);
	System.out.println(y3);
	}
}