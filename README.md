# PreInterviewTestProject
# Vrinda_PreInterviewTask

**1.How Issue Identified**
**Steps to Reproduce:**
1. Launch Given URL (https://osa-web.t-cg.co.uk/qatest) in Google Chrome
2. Use Google Chrome’s 'Inspect' tool to check the broken links
3. Right-click anywhere on web page and select Inspect. This will open up the 'Inspect' panel.
4. Click on the 'Console' tab and then refresh the page.
5. Verify the errors listed in the console.

**Actual Result :**
Page is not loading any data.

**Expected Result:**
Given URL should launch successfully and web page should load all the data without any errors.

Refer the attached screenshot
![image](https://user-images.githubusercontent.com/54312583/230943237-d4a3dba8-eadd-47e5-8ea4-bb8f081bd1d7.png)

**2.Observations**

- This error will thrown If the CORS configuration is not setup correctly.
Also there is a possible that the request is disallowed by the user's web application

Two Web URLs having different origins when they have different protocols or hosts.
For example, making a request from https://osa-web.t-cg.co.uk to https://osa-web.t-cg.co.uk/qatest is considered cross-origin as they have different hostnames.
A website is allowed to make requests to the same origin unless the response from other origins includes the right CORS headers.

A CORS error occurs when the server doesn’t return the CORS headers required.
For example, https://osa-web.t-cg.co.uk/qatest tries to make an API request. As https://osa-web.t-cg.co.uk/qatest is not included in the Access-Control-Allow-Origin header of the response, the browser will display a CORS error.
