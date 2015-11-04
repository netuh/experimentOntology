/**
 */
package experimentOntology.planning;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see experimentOntology.planning.PlanningPackage
 * @generated
 */
public interface PlanningFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlanningFactory eINSTANCE = experimentOntology.planning.impl.PlanningFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dual Treatment Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dual Treatment Factor</em>'.
	 * @generated
	 */
	DualTreatmentFactor createDualTreatmentFactor();

	/**
	 * Returns a new object of class '<em>Multi Treatment Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Treatment Factor</em>'.
	 * @generated
	 */
	MultiTreatmentFactor createMultiTreatmentFactor();

	/**
	 * Returns a new object of class '<em>Treatment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Treatment</em>'.
	 * @generated
	 */
	Treatment createTreatment();

	/**
	 * Returns a new object of class '<em>Mono Factor Treatment Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mono Factor Treatment Plan</em>'.
	 * @generated
	 */
	MonoFactorTreatmentPlan createMonoFactorTreatmentPlan();

	/**
	 * Returns a new object of class '<em>Dual Factor Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dual Factor Plan</em>'.
	 * @generated
	 */
	DualFactorPlan createDualFactorPlan();

	/**
	 * Returns a new object of class '<em>Ternary Factor Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ternary Factor Plan</em>'.
	 * @generated
	 */
	TernaryFactorPlan createTernaryFactorPlan();

	/**
	 * Returns a new object of class '<em>Generic Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Plan</em>'.
	 * @generated
	 */
	GenericPlan createGenericPlan();

	/**
	 * Returns a new object of class '<em>Mono Factor Mult Treatment Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mono Factor Mult Treatment Plan</em>'.
	 * @generated
	 */
	MonoFactorMultTreatmentPlan createMonoFactorMultTreatmentPlan();

	/**
	 * Returns a new object of class '<em>Experimental Plan Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experimental Plan Description</em>'.
	 * @generated
	 */
	ExperimentalPlanDescription createExperimentalPlanDescription();

	/**
	 * Returns a new object of class '<em>Pieces Of Apparatus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pieces Of Apparatus</em>'.
	 * @generated
	 */
	PiecesOfApparatus createPiecesOfApparatus();

	/**
	 * Returns a new object of class '<em>Independent Variables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Independent Variables</em>'.
	 * @generated
	 */
	IndependentVariables createIndependentVariables();

	/**
	 * Returns a new object of class '<em>Dependent Variables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependent Variables</em>'.
	 * @generated
	 */
	DependentVariables createDependentVariables();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PlanningPackage getPlanningPackage();

} //PlanningFactory
