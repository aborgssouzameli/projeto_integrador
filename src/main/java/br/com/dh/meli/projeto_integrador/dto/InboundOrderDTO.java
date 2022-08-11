package br.com.dh.meli.projeto_integrador.dto;

import lombok.*;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InboundOrderDTO {
    @NotNull
    public Integer orderNumber;

    @NotNull
    public LocalDate orderDate;

    @NotEmpty(message = "O campo warehouseCode não pode estar vazio.")
    @Size(min = 2, message = "O campo warehouseCode deve ter no mínimo 2 digitos.")
    public String warehouseCode;

    @NotEmpty(message = "O campo sectionCode não pode estar vazio.")
    @Size(min = 2, message = "O campo sectionCode deve ter no mínimo 2 digitos.")
    public String sectionCode;

    @NotNull
    private Long representantId;

    @NotEmpty(message = "A lista de BatchStock deve ter pelo menos 1 válido.")
    public List<@Valid BatchStockDTO> batchStock;

    //@NotEmpty(message = "A lista de Advertisement deve ter pelo menos 1 válido.")
    //public List<@Valid AdvertisementDTO> advertisement;

}
