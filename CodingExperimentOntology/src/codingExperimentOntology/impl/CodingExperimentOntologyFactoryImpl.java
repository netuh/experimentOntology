/**
 */
package codingExperimentOntology.impl;

import codingExperimentOntology.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodingExperimentOntologyFactoryImpl extends EFactoryImpl implements CodingExperimentOntologyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodingExperimentOntologyFactory init() {
		try {
			CodingExperimentOntologyFactory theCodingExperimentOntologyFactory = (CodingExperimentOntologyFactory)EPackage.Registry.INSTANCE.getEFactory(CodingExperimentOntologyPackage.eNS_URI);
			if (theCodingExperimentOntologyFactory != null) {
				return theCodingExperimentOntologyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodingExperimentOntologyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingExperimentOntologyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CodingExperimentOntologyPackage.CODING_EXPERIMENTAL_STUDY: return createCodingExperimentalStudy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingExperimentalStudy createCodingExperimentalStudy() {
		CodingExperimentalStudyImpl codingExperimentalStudy = new CodingExperimentalStudyImpl();
		return codingExperimentalStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingExperimentOntologyPackage getCodingExperimentOntologyPackage() {
		return (CodingExperimentOntologyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodingExperimentOntologyPackage getPackage() {
		return CodingExperimentOntologyPackage.eINSTANCE;
	}

} //CodingExperimentOntologyFactoryImpl
