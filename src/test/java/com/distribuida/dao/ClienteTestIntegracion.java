package com.distribuida.dao;

import com.distribuida.model.Cliente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@Transactional
@Rollback(false)
public class ClienteTestIntegracion {

    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    public void testClienteFindAll() {
        List<Cliente> clientes = clienteRepository.findAll();
        clientes.forEach(System.out::println);
    }

    @Test
    public void testClienteFindOne() {
        Optional<Cliente> cliente = clienteRepository.findById(1);
        System.out.println(cliente.orElse(null));
    }

    @Test
    public void testClienteSave() {
        Cliente cliente = new Cliente();
        cliente.setCedula("0000000000");
        cliente.setNombre("Test");
        cliente.setApellido("Test");
        cliente.setDireccion("Test");
        cliente.setTelefono("000000000");
        cliente.setCorreo("test@test.com");

        clienteRepository.save(cliente);

        System.out.println(" Cliente guardado correctamente");
    }

    @Test
    public void testClienteActualizar() {
        Optional<Cliente> clienteOpt = clienteRepository.findById(39);

        if (clienteOpt.isPresent()) {
            Cliente cliente = clienteOpt.get();

            cliente.setCedula("172839456");
            cliente.setNombre("Juan88");
            cliente.setApellido("Taipe88");
            cliente.setDireccion("Taipe88");
            cliente.setTelefono("0936251488");
            cliente.setCorreo("correo888@correo.com");

            clienteRepository.save(cliente);

            System.out.println(" Cliente actualizado");
        } else {
            System.out.println(" Cliente con ID 39 no existe");
        }
    }

    @Test
    public void testClienteBorrar() {
        clienteRepository.deleteById(39);
        System.out.println(" Cliente eliminado");
    }
}
