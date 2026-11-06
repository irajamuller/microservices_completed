package com.store.usuario.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.usuario.model.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, UUID> {
	Optional<UserInfo> findByEmail(String email);
}
