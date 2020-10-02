package just.hazard.datarest.repositories;

import just.hazard.datarest.entity.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {

    List<Account> findByName(String name);
}
