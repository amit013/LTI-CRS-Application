package com.lt.business;

import org.apache.log4j.Logger;

/*
 * @author G4-FullStackGroup
 * Dao Class Operations for CatlogImplService
 * 
 */
public class CatlogImplService implements CatlogInterface {
	private static Logger logger = Logger.getLogger(CatlogImplService.class);	
	private static volatile CatlogImplService instance = null;
	/*
	 * Default Constructor
	 * 
	 */
	private CatlogImplService()
	{
	}
	/*
	 * Method to make CatlogImplService Singleton
	 * @return
	 */
	public static CatlogImplService getInstance()
	{
		if(instance == null)
		{
			synchronized(CatlogImplService.class){
				instance = new CatlogImplService();
			}
		}
		return instance;
	}
	/*
	 * Method to get courseId
	 */
	@Override
	public String getCourseId() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * Method to get course Name
	 */
	@Override
	public String getCourseName() {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * Method to set course Id
	 */
	@Override
	public String setCourseId() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * Method to set course Name
	 */
	public String setCourseName() {
		// TODO Auto-generated method stub
		return null;
	}

}
