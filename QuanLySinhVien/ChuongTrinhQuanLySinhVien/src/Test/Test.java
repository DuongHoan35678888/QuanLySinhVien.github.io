package Test;

import main.DanhSachSinhVien;
import main.SinhVien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        do{
            System.out.println("MENU------------ ");
            System.out.println("Vui lòng chọn chức năng ");
            System.out.println(
                    "1. thêm sinh viên vào danh sách.\n"
                    + "2. in danh sách sinh viên ra màn hình.\n"
                    + "3. kiểm tra danh sách có rỗng hay không.\n"
                    + "4. lấy ra số lượng sinh viên trong danh sáchn.\n"
                    + "5. làm rỗng danh sách sinh viênn.\n"
                    + "6. kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                    + "7. xóa 1 sinh viên ra khỏi danh sách dựa theo mã sinh viên.\n"
                    + "8. tìm kiếm tất cả sinh viên dựa theo tên được nhập từ bàn phím.\n"
                    + "9. xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                    + "0. Thoát khỏi chương trình.\n"
            );
            luaChon = scanner.nextInt();
            scanner.nextLine();
            if(luaChon == 1){
                System.out.println("Nhập mã sinh viên: "); String maSinhVien = scanner.nextLine();
                System.out.println("Nhập họ và tên: "); String hoVaTen  = scanner.nextLine();
                System.out.println("Nhập năm sinh: "); int namSinh = scanner.nextInt();
                System.out.println("Nhập điểm trung : "); float diemTrungBinh = scanner.nextFloat();
                SinhVien sinhVien = new SinhVien(maSinhVien, hoVaTen, namSinh,diemTrungBinh);
                dssv.themSinhVien(sinhVien);

            }else if(luaChon == 2){
                dssv.inDanhSachSinhvien();
            }else if(luaChon == 3){
                System.out.println("Danh sach rong: " + dssv.kiemTraDanhSachRong());
            }else if(luaChon == 4){
                System.out.println("So luong sinh vien trong danh sach: " + dssv.laySoLuongSinhVien());
            }else if(luaChon == 5){
                dssv.lamRongDanhSachSinhVien();
            }else if(luaChon == 6){
                System.out.println("Nhập mã sinh viên: "); String maSinhVien = scanner.nextLine();
                SinhVien sinhVien = new SinhVien(maSinhVien);
                System.out.println("Kiem tra sinh vien co trong danh sach: " + dssv.kiemTraTonTai(sinhVien));
            }else if(luaChon == 7){
                System.out.println("Nhập mã sinh viên: "); String maSinhVien = scanner.nextLine();
                SinhVien sinhVien = new SinhVien(maSinhVien);
                System.out.println("Xoa sinh vien trong danh sach: " + dssv.xoaSinhVien(sinhVien));
            }else if(luaChon == 8){
                System.out.println("Nhập họ và tên: "); String hoVaTen  = scanner.nextLine();
                System.out.println("Ket qua tim kiem: ");
                dssv.timSinhVien(hoVaTen);
            }else if(luaChon == 9) {
                dssv.sapXepSinhVienGiamDanTheoDiem();
                dssv.inDanhSachSinhvien();
            }
        }while (luaChon!=0);
    }
}
