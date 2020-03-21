package ua.lviv.iot.officeTools.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.officeTools.model.AbstractOfficeTool;
import ua.lviv.iot.officeTools.model.Ruler;

public abstract class BaseOfficeToolsManagerTest {
	
	protected List<AbstractOfficeTool> rulers;
	
	public void createRuler() {
		rulers = new LinkedList<AbstractOfficeTool>();
		rulers.add(new Ruler(120)); 
		rulers.add(new Ruler(80)); 
		rulers.add(new Ruler(100)); 
	}
}
