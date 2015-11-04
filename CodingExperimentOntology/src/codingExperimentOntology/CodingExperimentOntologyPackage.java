/**
 */
package codingExperimentOntology;

import experimentOntology.ExperimentOntologyPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.CodingExperimentOntologyFactory
 * @model kind="package"
 * @generated
 */
public interface CodingExperimentOntologyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codingExperimentOntology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/codingExperimentOntology";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "codingExperimentOntology";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodingExperimentOntologyPackage eINSTANCE = codingExperimentOntology.impl.CodingExperimentOntologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link codingExperimentOntology.impl.CodingExperimentalStudyImpl <em>Coding Experimental Study</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.impl.CodingExperimentalStudyImpl
	 * @see codingExperimentOntology.impl.CodingExperimentOntologyPackageImpl#getCodingExperimentalStudy()
	 * @generated
	 */
	int CODING_EXPERIMENTAL_STUDY = 0;

	/**
	 * The feature id for the '<em><b>Experiments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_EXPERIMENTAL_STUDY__EXPERIMENTS = ExperimentOntologyPackage.EXPERIMENTAL_STUDY__EXPERIMENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_EXPERIMENTAL_STUDY__DESCRIPTION = ExperimentOntologyPackage.EXPERIMENTAL_STUDY__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Coding Experimental Study</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_EXPERIMENTAL_STUDY_FEATURE_COUNT = ExperimentOntologyPackage.EXPERIMENTAL_STUDY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coding Experimental Study</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_EXPERIMENTAL_STUDY_OPERATION_COUNT = ExperimentOntologyPackage.EXPERIMENTAL_STUDY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.CodingExperimentalStudy <em>Coding Experimental Study</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coding Experimental Study</em>'.
	 * @see codingExperimentOntology.CodingExperimentalStudy
	 * @generated
	 */
	EClass getCodingExperimentalStudy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodingExperimentOntologyFactory getCodingExperimentOntologyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link codingExperimentOntology.impl.CodingExperimentalStudyImpl <em>Coding Experimental Study</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.impl.CodingExperimentalStudyImpl
		 * @see codingExperimentOntology.impl.CodingExperimentOntologyPackageImpl#getCodingExperimentalStudy()
		 * @generated
		 */
		EClass CODING_EXPERIMENTAL_STUDY = eINSTANCE.getCodingExperimentalStudy();

	}

} //CodingExperimentOntologyPackage
