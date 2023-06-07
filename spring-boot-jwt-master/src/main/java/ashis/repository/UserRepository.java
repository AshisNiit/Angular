package ashis.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import ashis.model.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Integer> {

  boolean existsByUsername(String username);

  AppUser findByUsername(String username);

  @Transactional
  void deleteByUsername(String username);

}
