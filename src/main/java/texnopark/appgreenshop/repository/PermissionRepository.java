package texnopark.appgreenshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import texnopark.appgreenshop.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
