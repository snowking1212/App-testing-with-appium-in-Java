package com.test.testcase;


import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

//import org.apache.logging.log4j.LogManager;
import org.apache.log4j.Logger;
import org.seleniumhq.jetty7.util.log.Log;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

import com.dan.common.BaseTools;
import com.dan.common.Driver;
import com.dan.common.SpringConfig;


public class Candle extends BaseCaseTest{
	private static Logger LOG =  Logger.getLogger(Candle.class);
	//APP开关灯
	@Test(groups = "try")
	public void a1(){
		bcase.swipeToUp(1);
	    
	}
	
	
}
