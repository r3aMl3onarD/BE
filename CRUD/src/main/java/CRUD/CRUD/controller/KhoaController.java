package CRUD.CRUD.controller;

import CRUD.CRUD.entity.Khoa;
import CRUD.CRUD.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/khoa")
public class KhoaController {

    @Autowired
    private KhoaService service;

    @PostMapping("/add")
    public Khoa addKhoa(@RequestBody Khoa khoa) {
        return service.saveKhoa(khoa);
    }

    @PostMapping("/addAll")
    public List<Khoa> addKhoas(@RequestBody List<Khoa> khoas) {
        return service.saveKhoas(khoas);
    }

    @GetMapping("/all")
    public List<Khoa> findAllKhoas() {
        return service.getKhoas();
    }

    @GetMapping("/{maKhoa}")
    public Khoa findKhoaById(@PathVariable String maKhoa) {
        return service.getKhoaById(maKhoa);
    }

    @PutMapping("/update")
    public Khoa updateKhoa(@RequestBody Khoa khoa) {
        return service.updateKhoa(khoa);
    }

    @DeleteMapping("/delete/{maKhoa}")
    public String deleteKhoa(@PathVariable String maKhoa) {
        return service.deleteKhoa(maKhoa);
    }
}
