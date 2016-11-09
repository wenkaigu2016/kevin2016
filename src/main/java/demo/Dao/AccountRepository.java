package demo.Dao;

import demo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/11/8.
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findById(Integer id);
}
