package com.konex.loteria_backend.mapper;

import com.konex.loteria_backend.dto.ClienteDTO;
import com.konex.loteria_backend.dto.SorteoDTO;
import com.konex.loteria_backend.model.Cliente;
import com.konex.loteria_backend.model.Sorteo;
import org.springframework.stereotype.Component;

import java.util.List;

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

    public List<ClienteDTO> convertirClientesAClientesDTO(List<Cliente> clientes) {
        return clientes.stream().map(this::convertirClienteAClienteDTO).toList();
    }
}
