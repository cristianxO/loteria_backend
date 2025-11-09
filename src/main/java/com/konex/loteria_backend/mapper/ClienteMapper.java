package com.konex.loteria_backend.mapper;

import com.konex.loteria_backend.dto.ClienteDTO;
import com.konex.loteria_backend.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    private final BilleteMapper billeteMapper;

    public ClienteMapper(BilleteMapper billeteMapper) {
        this.billeteMapper = billeteMapper;
    }

    public ClienteDTO convertirClienteAClienteDTO(Cliente cliente) {
        return new ClienteDTO(cliente.getId(),
                            cliente.getNombre(),
                            cliente.getCorreo(),
                            billeteMapper.convertirBilletesABilletesDTO(cliente.getBilletes()));
    }
}
