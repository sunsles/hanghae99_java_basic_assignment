import static java.lang.Math.random;

public class Hello {

    public static void main(String[] args) {
//       문제 1) 다음 코드를 실행하면 출력 결과로 5를 기대했는데 4가 출력되었습니다. 어디에서 잘못 작성된 것일까요?
//        int var1=5;
//        int var2=2;
//        double var3=var1/var2;
//        int var4=(int)(var3*var2);
//        System.out.println(var4);
        //풀이
        int var1 =5; //5
        int var2 =2; //2
        double var3 = var1%var2; //%사용해 나머지값 출력 :1.0
        int var4 = (int)(var3*var1); //var2 ->var1으로 변경
        System.out.println(var4); //5출력
        //문제2 ) 답은 :31
        int x= 10;
        int y =20;
        int z =(++x) + (y--); //x =11 ,y =20 ,z=31 ->y=19
        System.out.println(z);//31 출력

        //문제3 : while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
        // 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
        // 눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)입니다.
        while (true){
        int num1 = (int)(Math.random() *6) +1; //(0~6)*6 +1해야만 1~6 숫자출력
        int num2 = (int)(Math.random() *6) +1;
        int sum = num1 +num2;
        System.out.println("눈1+눈2 ="+num1+num2 );
        if(sum == 5){
            break; //합이 5라면 멈춰라 .
            //눈1+눈2 =64
            //눈1+눈2 =66
            //눈1+눈2 =63
            //눈1+눈2 =34
            //눈1+눈2 =65
            //눈1+눈2 =42
            //눈1+눈2 =13
            //눈1+눈2 =54
            //눈1+눈2 =21
            //눈1+눈2 =32 3+2=5이므로 break
        }
        }
    }
    }
