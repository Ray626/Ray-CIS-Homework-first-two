package DeMorgan.assignment;

public class assignment {

    public static void main(String[] args) {
        //Question 1
        int x = 5;
        int y = 7;
        System.out.println(((x*4) < (y + 15)) && x < y);
        System.out.println(20 < 24 && 5 < 7);
        System.out.println(true && true);
        System.out.println(true);

        //Question 2
        x = 10;
        y = 20;
        int z = 30;
        System.out.println((( x == y) || (x < z)) && (x*2 + y)/5 > z);
        System.out.println(10 == 20 || 10 < 20 && 8 > 30);
        System.out.println(false||true&&false);
        System.out.println(false);

        //Question 3
        boolean a = true;
        boolean b = false;
        System.out.println((a || b) && ((a == b) || a));
        System.out.println(true && (false || true));
        System.out.println(true);


        //Question 4
        a = false;
        b = false;
        x = 5;
        y = 10;
        System.out.println((a == b) && (x * 4) == (y % 6) * 5);
        System.out.println(true && (20 == 20));
        System.out.println(true && true);
        System.out.println(true);

        //Question 5
        System.out.println((Math.abs(-2) == 2) || (Math.sqrt(Math.pow(9,2)) <= 9 && (-4 <= 4)));
        System.out.println(true || ((9 <=9) &&(true)));
        System.out.println(true || (true || true) );
        System.out.println(true);
    }
}