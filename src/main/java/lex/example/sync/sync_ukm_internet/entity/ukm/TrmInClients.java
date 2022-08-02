package lex.example.sync.sync_ukm_internet.entity.ukm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "trn_in_client")
public class TrmInClients implements Serializable {


    @Column(name ="global_id", nullable = false )
    private long globalId;

    @Id
    @Column(name = "id", nullable = false)
    private String  id;

    @Column(name = "classifclient", nullable = false)
    private Integer classifclient;

    @Column(name = "sur_name", nullable = false)
    private String sur_name;

    @Column(name = "name", nullable = false)
    private String name;
            patronymic
    birthday
            inn
    passport
            pricetype
    type
            allow_paycash
    structure
            active
    save_change
            version
    deleted

}
