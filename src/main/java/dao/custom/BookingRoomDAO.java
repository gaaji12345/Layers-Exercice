package dao.custom;

import dao.CrudDAO;
import dto.BookingRoomDTO;
import dto.RoomDetailsDTO;
import entity.BookingRoom;
import tm.BookingRoomTM;

import java.sql.SQLException;
import java.util.ArrayList;

public interface BookingRoomDAO extends CrudDAO<BookingRoom,String> {

    //Transaction
  //  public boolean saveBooking(BookingRoom bookingRoomDTO) throws SQLException ;

    public boolean delete(String roomId, String cusId) throws SQLException, ClassNotFoundException ;


}
