package io.bcn.springConference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.bcn.springConference.model.Speaker;
import java.util.UUID;

public interface SpeakerRepository extends JpaRepository<Speaker, UUID> {
}
