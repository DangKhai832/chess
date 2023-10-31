package b20dccn364.QuanLiThuVienLibman.BO;

import jakarta.persistence.*;

import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "sample_contact")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "SampleContact.findAll", query = "SELECT s FROM SampleContact s")})
public class ReaderCardLibraryBO {

    @Id
    @Column ( name = "")
    private
}
