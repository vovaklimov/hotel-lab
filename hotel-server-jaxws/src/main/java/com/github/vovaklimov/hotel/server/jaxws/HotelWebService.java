package com.github.vovaklimov.hotel.server.jaxws;

import com.github.vovaklimov.hotel.core.HotelService;
import com.github.vovaklimov.hotel.core.entities.Booking;
import com.github.vovaklimov.hotel.core.entities.Client;
import com.github.vovaklimov.hotel.core.entities.Room;
import com.github.vovaklimov.hotel.core.values.TimeRange;
import com.github.vovaklimov.hotel.server.jaxws.dto.CreateBookingDTO;
import com.github.vovaklimov.hotel.server.jaxws.dto.CreateClientDTO;
import com.github.vovaklimov.hotel.server.jaxws.dto.CreateRoomDTO;
import jakarta.jws.WebService;

import java.time.LocalDateTime;
import java.util.List;

@WebService
public class HotelWebService {
    private final HotelService hotelService = new HotelService();

    public Client createClient(CreateClientDTO createClientDto) {
        var address = createClientDto.getAddress();
        var contacts = createClientDto.getContacts();
        return hotelService.createClient(createClientDto.getName(), address, contacts);
    }

    public Room createRoom(CreateRoomDTO dto) {
        return hotelService.createRoom(
                dto.getPrice(),
                dto.getNumber(),
                dto.getSleeps(),
                dto.getDescription(),
                dto.getSquare()
        );
    }

    public List<Room> getRooms() {
        return hotelService.getRooms();
    }

    public List<Booking> getBookings() {
        return hotelService.getBookings();
    }

    public Booking createBooking(CreateBookingDTO dto) {
        var timeRange = TimeRange.between(dto.getToDate(), dto.getToDate());
        return hotelService.createBooking(dto.getClientId(), dto.getRoomId(), timeRange);
    }
}
