package com.datacode.hotel.service;

import com.datacode.hotel.model.Huesped;
import com.datacode.hotel.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuespedService {
    @Autowired
    private HuespedRepository huespedRepository;

    //Mostrar Huesped
    public List<Huesped> getAllHuespedes(){
        return huespedRepository.findAll();
    }

    //Crear Huesped
    public Huesped createHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }

    //Editar Huesped
    public Huesped updateHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }

    //Eliminar huesped
    public void deleteHuespedById(Long id){
        huespedRepository.deleteById(id);
    }
}
