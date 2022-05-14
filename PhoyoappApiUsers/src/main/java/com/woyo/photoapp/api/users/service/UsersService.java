package com.woyo.photoapp.api.users.service;

import com.woyo.photoapp.api.users.shared.UserDTO;

public interface UsersService {
    UserDTO createUser(UserDTO userDetails);
}
