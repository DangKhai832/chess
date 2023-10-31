package b20dccn364.QuanLiThuVienLibman.Service;

import b20dccn364.QuanLiThuVienLibman.DTO.ReaderCardLibraryDTO;
import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.PostMapping;

public interface ManageLibraryService {
    @PostMapping("/creatAcc")
    
    Response creatAucount (ReaderCardLibraryDTO obj);
}
