package model;

import java.io.Serializable;

/**
 *
 * @author ViNguyen
 */
public class DSBH implements Serializable{
    private NhanVien nhanVien;
    private MatHang matHang;
    private int soL;

    public DSBH(NhanVien nhanVien, MatHang matHang, int soL) {
        this.nhanVien = nhanVien;
        this.matHang = matHang;
        this.soL = soL;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public void setMatHang(MatHang matHang) {
        this.matHang = matHang;
    }

    public int getSoL() {
        return soL;
    }

    public void setSoL(int soL) {
        this.soL = soL;
    }
    
    public Object[] toObject() {
        return new Object[] {getNhanVien().getMaNV(),getNhanVien().getHoTen(),getMatHang().getMaMH(),getMatHang().getTenMH(),soL};
    }
}
