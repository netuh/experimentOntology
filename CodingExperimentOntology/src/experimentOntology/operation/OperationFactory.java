/**
 */
package experimentOntology.operation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see experimentOntology.operation.OperationPackage
 * @generated
 */
public interface OperationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationFactory eINSTANCE = experimentOntology.operation.impl.OperationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Common Execution Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Common Execution Plan</em>'.
	 * @generated
	 */
	CommonExecutionPlan createCommonExecutionPlan();

	/**
	 * Returns a new object of class '<em>Independent Execution Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Independent Execution Plan</em>'.
	 * @generated
	 */
	IndependentExecutionPlan createIndependentExecutionPlan();

	/**
	 * Returns a new object of class '<em>Execution Plan By Treatment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Plan By Treatment</em>'.
	 * @generated
	 */
	ExecutionPlanByTreatment createExecutionPlanByTreatment();

	/**
	 * Returns a new object of class '<em>Pre Execution Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Execution Plan</em>'.
	 * @generated
	 */
	PreExecutionPlan createPreExecutionPlan();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Execution Plan Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Plan Description</em>'.
	 * @generated
	 */
	ExecutionPlanDescription createExecutionPlanDescription();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OperationPackage getOperationPackage();

} //OperationFactory
