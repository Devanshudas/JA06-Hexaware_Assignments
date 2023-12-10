package com.hexaware.restcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.restcrud.entities.UserPolicy;
@Repository
public interface UserPolicyRepository extends JpaRepository<UserPolicy, Long> 
{

}
