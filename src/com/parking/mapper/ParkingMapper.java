package com.parking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.parking.pojo.Parking;
import com.parking.pojo.User;

public interface ParkingMapper {

	
//	查询所有进行中订单
	@Select("select * from parking where is_delete = 0")
	List<Parking> selAllParking();
	
//	查询用户进行中订单
	@Select("select * from parking where is_delete = 0 and username = #{username}")
	List<Parking> selParkingByUser(String username);
	
//	查询用户已结束订单
	@Select("select * from parking where is_delete = 0 and username = #{username}")
	List<Parking> selEndParkingByUser(String username);
	
//	创建订单
	@Insert("insert into parking values(username = #{username},carnum = #{carnum"
			+ "},begintime = #{begintime})")
	int insParking(Parking parking);
	
//	修改订单
	int updParkingByOption(Parking parking);
	
	
	
	
	
}
