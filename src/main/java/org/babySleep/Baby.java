package org.babySleep;

public class Baby {
    private int order = 0;
    private int cnt1 = 0;
    private int cnt2 = 0;
    public void wash() {
        if (order==0) {
            System.out.println("아기를 씻깁니다...쏴아아...");
            System.out.println("아기를 다 씻겼습니다.");
            order = 1;
        }else if (order==1||order==2||order==3)System.out.println("아기를 이미 씻겼습니다.");
        else if (order==4) System.out.println("아기가 잠들었습니다...zzz");
    }

    public void milk() {
        if (order==1) {
            cnt1++;
            System.out.println("아기에게 우유를 먹입니다. ("+cnt1+"/10)");
            if(cnt1==10){
                System.out.println("아기에게 우유를 다 먹였습니다.");
                order = 2;
            }
        } else if (order==0) System.out.println("아직 아기를 씻기지 않았습니다.");
        else if(order==2||order==3) System.out.println("우유를 이미 다 먹였습니다.");
        else if (order==4) System.out.println("아기가 잠들었습니다...zzz");
    }

    public void bed() {
        if (order==2) {
            System.out.println("아기를 침대에 눕힙니다...");
            order = 3;
        } else if (order==0) System.out.println("아직 아기를 씻기지 않았습니다.");
        else if (order==1) System.out.println("아직 아기에게 우유를 먹이지 않았습니다.");
        else if (order==3) System.out.println("아기를 이미 씻겼습니다.");
        else if (order==4) System.out.println("아기가 잠들었습니다...zzz");
    }

    public void read() {
        if (order==3) {
            cnt2++;
            System.out.println("아기에게 책 한페이지를 읽어줍니다... ("+cnt2+"/3)");
            if(cnt2==3){
                System.out.println("아기에게 책을 다읽어줬습니다.\n아기가 잠에 듭니다~~~zzz " +
                        "(성공!!!)");
                order = 4;
            }
        } else if (order==0) System.out.println("아직 아기를 씻기지 않았습니다.");
        else if (order==1) System.out.println("아직 아기에게 우유를 먹이지 않았습니다.");
        else if (order==2) System.out.println("아기를 아직 침대에 눕히지 않았습니다.");
        else if (order==4) System.out.println("아기가 잠들었습니다...zzz");

    }
}
