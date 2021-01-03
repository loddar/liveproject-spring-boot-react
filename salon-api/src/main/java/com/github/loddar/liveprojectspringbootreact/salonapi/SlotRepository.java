package com.github.loddar.liveprojectspringbootreact.salonapi;

import com.github.loddar.liveprojectspringbootreact.salonapi.entities.Slot;
import org.springframework.data.repository.CrudRepository;

public interface SlotRepository extends CrudRepository<Slot, Long> {
}
