package lesson6;

import java.util.Scanner;

public class lesson6_If_Else03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u1 = sc.nextInt();
        int u2 = sc.nextInt();
        int u3 = sc.nextInt();
        int u4 = sc.nextInt();

        if (u1 != u2) {
            if (u1 != u3) {
                if (u1 != u4) {
                    if (u2 != u3) {
                        if (u2 != u4) {
                            if (u3 != u4) {
                                if (u1 > u2) {
                                    if (u1 > u3) {
                                        if (u1 > u4) {
                                            System.out.println("u1= " + u1);
                                        }
                                    }
                                } else {
                                    if (u2 > u3) {
                                        if (u2 > u4) {
                                            System.out.println("u2= " + u2);
                                        }
                                    } else {
                                        if (u3 > u4) {
                                            System.out.println("u3= " + u3);
                                        } else {
                                            System.out.println("u4= " + u4);
                                        }
                                    }
                                }
                            } else {
                                System.out.println("u3 == u4 " + u3 + " " + u4);
                            }
                        } else {
                            System.out.println("u2 == u4 " + u2 + " " + u4);
                        }
                    } else {
                        System.out.println("u2 == u3 " + u2 + " " + u3);
                    }
                } else {
                    System.out.println("u1 == u4 " + u1 + " " + u4);
                }
            } else {
                System.out.println("u1 == u3 " + u1 + " " + u3);
            }
        } else {
            System.out.println("u1 == u2 " + u1 + " " + u2);
        }


    }

//        if (u1 > u2 && u1 > u3 && u1 > u4) {
//            System.out.println(u1);
//        } else if (u2 > u1 && u2 > u3 && u2 > u4) {
//            System.out.println(u2);
//        } else if (u3 > u1 && u3 > u2 && u3 > u4) {
//            System.out.println(u3);
//        } else if (u4 > u2 && u4 > u3 && u4 > u1) {
//            System.out.println(u4);
//        }


}


