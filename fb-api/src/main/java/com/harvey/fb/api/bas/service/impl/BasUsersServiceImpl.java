package com.harvey.fb.api.bas.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.harvey.common.core.config.Config;
import com.harvey.common.core.model.UserBaseModel;
import com.harvey.common.core.service.UserBaseService;
import com.harvey.common.core.service.impl.BaseServiceImpl;
import com.harvey.fb.api.bas.entity.UserSessionEntity;
import com.harvey.fb.api.bas.model.BasUsersModel;
import com.harvey.fb.api.bas.service.BasUsersService;

@Service
public class BasUsersServiceImpl extends BaseServiceImpl implements BasUsersService, UserBaseService {

    @Resource(name = "web.userPasswordEncoder")
    private PasswordEncoder passwordEncoder;

    

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserSessionEntity example = new UserSessionEntity();
      //TODO AD 验证//ADusername
        String runEnv=Config.get("sys.runEnv");
        List<UserSessionEntity> result = new ArrayList<>();
        if("dev".equals(runEnv)){
	        result = this.dao.findByExample(example);
        }else{
        	StringBuilder condition = new StringBuilder("(lower(domain_user_name) = ? )");
        	result = this.dao.findBySqlCondition(UserSessionEntity.class, condition.toString(), new Object[] { username.toLowerCase() });
        }
        if (result.isEmpty()) {
            throw new UsernameNotFoundException("User Not Found");
        }
        UserSessionEntity sessionEntity =  (UserSessionEntity)result.get(0);

        return sessionEntity;
    }

    @Override
    public void authenticate(UserBaseModel user, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        UserSessionEntity entity = (UserSessionEntity) user;
//        String presentedPassword = authentication.getCredentials().toString();
        /*
         * if (!passwordEncoder.matches(presentedPassword, user.getPassword()))
         * { throw new BadCredentialsException("The password is invalid"); }
         */
        
        // TODO 初始化用户的权限信息
//        List<BasUsersRolesModel> userRoles = this.basUsersRolesService.getUserRoles(entity.getUsersId());
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//        for (BasUsersRolesModel userRole : userRoles) {
//            RoleGrantedAuthority authoritie = new RoleGrantedAuthority(userRole.getRoleId());
//            authorities.add(authoritie);
//        }
        entity.setAuthorities(authorities);
        
    }

    public List<BasUsersModel> saveAll(Collection<BasUsersModel> models) {
        return (List<BasUsersModel>) this.dao.saveAll(models);
    }


    @Override
    public List<BasUsersModel> query() {
        return this.dao.getAll(BasUsersModel.class);
    }

    @Override
    public BasUsersModel save(BasUsersModel model) {
        return this.dao.save(model);
    }

    @Override
    public void removeAll(Collection<BasUsersModel> models) {
        this.dao.removeAll(models);
    }





    @Override
    public BasUsersModel findById(String userId) {
        BasUsersModel example = new BasUsersModel();
        example.setUsersId(userId);
        List<BasUsersModel> list = this.dao.findByExample(example);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }


    @Override
    public void removeAllByPk(Collection<? extends Serializable> ids) {
        this.dao.removeAllByPk(BasUsersModel.class, ids);
    }


	@Override
	public List<BasUsersModel> findByExample(BasUsersModel example) {
		return this.dao.findByExample(example);
	}
}