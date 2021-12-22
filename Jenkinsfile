pipeline{
	agent any
	stages{
		stage(build){
			steps{
				echo 'building application...'
				sh 'mvn -o -f .\poms\pom.xml -am -pl jobs/process/test_0.1 clean package --settings "C:\Talend\TOS_DI-Win32-20200219_1130-V7.3.1\configuration\maven_user_settings.xml"'
			}
		
		}
	
	}

}