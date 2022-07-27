package HungerNet.FinalProject.service;

import HungerNet.FinalProject.model.dto.UserDTO;
import HungerNet.FinalProject.model.entity.User;
import HungerNet.FinalProject.model.entity.UserDetails;
import HungerNet.FinalProject.repository.UserDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserDetailsService {

    void saveUser(UserDetails user);

}
