package com.keven.testejavajr.mapper;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.keven.testejavajr.domain.Contatos;
import com.keven.testejavajr.dto.DContatos;

@Mapper(componentModel = "spring" , injectionStrategy = InjectionStrategy.CONSTRUCTOR ,
uses = TelefoneMapper.class)
public interface ContatosMapper {

	Contatos dContatoToContato(DContatos contatos);
	
	DContatos entityToDto(Contatos contato);
	
	default List<DContatos> listContatoToDListContato(List<Contatos> contatos){
        if(contatos == null)
            return Collections.emptyList();

        return contatos.stream().map(this::entityToDto).collect(Collectors.toList());
    }
}
