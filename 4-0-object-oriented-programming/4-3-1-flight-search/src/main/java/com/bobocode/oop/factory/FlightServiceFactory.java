package com.bobocode.oop.factory;

import com.bobocode.oop.service.FlightService;

/**
 * {@link FlightServiceFactory} is used to create an instance of {@link FlightService}
 * <p>
 * todo: 1. Implement method {@link FlightServiceFactory#creteFlightService()}
 */
public class FlightServiceFactory {

  FlightService service;

  /**
   * Create a new instance of {@link FlightService}
   *
   * @return FlightService
   */
  public FlightService creteFlightService() {
    if (service == null) {
      service = new FlightService();
    }
    return service;
  }
}
