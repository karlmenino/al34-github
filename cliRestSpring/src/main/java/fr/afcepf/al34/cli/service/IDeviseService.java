package fr.afcepf.al34.cli.service;

import java.util.List;

import fr.afcepf.al34.cli.dto.DeviseDto;

public interface IDeviseService {
	    DeviseDto getDeviseByCode(String code);
		List<DeviseDto> getAllDevises();
		DeviseDto postDevise(DeviseDto devise);
		void deleteDevise(String code);
}
