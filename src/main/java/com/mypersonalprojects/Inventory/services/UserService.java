package com.mypersonalprojects.Inventory.services;

import com.mypersonalprojects.Inventory.dtos.LoginRequest;
import com.mypersonalprojects.Inventory.dtos.RegisterRequest;
import com.mypersonalprojects.Inventory.dtos.Response;
import com.mypersonalprojects.Inventory.dtos.UserDTO;
import com.mypersonalprojects.Inventory.models.User;

public interface UserService {

    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
