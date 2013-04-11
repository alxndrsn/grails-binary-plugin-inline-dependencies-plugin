grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.work.dir = 'target' 
grails.project.target.level = 1.6

grails.project.dependency.resolution = {
	inherits 'global'
	log 'warn'
	repositories {
		grailsCentral()
		mavenCentral()
		mavenLocal()
	}
	dependencies {}
	plugins {
		build ":tomcat:$grailsVersion", ':release:2.2.1', ':rest-client-builder:1.0.3', {
			export = false
		}
	}
}

