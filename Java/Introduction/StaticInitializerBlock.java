

static boolean flag = true; static int B,H;

static{

    Scanner sc = new Scanner (System.in);

    B = sc.nextInt();
    H = sc.nextInt();

    if (B<=0 || H<=0){
    flag = false;
    System.out.print("java.lang.Exception: Breadth and height must be positive");

}

}
