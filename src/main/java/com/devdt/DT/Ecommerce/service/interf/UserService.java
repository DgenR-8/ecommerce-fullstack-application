package com.devdt.DT.Ecommerce.service.interf;

import com.devdt.DT.Ecommerce.dto.LoginRequest;
import com.devdt.DT.Ecommerce.dto.Response;
import com.devdt.DT.Ecommerce.dto.UserDto;
import com.devdt.DT.Ecommerce.entity.User;

public interface UserService {

    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
