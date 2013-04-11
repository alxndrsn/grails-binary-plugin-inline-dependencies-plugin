eventPackagePluginStart = {
	def libDir = new File('lib')
	if (!libDir.exists() || !libDir.isDirectory()) {
		return
	}

	println "# eventPackagePluginStart :: Exploding inline dependencies..."
	def dest = buildSettings.classesDir
	println "# eventPackagePluginStart :: Exploding from: $libDir to: $dest"
	ant.unzip dest:dest, {
		fileset dir:libDir, {
			include name:'**/*.jar'
		}
	}
	println "# eventPackagePluginStart :: Exploding inline dependencies completed."
}
