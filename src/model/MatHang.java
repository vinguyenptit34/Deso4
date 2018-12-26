package model;

import java.io.Serializable;

/**
 *
 * @author ViNguyen
 */
public class MatHang implements Serializable{
    private int maMH;
    private String tenMH,nhomMH;
    private double giaB;
    private int soL;

    public MatHang(int maMH, String tenMH, String nhomMH, double giaB, int soL) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.nhomMH = nhomMH;
        this.giaB = giaB;
        this.soL = soL;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getNhomMH() {
        return nhomMH;
    }

    public void setNhomMH(String nhomMH) {
        this.nhomMH = nhomMH;
    }

    public double getGiaB() {
        return giaB;
    }

    public void setGiaB(double giaB) {
        this.giaB = giaB;
    }

    public int getSoL() {
        return soL;
    }

    public void setSoL(int soL) {
        this.soL = soL;
    }
    
    public Object[] toObject() {
        return new Object[] {maMH,tenMH,nhomMH,giaB,soL};
    }
}
