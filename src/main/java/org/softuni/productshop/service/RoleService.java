package org.softuni.productshop.service;

import org.softuni.productshop.domain.models.serviceModels.RoleServiceModel;
import org.softuni.productshop.domain.models.serviceModels.UserServiceModel;

import java.util.Set;

public interface RoleService {

    void seedRolesInDb();

//    void assignUserRole(UserServiceModel userServiceModel, long numberOfUsers);

    Set<RoleServiceModel> findAllRoles();

    RoleServiceModel findByAuthority(String authority);
}
