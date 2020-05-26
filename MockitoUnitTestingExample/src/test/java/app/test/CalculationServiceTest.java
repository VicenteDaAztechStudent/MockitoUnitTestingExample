package app.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import app.dao.DataDao;
import app.service.CalculationService;

@ExtendWith(MockitoExtension.class)

public class CalculationServiceTest {

	@InjectMocks
	CalculationService mockService;
	
	@Mock
	DataDao mockDao;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		System.out.println("Loading new problem...\n"
				+ "**********************");
	}
	
	@AfterEach
	public void wrapUp() {
		System.out.println("Moving to next problem..\n"
				+ "**********************\n"
				+ "\n"
				+ "");
	}
	
	
	
	
	@Test
	@DisplayName("Pass test, actual data sum is 31... ")
	public void testAddAll() {
		//Actual data
		when(mockDao.getAddData()).thenReturn(new int[] {1,2,5,8,9,6});
		System.out.println("We will provide the sum of the following numbers : \n"
				+ "1,2,5,9,6 \n"
				+ "Actual data test should pass and add all integers to 31..\n"
				+ "**********************");
		
		
		int sumExpected = 31;
		assertEquals(sumExpected, mockService.addAll(),"Test Should pass and add all integers to 31..");
	}
	@Test
	@DisplayName("Pass test, mock data sum is 24... ")
	public void testAddAllTwo() {
		//Mock data
		when(mockDao.getAddData()).thenReturn(new int[] {1,8,7,8});
		System.out.println("We will provide the sum of the following numbers : \n"
				+ "1,8,7,8 \n"
				+ "Mock data test Should pass and add all integers to 24..\n"
				+ "**********************");	
		
		
		int sumExpectedTwo = 24;
		assertEquals(sumExpectedTwo, mockService.addAll(), "Test Should pass and add all integers to 24..");
	}
	@Test
	@DisplayName("Pass test, actual data difference is 40")
	public void testSubtracAll() {
		//Actual data 
		when(mockDao.getSubtractData()).thenReturn(new int[] {100,20,5,15,10,10});
		System.out.println("We will provide the difference of the following numbers : \n"
				+ "100,20,5,15,10,10\n"
				+ "Actual data test Should pass and subtract all integers to 40..\n"
				+ "**********************");	
		
		
		int differenceExpected = 40;
		assertEquals(differenceExpected, mockService.subtractAll(), "Test should pass and subtract all integers to 40..");
	}
	@Test
	@DisplayName("Pass test, mock data difference is 428")
	public void testSubtractAllTwo() {
		//Mock data 
		when(mockDao.getSubtractData()).thenReturn(new int[] {500,70,2});
		System.out.println("We will provide the difference of the following numbers : \n"
				+ "500,70,2\n"
				+ "Mock data test Should pass and subtract all integers to 428..\n"
				+ "*********************");	
		
		
		int differenceExpected = 428;
		assertEquals(differenceExpected, mockService.subtractAll(), "Test should pass and subtract all integers to 428..");
	}
	@Test
	@DisplayName("Pass test, actual data product is 96...")
	public void testMultiplyAll() {
		//Actual data
		when(mockDao.getMultiplyData()).thenReturn(new int[] {2,4,6,2});
		System.out.println("We will provide the prodct of the following numbers : \n"
				+ "2,4,6,2\n"
				+ "Actual data test Should pass and multiply all integers to 96..\n"
				+ "**********************");			
		
		
		int productExpected = 96;
		assertEquals(productExpected, mockService.multiplyAll(), "Test should passs and multiply all integers to 96..");
	}
	@Test
	@EnabledOnOs(OS.LINUX)
	@DisplayName("Test should skip, must run on Linux OS...")
	public void testMultiplyAllTwo() {
		//Actual data
		when(mockDao.getMultiplyData()).thenReturn(new int[] {3,12,4});
		System.out.println("We will provide the prodct of the following numbers : \n"
				+ "3,12,4\n"
				+ "Actual data test Should pass and multiply all integers to 144..\n"
				+ "**********************");			
		
		
		int productExpected = 144;
		assertEquals(productExpected, mockService.multiplyAll(), "Test should passs and multiply all integers to 144..");
	}
	@Test
	@DisplayName("Pass test, actual data quotient is 5..")
	public void testDivideAll() {
		//Actual data 
		when(mockDao.getDivideData()).thenReturn(new int[] {150,15,2});
		System.out.println("We will provide the quotient of the following numbers : \n"
				+ "150,15,2\n"
				+ "Actual data test Should pass and multiply all integers to 5..\n"
				+ "**********************");					
		int quotientExpected = 5;
		assertEquals(quotientExpected, mockService.divideAll(), "Test should pass and divide all integers to 5...");
	}
	@Test
	@Disabled
	@DisplayName("Test Driven Development, should skip, code under construction..")
	public void testDivideAllTwo() {
		System.out.println("New features being developed...");
	}
}
