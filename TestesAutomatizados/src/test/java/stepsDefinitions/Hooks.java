package stepsDefinitions;


import static utils.Utils.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before(value = "@registrarUsuario")
		public void setup() {
		acessarSistema();
	}	
		
}
	
