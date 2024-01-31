Prerequisite:

Install latest version of eclipse IDE (https://www.eclipse.org/downloads/)
Install Cucumber Eclipse plugin from Eclipse MarketPlace (you will find the option in top bar help section-->Eclipse MarketPlace-->Search Cucumber Eclipse plugin)
Git Bash should be downloaded (https://git-scm.com/download/win)

Download the Repo/Framework:

1. Pls connect with mayank jaiswal (mayank.jaiswal@spinny.com) or Admin (Dev-ops team) for repo access
2. Once you got the access, create the user and login
3. Accept the repo invitation sent 
4. Download the repo

Import Framework in eclipse :

1. In Eclipse choose import existing project
2. Choose project as maven (Existing maven project)
3. Select the cloned framework (POM.xml file )
4. Click on finish

Run a sample test case and generate cucumber  report:

1. Open Terminal
2. Go to project workspace or directory (cd <path of repo or project>)
3. Run "mvn clean"
4. Run "mvn verify"
5. Check target folder (cucumber-html-report) for execution report






 