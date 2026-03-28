package pl.wsb.fitnesstracker.healthmetrics;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.user.api.User;

import java.time.LocalDate;

@Entity
@Table(name = "healthMetrics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class HealthMetrics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "weight", nullable = false)
    private Integer weight;

    @Column(name = "height", nullable = false)
    private Integer height;

    @Column(name = "heartRate", nullable = false)
    private Integer heartRate;

    public HealthMetrics(
            final Long id,
            final User user_id,
            final LocalDate date,
            final Integer height,
            final Integer weight,
            final Integer heartRate) {

        this.id = id;
        this.user_id = user_id;
        this.date = date;
        this.height = height;
        this.weight = weight;
        this.heartRate = heartRate;
    }
}
