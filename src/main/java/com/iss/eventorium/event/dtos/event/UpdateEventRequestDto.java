package com.iss.eventorium.event.dtos.event;

import com.iss.eventorium.event.dtos.eventtype.EventTypeResponseDto;
import com.iss.eventorium.shared.dtos.CityDto;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateEventRequestDto {

    @NotNull(message = "Event name is required")
    @NotBlank(message = "Event name cannot be blank")
    private String name;

    @NotNull(message = "Event description is required")
    @NotBlank(message = "Event description cannot be blank")
    private String description;

    @NotNull(message = "Event date is required")
    @FutureOrPresent(message = "Event date must not be in the past")
    private LocalDate date;

    @NotNull(message = "Max participants field is required")
    @Positive(message = "Max participants must be a positive number greater than zero")
    private Integer maxParticipants;

    private EventTypeResponseDto eventType;

    @NotNull(message = "City field is required")
    private CityDto city;

    @NotNull(message = "Address field is required")
    @NotBlank(message = "Address field cannot be blank")
    private String address;
}
