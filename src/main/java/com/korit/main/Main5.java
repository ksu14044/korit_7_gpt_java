package com.korit.main;

@FunctionalInterface
interface 무기 {
    String 공격(Integer 데미지);
}

class 총 implements 무기 {

    @Override
    public String 공격(Integer 데미지) {
        System.out.println( 데미지 + "만큼 총을 쏜다");
        return "총 데미지 = " + 데미지;
    }
}

public class Main5 {
    public static void main(String[] args) {
        무기 wp1 = new 총();
        wp1.공격(10);

        무기 wp2 = new 무기() {
            @Override
            public String 공격(Integer 데미지) {
                System.out.println(데미지 + "만큼 내가 만든 무기로 공격");
                return "총 데미지 : " + 데미지;
            }
        };
        wp2.공격(20);

        무기 wp3 = ( Integer 데미지 ) -> {
            return "총 데미지 : " +데미지;
        };
        wp3.공격(30);

        System.out.println(wp1.공격(200));
        System.out.println(wp2.공격(300));
        System.out.println(wp3.공격(400));

        // 매개변수 자료명 생략 가능 / 매개변수 하나면 소괄호 생략 가능 / 구현부 한줄이면 return, 중괄호 생략 가능
        무기 wp4 = 데미지 -> "총 데미지 : " +데미지 ;

        System.out.println(wp4.공격(500));
    }
}
