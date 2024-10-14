package moum.project.vo;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

public class Collection implements Serializable {

  private static final long serialVersionUID = 1L;

  private int collectionId;
  private int userId;
  private int subCategoryId;
  private String name;
  private int statusId;
  private java.sql.Date purchaseDate;
  private String purchasePlace;
  private int price;
  private String storageLocation;
  private java.sql.Date postDate;

  public Collection() {
  }

  public Collection(int collectionId) {
    this.collectionId = collectionId;
  }

  @Override
  public String
  toString() {
    return "Collection{" +
            "collectionId=" + collectionId +
            ", userId=" + userId +
            ", subCategoryId=" + subCategoryId +
            ", name='" + name + '\'' +
            ", statusId=" + statusId +
            ", purchaseDate=" + purchaseDate +
            ", purchasePlace='" + purchasePlace + '\'' +
            ", price=" + price +
            ", storageLocation='" + storageLocation + '\'' +
            ", postDate=" + postDate +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Collection that = (Collection) o;
    return collectionId == that.collectionId;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(collectionId);
  }

  public int getCollectionId() {
    return collectionId;
  }

  public void setCollectionId(int collectionId) {
    this.collectionId = collectionId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getSubCategoryId() {
    return subCategoryId;
  }

  public void setSubCategoryId(int subCategoryId) {
    this.subCategoryId = subCategoryId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStatusId() {
    return statusId;
  }

  public void setStatusId(int statusId) {
    this.statusId = statusId;
  }

  public Date getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(Date purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

  public String getPurchasePlace() {
    return purchasePlace;
  }

  public void setPurchasePlace(String purchasePlace) {
    this.purchasePlace = purchasePlace;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public void setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
  }

  public Date getPostDate() {
    return postDate;
  }

  public void setPostDate(Date postDate) {
    this.postDate = postDate;
  }
}
