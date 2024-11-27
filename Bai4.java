package Buoi3;

public class Bai4 {
    public static void main(String[] args) {
        Bai4 b = new Bai4();
        b.phuongAn();
    }
    public void phuongAn(){
        int tong = 200000;
        System.out.println("Các phương án là : ");
        // lặp qua các gtri có thể cho tờ 5000
        for(int d5000=0; d5000<=tong/5000; d5000++){
            // lặp qua các gtri có thể cho tờ 2000
            for(int d2000=0; d2000<=tong/2000; d2000++){
                // tính số tiền đã dùng cho 2 tờ 5k và 2k
                int tienDaDung=d5000*5000+d2000*2000;
                // tính số tiền còn lại
                int tienConLai=tong-tienDaDung;
                //ktra còn cần bn tờ 1k nữa
                if(tienConLai >=0 && tienConLai %1000==0){
                    int d1000=tienConLai/1000;

                    // in ra phương án
                    System.out.println("5000đ : " + d5000 + " tờ , 2000đ : " + d2000 + " tờ , 1000đ : " + d1000);
                }
            }
        }
    }
}
