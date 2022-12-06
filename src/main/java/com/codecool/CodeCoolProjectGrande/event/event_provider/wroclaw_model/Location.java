package com.codecool.CodeCoolProjectGrande.event.event_provider.wroclaw_model;

import java.io.Serializable;
import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.NoArgsConstructor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Data
    @NoArgsConstructor
    public class Location implements Serializable
    {
        @Id
        private UUID locationId = UUID.randomUUID();
        @JsonProperty("lattiude")
        public Double lattiude;
        @JsonProperty("longitude")
        public Double longitude;
        @JsonProperty("defined")
        public Boolean defined;

    }