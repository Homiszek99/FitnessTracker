package pl.wsb.fitnesstracker.workoutsession;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.training.api.Training;

import java.util.Date;

@Entity
@Table(name = "workoutsession")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class WorkoutSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;
    private java.time.LocalDateTime timestamp;


    @ManyToOne
    @JoinColumn(name = "training_id", nullable = false)
    private Training training;

    @Column(name = "startLatitude", nullable = false)
    private Date startLatitude;

    @Column(name = "startLongitude", nullable = false)
    private Date startLongitude;

    @Column(name = "endLatitudee", nullable = false)
    private Date endLatitude;

    @Column(name = "endLongitude", nullable = false)
    private Date endLongitude;

    @Column(name = "altitude", nullable = false)
    private int altitude;

    public WorkoutSession(
            final Date startLatitude,
            final Date startLongtitude,
            final Date endLatitude,
            final Date endLongitude,
            final int altitude) {
        this.startLatitude = startLatitude;
        this.startLongitude = startLongtitude;
        this.endLatitude = endLatitude;
        this.endLongitude = endLongitude;
        this.altitude = altitude;
    }
}
