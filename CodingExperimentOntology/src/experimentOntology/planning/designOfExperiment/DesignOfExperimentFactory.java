/**
 */
package experimentOntology.planning.designOfExperiment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage
 * @generated
 */
public interface DesignOfExperimentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DesignOfExperimentFactory eINSTANCE = experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Randomized Discipline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Randomized Discipline</em>'.
	 * @generated
	 */
	RandomizedDiscipline createRandomizedDiscipline();

	/**
	 * Returns a new object of class '<em>Block Design Discipline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Design Discipline</em>'.
	 * @generated
	 */
	BlockDesignDiscipline createBlockDesignDiscipline();

	/**
	 * Returns a new object of class '<em>Balanced Design Discipline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Balanced Design Discipline</em>'.
	 * @generated
	 */
	BalancedDesignDiscipline createBalancedDesignDiscipline();

	/**
	 * Returns a new object of class '<em>Blocked Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blocked Characteristic</em>'.
	 * @generated
	 */
	BlockedCharacteristic createBlockedCharacteristic();

	/**
	 * Returns a new object of class '<em>Two Treatment Design</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Two Treatment Design</em>'.
	 * @generated
	 */
	TwoTreatmentDesign createTwoTreatmentDesign();

	/**
	 * Returns a new object of class '<em>Mult Treatment Design</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mult Treatment Design</em>'.
	 * @generated
	 */
	MultTreatmentDesign createMultTreatmentDesign();

	/**
	 * Returns a new object of class '<em>Square Design</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Square Design</em>'.
	 * @generated
	 */
	SquareDesign createSquareDesign();

	/**
	 * Returns a new object of class '<em>Nested Factor Design</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Factor Design</em>'.
	 * @generated
	 */
	NestedFactorDesign createNestedFactorDesign();

	/**
	 * Returns a new object of class '<em>Tri Factor Design</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tri Factor Design</em>'.
	 * @generated
	 */
	TriFactorDesign createTriFactorDesign();

	/**
	 * Returns a new object of class '<em>Generic Design</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Design</em>'.
	 * @generated
	 */
	GenericDesign createGenericDesign();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DesignOfExperimentPackage getDesignOfExperimentPackage();

} //DesignOfExperimentFactory
