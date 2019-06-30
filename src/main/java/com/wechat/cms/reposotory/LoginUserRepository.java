package com.wechat.cms.reposotory;

import com.wechat.cms.entity.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 71768
 * @Title: PersonRepository
 * @ProjectName itchat4j
 * @Description: TODO
 * @date 2019/6/2617:27
 */
@Repository
public interface LoginUserRepository extends JpaRepository<LoginUser,Long>, JpaSpecificationExecutor<LoginUser> {
//    @Query(value = "select m from LoginUser m where m.userName=?1")
//    LoginUser findByUserName(@Param("username") String username);

    @Query(value = "select m from LoginUser m where m.userName=?1")
    LoginUser findByUserName(@Param(value = "user_name") String username);





}
