package moum.project.vo;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Collection implements Serializable {

  private static final long serialVersionUID = 1L;

  private int no;
  private int userNo;
  private int subCategoryNo;
  private String name;
  private int statusNo;
  private java.sql.Date purchaseDate;
  private String purchasePlace;
  private int price;
  private String storageLocation;
  private java.util.Date postDate;

  public Collection() {
  }

  public Collection(int no) {
    this.no = no;
  }

  @Override
  public String
  toString() {
    return "Collection{" +
            "collectionId=" + no +
            ", userId=" + userNo +
            ", subCategoryId=" + subCategoryNo +
            ", name='" + name + '\'' +
            ", statusId=" + statusNo +
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
    return no == that.no;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(no);
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public int getUserNo() {
    return userNo;
  }

  public void setUserNo(int userNo) {
    this.userNo = userNo;
  }

  public int getSubCategoryNo() {
    return subCategoryNo;
  }

  public void setSubCategoryNo(int subCategoryNo) {
    this.subCategoryNo = subCategoryNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStatusNo() {
    return statusNo;
  }

  public void setStatusNo(int statusNo) {
    this.statusNo = statusNo;
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

  public java.util.Date getPostDate() {
    return postDate;
  }

  public void setPostDate(Date postDate) {
    this.postDate = postDate;
  }
}
