package soot.jimple.toolkits.transformation.dsl.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractTransformationLanguageJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage.eINSTANCE);
		return result;
	}

}
