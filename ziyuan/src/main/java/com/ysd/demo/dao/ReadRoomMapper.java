package com.ysd.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ysd.demo.entity.ReadRoom;

@Mapper
public interface ReadRoomMapper {
   List<ReadRoom> selectReadRoom();
}
