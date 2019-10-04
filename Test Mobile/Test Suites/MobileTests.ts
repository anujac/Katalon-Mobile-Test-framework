<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>MobileTests</name>
   <tag></tag>
   <executionMode>PARALLEL</executionMode>
   <maxConcurrentInstances>2</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Mobile</groupName>
            <profileName>default</profileName>
            <runConfigurationData>
               <entry>
                  <key>deviceName</key>
                  <value>emulator-5554 (Android SDK built for x86 - Android 8.0.0)</value>
               </entry>
               <entry>
                  <key>deviceId</key>
                  <value>emulator-5554</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>Android</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/TS_AndroidTests</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Mobile</groupName>
            <profileName>default</profileName>
            <runConfigurationData>
               <entry>
                  <key>deviceName</key>
                  <value>iPhone 11 Pro (Simulator)</value>
               </entry>
               <entry>
                  <key>deviceId</key>
                  <value>81399A11-7C04-4F7E-AB20-6A952929CE2A</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>iOS</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/TS_IOSTests</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
