package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;

public class ExtentManager {

   // public static void generateExtentReport() {
   public static void main(String[] args) {


       ExtentReports extentReport = new ExtentReports();
        File extentReportFile = new File(System.getProperty("user.dir")+"\\test-output\\ExtentReports\\extentReport.html");

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
         extentReport.attachReporter(sparkReporter);
         extentReport.flush();




    }


    }
