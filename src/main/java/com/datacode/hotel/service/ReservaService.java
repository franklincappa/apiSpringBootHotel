package com.datacode.hotel.service;

import com.datacode.hotel.model.Reserva;
import com.datacode.hotel.repository.HuespedRepository;
import com.datacode.hotel.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    //Mostrar Reserva
    public List<Reserva> getAllReservas(){
        return reservaRepository.findAll();
    }

    //Crear Reserva
    public Reserva createReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    //Editar Reserva
    public Reserva updateReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    //Eliminar Reserva
    public void deleteReservadById(Long id){
        reservaRepository.deleteById(id);
    }
}
