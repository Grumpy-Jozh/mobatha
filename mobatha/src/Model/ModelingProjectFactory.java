package Model;

public class ModelingProjectFactory extends ProjectFactory {

	@Override
	public IProject createNewProject() {
		return new Project();
	}

}
