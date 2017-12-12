package br.jus.tjrj.gabineteweb.instancia1.resource;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import br.jus.tjrj.gabineteweb.core.model.dto.PessoaDTO;
import br.jus.tjrj.gabineteweb.core.resource.AbstractResource;
import br.jus.tjrj.gabineteweb.instancia1.service.PessoaService;
import interceptor.Intercept;

@Path("/pessoas")
public class PessoaResource extends AbstractResource<PessoaDTO> {
	
	@Inject
	private PessoaService pessoaService;
	
	@POST
	@Intercept(time = 5)
	public void salvar(PessoaDTO pessoaDTO) {
		this.pessoaService.salvar(pessoaDTO);
	}
}
