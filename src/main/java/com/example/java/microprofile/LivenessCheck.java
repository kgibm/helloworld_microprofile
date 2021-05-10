package com.example.java.microprofile;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

@Liveness
@ApplicationScoped
public class LivenessCheck implements HealthCheck {
	@Override
	public HealthCheckResponse call() {
		boolean up = true;
		return HealthCheckResponse.named(this.getClass().getCanonicalName()).status(up).build();
	}
}
