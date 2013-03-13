
package soot.jimple.toolkits.transformation.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TransformationLanguageStandaloneSetup extends TransformationLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new TransformationLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

