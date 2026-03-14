package pl.wsb.fitnesstracker.healthmetrics;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "healthMetrics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class HealthMetrics {
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "user_id", nullable = false)
    private Integer user_id;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "weight", nullable = false)
    private Integer weight;

    @Column(name = "height", nullable = false)
    private Integer height;

    @Column(name = "heartRate", nullable = false)
    private Integer heartRate;

    public HealthMetrics(
            final Integer id,
            final Integer user_id,
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
