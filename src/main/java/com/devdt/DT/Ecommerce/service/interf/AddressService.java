package com.devdt.DT.Ecommerce.service.interf;

import com.devdt.DT.Ecommerce.dto.AddressDto;
import com.devdt.DT.Ecommerce.dto.Response;

public interface AddressService {

    Response saveAndUpdateAddress(AddressDto addressDto);
}
