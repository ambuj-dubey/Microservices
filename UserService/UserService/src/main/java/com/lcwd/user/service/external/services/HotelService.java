package com.lcwd.user.service.external.services;

import com.lcwd.user.service.entities.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HOTEL-SERVICE")         //Step 3 to create the interface ana this looks like a controller only and this can be directly used to fetch the data
public interface HotelService {
    @GetMapping("/hotels/{hotelId}")
    public Hotel getHotel(@PathVariable String hotelId);
}
