package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<>(0);
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    // Them mot sinh vien vao danh sach
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
     // In danh sach sinh vien len man hinh
    public void inDanhSachSinhvien(){
        for (SinhVien sinhVien: danhSach){
            System.out.println(sinhVien);
        }
    }

    // Kiem tra xem danh sach sinh vien co rong hay khong
    public boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();
    }

    // Lay ra so luong sinh vien trong danh sach
    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }

    // lam rong danh sach sinh vien
    public void lamRongDanhSachSinhVien(){
        this.danhSach.removeAll(danhSach);
    }

    // Kiem tra ton tai sinh vien hay ko dua vao ma sinh vien
    public boolean kiemTraTonTai(SinhVien sinhVien){
        return this.danhSach.contains(sinhVien);
    }

    // Xoa 1 sinh vien ra khoi danh sach dua vao ma sinh vien
    public boolean xoaSinhVien(SinhVien sinhVien){
        return this.danhSach.remove(sinhVien);
    }

    // Tim tat ca sinh vien dua tren ten duoc nhap tu ban phim
    public void timSinhVien(String ten){
        for (SinhVien sinhVien: danhSach){
            if(sinhVien.getHoVaten().indexOf(ten)>=0){
                System.out.println(sinhVien);
            }
        }
    }

    // xuat danh sach sinh vien co diem tu cao den thap
    public void sapXepSinhVienGiamDanTheoDiem(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()){
                    return 1;
                }else if(sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }

}
