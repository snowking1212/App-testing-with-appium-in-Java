package com.dan.common;

//import org.apache.logging.log4j.LogManager;
import org.apache.log4j.Logger;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * TestNG 监听类扩展
 * 测试执行失败截图
 * @author chang.lu
 *
 */
public class TestListener implements ITestListener{

//private static final Logger LOG = LogManager.getLogger(TestListener.class);
private static Logger LOG =  Logger.getLogger(TestListener.class);
	
	public void onFinish(ITestContext arg0) {
		
	}

	public void onStart(ITestContext arg0) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * 执行失败截图
	 */
	public void onTestFailure(ITestResult result) {
		LOG.info("[截图]用例执行失败");
		String dest = result.getMethod().getRealClass().getSimpleName() + "." + result.getMethod().getMethodName();
		LOG.info("[截图]"+dest);
		BaseTools.captureScreenShot(dest);
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}
}
