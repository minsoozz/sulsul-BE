package com.depromeet.sulsul.domain.recordsFlavor.dto;

import com.depromeet.sulsul.domain.flavor.entity.Flavor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RecordsFlavorRequest {
    private Long beerId;
    private List<Flavor> flavors = new ArrayList<>();
}
