#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.v01.types;

/**
 *
 * .
 */
public class Type {

    private long id;
    private long articleGroup;
    private long articleNumber;
    private long featureNumber;
    private long quantity;
    private boolean paid;

    public Type() {
    }


    public long getId() {
        return id;
    }

    public void setId(long articleId) {
        this.id = articleId;
    }

    public long getArticleGroup() {
        return articleGroup;
    }

    public void setArticleGroup(long articleGroupId) {
        this.articleGroup = articleGroupId;
    }

    public long getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(long articleNumber) {
        this.articleNumber = articleNumber;
    }

    public long getFeatureNumber() {
        return featureNumber;
    }

    public void setFeatureNumber(long featureNumber) {
        this.featureNumber = featureNumber;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
