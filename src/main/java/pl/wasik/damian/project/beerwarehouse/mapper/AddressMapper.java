package pl.wasik.damian.project.beerwarehouse.mapper;

import org.springframework.stereotype.Component;
import pl.wasik.damian.project.beerwarehouse.repository.entity.AddressEntity;
import pl.wasik.damian.project.beerwarehouse.web.model.AddressDto;

import java.util.logging.Logger;

@Component
public class AddressMapper {

    private static final Logger LOGGER = Logger.getLogger(AddressEntity.class.getName());

    public AddressEntity mapToEntity(AddressDto addressDTO) {
        LOGGER.info("mapToEntity(" + addressDTO + ")");
        if (addressDTO == null) {
            return null;
        }
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setId(addressDTO.getId());
        addressEntity.setStreet(addressDTO.getStreet());
        addressEntity.setCity(addressDTO.getCity());
        addressEntity.setPostalCode(addressDTO.getPostalCode());
        addressEntity.setHouseNumber(addressDTO.getHouseNumber());
        addressEntity.setUserEntity(addressDTO.getUserEntity());
        LOGGER.info("mapToEntity(...)" + addressEntity);
        return addressEntity;
    }

    public AddressDto mapToDto(AddressEntity addressEntity) {
        LOGGER.info("mapToDto(" + addressEntity + ")");
        if (addressEntity == null) {
            return null;
        }
        AddressDto addressDTO = new AddressDto();
        addressDTO.setId(addressEntity.getId());
        addressDTO.setStreet(addressEntity.getStreet());
        addressDTO.setCity(addressEntity.getCity());
        addressDTO.setPostalCode(addressEntity.getPostalCode());
        addressDTO.setHouseNumber(addressEntity.getHouseNumber());
        addressDTO.setUserEntity(addressEntity.getUserEntity());
        LOGGER.info("mapToDto(...)" + addressDTO);
        return addressDTO;
    }

    public AddressEntity updateAndMapEntityWithDto(AddressDto addressDTO, AddressEntity addressEntity) {
        LOGGER.info("updateAndMapEntityWithDto(" + addressDTO + ", " + addressEntity + ")");
        if (addressDTO == null || addressEntity == null) {
            return null;
        }
        addressEntity.setId(addressDTO.getId());
        addressEntity.setStreet(addressDTO.getStreet());
        addressEntity.setCity(addressDTO.getCity());
        addressEntity.setPostalCode(addressDTO.getPostalCode());
        addressEntity.setHouseNumber(addressDTO.getHouseNumber());
        addressEntity.setUserEntity(addressDTO.getUserEntity());
        LOGGER.info("updateAndMapEntityWithDto(...)" + addressEntity);
        return addressEntity;
    }
}
