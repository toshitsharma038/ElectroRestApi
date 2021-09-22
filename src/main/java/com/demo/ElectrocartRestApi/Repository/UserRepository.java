package com.demo.ElectrocartRestApi.Repository;

import com.demo.ElectrocartRestApi.Beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>
{
    @Query(value = "select * from customer where email=:email and password=:password",nativeQuery = true)
    User validate(String email, String password);
}
