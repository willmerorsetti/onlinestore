package academy.digitallab.store.product.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tbl_categiries")
@Data //@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
