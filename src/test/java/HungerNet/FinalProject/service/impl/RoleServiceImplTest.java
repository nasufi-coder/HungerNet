package HungerNet.FinalProject.service.impl;

import HungerNet.FinalProject.model.entity.Role;
import HungerNet.FinalProject.repository.RoleRepository;
import HungerNet.FinalProject.service.RoleService;
import org.hibernate.sql.Template;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.text.html.Option;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
class RoleServiceImplTest {


  @MockBean
  private RoleRepository roleRepository;

  @InjectMocks
  private RoleServiceImpl roleService;



    @Test
    public void whenFindByID_thenReturnRole() {


        Optional<Role> role=roleRepository.findById(1);
        assertTrue(role.isPresent());

    }


}