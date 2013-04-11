eventPackagePluginStart = {
	println "# eventPackagePluginStart :: Exploding inline dependencies..."
	def dest = buildSettings.classesDir
	def libDir = 'lib'
	println "# eventPackagePluginStart :: Exploding from: $libDir to: $dest"
	ant.unzip dest:dest, {
		fileset dir:libDir, {
			include name:'**/*.jar'
		}
	}
	println "# eventPackagePluginStart :: Exploding inline dependencies completed."
}
