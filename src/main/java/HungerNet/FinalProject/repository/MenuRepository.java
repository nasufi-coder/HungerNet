package HungerNet.FinalProject.repository;

import HungerNet.FinalProject.model.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Integer> {

    @Transactional
    @Query("Select restaurant.menus from Restaurant restaurant where restaurant.id=?1")
    List<Menu> findMenusByRestaurantId(Integer id);

}
