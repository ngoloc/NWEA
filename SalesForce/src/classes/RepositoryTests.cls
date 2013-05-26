/**
 * This class contains unit tests for validating the behavior of Apex classes
 * and triggers.
 *
 * Unit tests are class methods that verify whether a particular piece
 * of code is working properly. Unit test methods take no arguments,
 * commit no data to the database, and are flagged with the testMethod
 * keyword in the method definition.
 *
 * All test methods in an organization are executed whenever Apex code is deployed
 * to a production organization to confirm correctness, ensure code
 * coverage, and prevent regressions. All Apex classes are
 * required to have at least 75% code coverage in order to be deployed
 * to a production organization. In addition, all triggers must have some code coverage.
 * 
 * The @isTest class annotation indicates this class only contains test
 * methods. Classes defined with the @isTest annotation do not count against
 * the organization size limit for all Apex scripts.
 *
 * See the Apex Language Reference for more information about Testing and Code Coverage.
 */
@isTest
private class RepositoryTests {

	private static Repository repo;

	private static void GivenRepo()
	{
		RepositoryTests.repo = new Repository();
	}

 	static testMethod void getLineItemsTest(){
    	GivenRepo();
    	RepositoryTests.repo.getLineItemsForOpportunity('');
    }
    
    static testMethod void getProductTest(){
    	GivenRepo();
    	RepositoryTests.repo.getLineItemsForOpportunity('');
    }

	static testMethod void getPricebookEntryTest(){
		GivenRepo();
		RepositoryTests.repo.getPricebookEntry('');
	}
	
	static testMethod void getBridgesByPRPCTest(){
		GivenRepo();
		RepositoryTests.repo.getBridgesByPRPC('');
	}
	
	static testMethod void getBridgesByProductTest(){
		GivenRepo();
		RepositoryTests.repo.getBridgesByProduct('');
	}
	
	static testMethod void getOpportunityLineItemTest(){
		GivenRepo();
		RepositoryTests.repo.getOpportunityLineItem('');
	}
	
	static testMethod void getAccountTest(){
		GivenRepo();
		RepositoryTests.repo.getAccount('');
	}
	
	static testMethod void getOpportunityTest(){
		GivenRepo();
		RepositoryTests.repo.getOpportunity('');
	}

	static testMethod void getQuoteChargeTest(){
		GivenRepo();
		RepositoryTests.repo.getQuoteCharge('');
	}

	static testMethod void getProductRatePlanChargeTest(){
		GivenRepo();
		RepositoryTests.repo.getProductRatePlanCharge('');
	}
	
	static testMethod void getProductRatePlanTest(){
		GivenRepo();
		RepositoryTests.repo.getProductRatePlan('');
	}
	
	static testMethod void getZProductTest(){
		GivenRepo();
		RepositoryTests.repo.getZProduct('');
	}
	
	static testMethod void getQuoteTest(){
		GivenRepo();
		RepositoryTests.repo.getQuote('');
	}
}