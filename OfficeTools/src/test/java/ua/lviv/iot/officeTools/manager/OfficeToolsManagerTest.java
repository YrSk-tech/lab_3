package ua.lviv.iot.officeTools.manager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.officeTools.manager.OfficeToolsManager;
import ua.lviv.iot.officeTools.manager.OfficeToolsManagerUtils;
import ua.lviv.iot.officeTools.model.AbstractOfficeTool;
import ua.lviv.iot.officeTools.model.SortType;

class OfficeToolsManagerTest extends BaseOfficeToolsManagerTest {
	private OfficeToolsManager officeToolsManager;
	
	 List<AbstractOfficeTool> officeTools = null;
		
	@BeforeEach
	public void setUp() {
		//FIXME: Manager initialization logic goes here
		
		// create required objects here
		
		officeToolsManager = new OfficeToolsManager();
	
		officeToolsManager.addOfficeTool();
	}
	
	@Test
	public void testSortAscending() {
		
		OfficeToolsManagerUtils.sortByWeightInGrams(officeTools,SortType.ASCENDING);
		fail("Not yet implemented");	
	}
	
	@Test
	public void testSortDescending() {
		
		OfficeToolsManagerUtils.sortByByPriceInUAH(officeTools,SortType.DESCENDING);
	fail("Not yet implemented");	
	}

}
