package com.utopia.fs.controller;

import com.utopia.fs.entity.UserRole;
import com.utopia.fs.service.UserRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserRoleController {
    private final UserRoleService userRoleService;
//,produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE,"application/json; charset=utf-8"}
    @RequestMapping(name = "/")
    public ResponseEntity<List<UserRole>> getAllUserRole(){
        List<UserRole> userRole = userRoleService.getAllUserRole();
        if(userRole.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(userRole);
    }

}

