package com.liyang.mapper;

import com.liyang.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;


@Repository
public interface UserMapper {
    User sel(int userID);
    User login(@Param("loginName") String loginName, @Param("passWord") String passWord);
    void loginTime(@Param("loginName") String loginName, @Param("lastLoginTime") Date lastLoginTime);
    User isRepeat(String loginName);
    int register(User user);
    int changePSW(@Param("userID") int userID, @Param("lastPassWord") String lastPassWord, @Param("newPassWord") String newPassWord);
    int changeInfo(User user);
    User getInfo(int userID);
    List<User> getList(@Param("start") int start, @Param("num") int num);

}
