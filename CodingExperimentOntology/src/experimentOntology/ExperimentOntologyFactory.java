/**
 */
package experimentOntology;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see experimentOntology.ExperimentOntologyPackage
 * @generated
 */
public interface ExperimentOntologyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExperimentOntologyFactory eINSTANCE = experimentOntology.impl.ExperimentOntologyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Experimental Study</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experimental Study</em>'.
	 * @generated
	 */
	ExperimentalStudy createExperimentalStudy();

	/**
	 * Returns a new object of class '<em>Experiment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiment</em>'.
	 * @generated
	 */
	Experiment createExperiment();

	/**
	 * Returns a new object of class '<em>Replication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replication</em>'.
	 * @generated
	 */
	Replication createReplication();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExperimentOntologyPackage getExperimentOntologyPackage();

} //ExperimentOntologyFactory
