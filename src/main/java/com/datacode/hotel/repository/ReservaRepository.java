package com.datacode.hotel.repository;

import com.datacode.hotel.model.Huesped;
import com.datacode.hotel.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva,Long> {
}
