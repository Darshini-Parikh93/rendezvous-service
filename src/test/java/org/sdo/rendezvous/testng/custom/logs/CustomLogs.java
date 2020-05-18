// Copyright 2019 Intel Corporation
// SPDX-License-Identifier: Apache 2.0

package org.sdo.rendezvous.testng.custom.logs;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomLogs extends TestListenerAdapter {

  private String testClassName = null;
  private String testMethodName = null;
  private long executionTime = 0;

  @Override
  public void onTestFailure(ITestResult tr) {

    testClassName = tr.getTestClass().toString();
    testMethodName = tr.getMethod().getMethodName().toString();
    executionTime = tr.getEndMillis() - tr.getStartMillis();

    System.out.println(testClassName + " [TestMethod name=" + testMethodName + "] [" + executionTime
            + " ms] -- FAILED\n");
  }

  @Override
  public void onTestSkipped(ITestResult tr) {

    testClassName = tr.getTestClass().toString();
    testMethodName = tr.getMethod().getMethodName().toString();
    executionTime = tr.getEndMillis() - tr.getStartMillis();

    System.out.println(testClassName + " [TestMethod name=" + testMethodName + "] [" + executionTime
            + " ms] -- SKIPPED\n");
  }

  @Override
  public void onTestSuccess(ITestResult tr) {

    testClassName = tr.getTestClass().toString();
    testMethodName = tr.getMethod().getMethodName().toString();
    executionTime = tr.getEndMillis() - tr.getStartMillis();

    System.out.println(testClassName + " [TestMethod name=" + testMethodName + "] [" + executionTime
            + " ms] -- SUCCESS\n");
  }
}