package Model;

import java.util.HashSet;

public interface IProject {
	public String getId();
	public void setId(String id);
	public String getName();
	public void setName(String name);
	public HashSet<WorkTool> getWorkingTools();
}
