package com.example.demo.mapper;

import com.example.demo.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;


/**
*UserMapper
* @author Shein Generator
* @since 2020/09/23
*/

@Mapper
public interface UserMapper {

    UserBean getInfo(String name,String password);

}