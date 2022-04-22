package thisinhduthi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyThiSinh implements QuanLy<ThiSinh> {
    List<ThiSinh> danhSach = new ArrayList<>();


    @Override
    public void them( ThiSinh thiSinh) {
        danhSach.add(thiSinh);
    }

    @Override
    public void hienThi() {
        for (int i=0 ; i<danhSach.size();i++){
            System.out.println(danhSach.get(i));
        }
        System.out.println("------------");
    }

    @Override
    public void timKiem(String name) {
        for (int i = 0; i <danhSach.size(); i++) {
            if(this.danhSach.get(i).getName().equals(name)){
                System.out.println("Tim thay o vi tri : " + i);
                return;
            }else {
                System.out.println("Khong tim thay ");
            }

        }
    }

    @Override
    public void thoatCT() {
        System.exit(0);
    }

    public static void main(String[] args) {
        QuanLyThiSinh quanLyThiSinh = new QuanLyThiSinh();
        quanLyThiSinh.them(new KhoiA("son1","Ha Noi 2", 3));
        quanLyThiSinh.them(new KhoiB("Son3","Ha Noi 3",4));
        quanLyThiSinh.them(new KhoiC("Son3","Ha Noi 3",4));
        quanLyThiSinh.hienThi();
        Scanner sc=new Scanner(System.in);
        String tim = sc.nextLine();
        quanLyThiSinh.timKiem(tim);
    }
}

