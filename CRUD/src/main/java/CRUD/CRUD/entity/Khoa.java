package CRUD.CRUD.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "KHOA")
public class Khoa {

    @Id
    @Column(name = "Ma_Khoa")
    private String maKhoa;

    @Column(name = "Ten_Khoa")
    private String tenKhoa;

    @Column(name = "Nam_Thanh_Lap")
    private Integer namThanhLap;

    @Column(name = "MaID")
    private String maID;

    @Column(name = "NgayNhap")
    private Date ngayNhap;

    @Column(name = "NgaySua")
    private Date ngaySua;

    @Column(name = "NguoiSua")
    private String nguoiSua;

    // Getters and Setters

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public Integer getNamThanhLap() {
        return namThanhLap;
    }

    public void setNamThanhLap(Integer namThanhLap) {
        this.namThanhLap = namThanhLap;
    }

    public String getMaID() {
        return maID;
    }

    public void setMaID(String maID) {
        this.maID = maID;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    public String getNguoiSua() {
        return nguoiSua;
    }

    public void setNguoiSua(String nguoiSua) {
        this.nguoiSua = nguoiSua;
    }
}
