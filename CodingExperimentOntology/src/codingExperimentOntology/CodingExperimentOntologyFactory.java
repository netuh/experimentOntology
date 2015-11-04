/**
 */
package codingExperimentOntology;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.CodingExperimentOntologyPackage
 * @generated
 */
public interface CodingExperimentOntologyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodingExperimentOntologyFactory eINSTANCE = codingExperimentOntology.impl.CodingExperimentOntologyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Coding Experimental Study</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coding Experimental Study</em>'.
	 * @generated
	 */
	CodingExperimentalStudy createCodingExperimentalStudy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodingExperimentOntologyPackage getCodingExperimentOntologyPackage();

} //CodingExperimentOntologyFactory
