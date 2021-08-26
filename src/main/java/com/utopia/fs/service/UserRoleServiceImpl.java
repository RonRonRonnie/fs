package com.utopia.fs.service;

import com.utopia.fs.entity.UserRole;
import com.utopia.fs.repository.UserRoleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserRoleServiceImpl implements UserRoleService{
    private final UserRoleRepository userRoleRepository;

    @Override
    public List<UserRole> getAllUserRole() {
        return userRoleRepository.findAll();
    }
}
