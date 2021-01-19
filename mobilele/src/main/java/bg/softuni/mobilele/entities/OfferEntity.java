package bg.softuni.mobilele.entities;


import bg.softuni.mobilele.entities.enums.EngineEnum;
import bg.softuni.mobilele.entities.enums.TransmissionEnum;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.ui.Model;

@Entity
@Table(name="offers")
public class OfferEntity extends BaseEntity {

  @Enumerated(EnumType.STRING)
  private EngineEnum engine;
  private String imageUrl;
  private int mileage;
  private int price;
  private int year;
  @Enumerated(EnumType.STRING)
  private TransmissionEnum transmission;
  @ManyToOne
  private ModelEntity model;

  // TODO - seller

  public EngineEnum getEngine() {
    return engine;
  }

  public OfferEntity setEngine(EngineEnum engine) {
    this.engine = engine;
    return this;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public OfferEntity setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  public int getMileage() {
    return mileage;
  }

  public OfferEntity setMileage(int mileage) {
    this.mileage = mileage;
    return this;
  }

  public int getPrice() {
    return price;
  }

  public OfferEntity setPrice(int price) {
    this.price = price;
    return this;
  }

  public int getYear() {
    return year;
  }

  public OfferEntity setYear(int year) {
    this.year = year;
    return this;
  }

  public TransmissionEnum getTransmission() {
    return transmission;
  }

  public OfferEntity setTransmission(
      TransmissionEnum transmission) {
    this.transmission = transmission;
    return this;
  }

  public ModelEntity getModel() {
    return model;
  }

  public OfferEntity setModel(ModelEntity model) {
    this.model = model;
    return this;
  }

  @Override
  public String toString() {
    return "OfferEntity{" +
        "engine=" + engine +
        ", imageUrl='" + imageUrl + '\'' +
        ", mileage=" + mileage +
        ", price=" + price +
        ", year=" + year +
        ", transmission=" + transmission +
        ", model=" + model +
        ", id=" + id +
        ", created=" + created +
        ", updated=" + updated +
        '}';
  }
}
