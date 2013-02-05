package Model;

import java.util.HashSet;

public class Project extends BaseObject implements IProject {
	private HashSet<WorkTool> workTools = new HashSet<WorkTool>();
	
	@Override
	public HashSet<WorkTool> getWorkingTools() {
		return workTools;
	}

}
