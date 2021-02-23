package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vn.codegym.model.Role;
import vn.codegym.model.User;
import vn.codegym.model.UserRole;
import vn.codegym.repository.RoleRepository;
import vn.codegym.repository.UserRepository;
import vn.codegym.repository.UserRoleRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserRoleRepository userRoleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        if (user == null){
            System.out.println("User not found ! " + username);
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
        System.out.println("Found user : " + user);

        // [ROLE_USER, ROLE_ADMIN,..]
        List<UserRole> userRoles = userRoleRepository.findByUser(user);

        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        if (userRoles != null){
            for (UserRole userRole : userRoles){
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(userRole.getRole().getRoleName());
            }
        }
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUserName(),
                user.getPassword(), grantedAuthorityList);

        return userDetails;
    }
    public List<Role> allRoles(){
        return roleRepository.findAll();
    }
    public List<User> allUsers(){
        return userRepository.findAll();
    }
    public void saveNewUser(User user){
        userRepository.save(user);
    }
    public void saveUserRole(User user,Long id){
        userRoleRepository.save(new UserRole(user, this.roleRepository.findById(id).orElse(null)));
    }
}
