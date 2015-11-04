/**
 */
package codingExperimentOntology.tasks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.tasks.NewPackage2Package
 * @generated
 */
public interface NewPackage2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NewPackage2Factory eINSTANCE = codingExperimentOntology.tasks.impl.NewPackage2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Generic Coding Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Coding Task</em>'.
	 * @generated
	 */
	GenericCodingTask createGenericCodingTask();

	/**
	 * Returns a new object of class '<em>Training Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Training Class</em>'.
	 * @generated
	 */
	TrainingClass createTrainingClass();

	/**
	 * Returns a new object of class '<em>Pilot Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pilot Task</em>'.
	 * @generated
	 */
	PilotTask createPilotTask();

	/**
	 * Returns a new object of class '<em>Experimental Coding Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experimental Coding Task</em>'.
	 * @generated
	 */
	ExperimentalCodingTask createExperimentalCodingTask();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NewPackage2Package getNewPackage2Package();

} //NewPackage2Factory
