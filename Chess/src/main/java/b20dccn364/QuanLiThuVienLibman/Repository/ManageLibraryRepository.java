package b20dccn364.QuanLiThuVienLibman.Repository;

import b20dccn364.QuanLiThuVienLibman.BO.ReaderCardLibraryBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManageLibraryRepository extends JpaRepository<ReaderCardLibraryBO,Long> {

}
