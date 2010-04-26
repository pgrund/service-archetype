#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.db.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author pgrund
 */
@Entity
@Table(name = "auftragmatrix")
public class ArticleDTO {

    private long articleId;
    private long articleGroupId;
    private long articleNumber;
    private long featureNumber;
    private long quantity;
    private long bzId;
    private Long extContractPos;
    private long contractId;


    public ArticleDTO() {
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ArticleDTO)) {
            return false;
        }
        return articleId == ((ArticleDTO) o).getArticleId();
    }

    @Id
    @Column(name = "artikel_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    @Column(name = "artikelgruppe_id")
    public long getArticleGroupId() {
        return articleGroupId;
    }

    public void setArticleGroupId(long articleGroupId) {
        this.articleGroupId = articleGroupId;
    }

    @Column(name = "bz_id")
    public long getBzId() {
        return bzId;
    }

    public void setBzId(long bzId) {
        this.bzId = bzId;
    }

    @Column(name = "techauftrag_id", nullable = false)
    public long getContractId() {
        return contractId;
    }

    public void setContractId(long contractId) {
        this.contractId = contractId;
    }

    @Column(name = "artikelnummer", nullable = false)
    public long getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(long articleNumber) {
        this.articleNumber = articleNumber;
    }

    @Column(name = "featurenummer", nullable = false)
    public long getFeatureNumber() {
        return featureNumber;
    }

    public void setFeatureNumber(long featureNumber) {
        this.featureNumber = featureNumber;
    }

    @Column(name = "quantitaet", nullable = false)
    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Column(name = "ext_vertragpos", nullable = true)
    public Long getExtContractPos() {
        return extContractPos;
    }

    public void setExtContractPos(Long extContractPos) {
        this.extContractPos = extContractPos;
    }

    @Transient
    public String getSignature() {
        return articleGroupId + "_" + articleNumber + "_" + featureNumber + "_"
                + quantity;
    }

}
