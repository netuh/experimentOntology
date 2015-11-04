/**
 */
package codingExperimentOntology.variables;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.variables.NewPackage1Package
 * @generated
 */
public interface NewPackage1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NewPackage1Factory eINSTANCE = codingExperimentOntology.variables.impl.NewPackage1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Time Bound Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Bound Variable</em>'.
	 * @generated
	 */
	TimeBoundVariable createTimeBoundVariable();

	/**
	 * Returns a new object of class '<em>Resource Based Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Based Variable</em>'.
	 * @generated
	 */
	ResourceBasedVariable createResourceBasedVariable();

	/**
	 * Returns a new object of class '<em>Awnser Based Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Awnser Based Variable</em>'.
	 * @generated
	 */
	AwnserBasedVariable createAwnserBasedVariable();

	/**
	 * Returns a new object of class '<em>Artifact Independent Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact Independent Variable</em>'.
	 * @generated
	 */
	ArtifactIndependentVariable createArtifactIndependentVariable();

	/**
	 * Returns a new object of class '<em>Enviroment Independent Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enviroment Independent Variable</em>'.
	 * @generated
	 */
	EnviromentIndependentVariable createEnviromentIndependentVariable();

	/**
	 * Returns a new object of class '<em>Other Coding Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Coding Variable</em>'.
	 * @generated
	 */
	OtherCodingVariable createOtherCodingVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NewPackage1Package getNewPackage1Package();

} //NewPackage1Factory
