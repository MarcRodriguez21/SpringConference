package io.bcn.springConference.repository;

import io.bcn.springConference.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ConferenceRepository extends JpaRepository<Conference, UUID> {
}
