package bg.softuni.mobilele.entities;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected Long id;

  @Column(nullable = false)
  protected Instant created;

  @Column(nullable = false)
  protected Instant updated;

  public Long getId() {
    return id;
  }

  public BaseEntity setId(Long id) {
    this.id = id;
    return this;
  }

  public Instant getCreated() {
    return created;
  }

  public BaseEntity setCreated(Instant created) {
    this.created = created;
    return this;
  }

  public Instant getUpdated() {
    return updated;
  }

  public BaseEntity setUpdated(Instant updated) {
    this.updated = updated;
    return this;
  }

  @Override
  public String toString() {
    return "BaseEntity{" +
        "id=" + id +
        ", created=" + created +
        ", updated=" + updated +
        '}';
  }
}
