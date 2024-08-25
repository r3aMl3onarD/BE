package CRUD.CRUD.service;

import CRUD.CRUD.entity.Khoa;
import CRUD.CRUD.repository.KhoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhoaService {

    @Autowired
    private KhoaRepository repository;

    public Khoa saveKhoa(Khoa khoa) {
        return repository.save(khoa);
    }

    public List<Khoa> saveKhoas(List<Khoa> khoas) {
        return repository.saveAll(khoas);
    }

    public List<Khoa> getKhoas() {
        return repository.findAll();
    }

    public Khoa getKhoaById(String maKhoa) {
        return repository.findById(maKhoa).orElse(null);
    }

    public String deleteKhoa(String maKhoa) {
        repository.deleteById(maKhoa);
        return "Khoa removed !! " + maKhoa;
    }

    public Khoa updateKhoa(Khoa khoa) {
        Khoa existingKhoa = repository.findById(khoa.getMaKhoa()).orElse(null);
        if (existingKhoa != null) {
            existingKhoa.setTenKhoa(khoa.getTenKhoa());
            existingKhoa.setNamThanhLap(khoa.getNamThanhLap());
            existingKhoa.setMaID(khoa.getMaID());
            existingKhoa.setNgayNhap(khoa.getNgayNhap());
            existingKhoa.setNgaySua(khoa.getNgaySua());
            existingKhoa.setNguoiSua(khoa.getNguoiSua());
            return repository.save(existingKhoa);
        }
        return null;
    }
}
