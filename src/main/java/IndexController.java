

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.dao.UsuarioDao;
import br.com.model.Usuario;

@Controller
public class IndexController {

	private final Result result;
	
	@Inject
	private UsuarioDao dao; 

	/**
	 * @deprecated CDI eyes only
	 */
	protected IndexController() {
		this(null);
	}
	
	@Inject
	public IndexController(Result result) {
		this.result = result;
	}

	@Path("/")
	public void index() {
		Usuario usu = new Usuario();
		usu.setLogin("cebatista");
		usu.setSenha("123456");
		
		//dao.salvaUsuario(usu);
		
		result.include("variable", "VRaptor!");
	}
}