package ua.lviv.iot.officeTools.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.officeTools.model.SortType;

public class OfficeToolsManagerUtilsTest extends BaseOfficeToolsManagerTest {

	@BeforeEach
	public void setUp() {}
	
	@Test
	public void testSortAscending() {
		
		OfficeToolsManagerUtils.sortByWeightInGrams(rulers,SortType.ASCENDING);
	}
	
/*	@Test
	public void testSortDescending() {
		
		OfficeToolsManagerUtils.sortByByPriceInUAH(rulers,SortType.DESCENDING);
	fail("Not yet implemented");	
	} */
}
