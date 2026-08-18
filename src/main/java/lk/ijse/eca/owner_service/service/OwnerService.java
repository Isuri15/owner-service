package lk.ijse.eca.owner_service.service;

import lk.ijse.eca.owner_service.model.Owner;
import lk.ijse.eca.owner_service.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    public Owner getOwnerById(Long id) {
        return ownerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Owner not found with id: " + id));
    }

    public Owner createOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    public Owner updateOwner(Long id, Owner ownerDetails) {
        Owner owner = getOwnerById(id);
        owner.setFirstName(ownerDetails.getFirstName());
        owner.setLastName(ownerDetails.getLastName());
        owner.setEmail(ownerDetails.getEmail());
        owner.setPhoneNumber(ownerDetails.getPhoneNumber());
        owner.setAddress(ownerDetails.getAddress());
        return ownerRepository.save(owner);
    }

    public void deleteOwner(Long id) {
        ownerRepository.deleteById(id);
    }
}