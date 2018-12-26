package model;

import java.io.Serializable;

/**
 *
 * @author ViNguyen
 */
public class NhanVien implements Serializable{
    private int maNV;
    private String hoTen,diaChi,soDT;

    public NhanVien(int maNV, String hoTen, String diaChi, String soDT) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
    
    public Object[] toObject() {
        return new Object[] {maNV,hoTen,diaChi,soDT};
    }
}
