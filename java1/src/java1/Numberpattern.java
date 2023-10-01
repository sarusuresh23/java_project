package java1;
public class Numberpattern {
		public static void main(String[] args)  {
			for(int i=0;i<=4;i++) {
				for(int j=0;j<=8;j++) {
					if((i==0&&j==0)||(i==4&&j==4)) {
						System.out.print("1");
					}
					if((i==1&&j==0)||(i==0&&j==1)||(i==4&&j==3)||(i==3&&j==7)) {
						System.out.print("2");
					}
					if((i==2&&j==0)||(i==0&&j==2)||(i==4&&j==2)||(i==2&&j==7)) {
						System.out.print("3");
					}
					if((i==3&&j==0)||(i==0&&j==3)||(i==4&&j==1)||(i==1&&j==7)) {
						System.out.print("4");
					}
					if((i==4&&j==0)||(i==0&&j==4)) {
						System.out.print("5 ");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("\n");
			}
			
			
		}
	}


