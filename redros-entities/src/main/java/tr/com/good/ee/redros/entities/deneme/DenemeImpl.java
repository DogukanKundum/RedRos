package tr.com.good.ee.redros.entities.deneme;

import tr.com.good.ee.redros.interfaces.entity.deneme.IDeneme;

import javax.persistence.*;

/**
 * Created by DOGUKAN on 02.11.2018.
 */
@Entity
@Table(name = "DENEME")
public class DenemeImpl implements IDeneme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ACIKLAMA")
    private String Aciklama;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAciklama() {
        return Aciklama;
    }

    public void setAciklama(String aciklama) {
        Aciklama = aciklama;
    }
}
