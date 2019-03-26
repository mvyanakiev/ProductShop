package org.softuni.productshop.service;

import org.softuni.productshop.domain.models.serviceModels.UserServiceModel;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    UserServiceModel registerUser(UserServiceModel userServiceModel);
}
