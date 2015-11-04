/**
 */
package experimentOntology.operation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Independent Execution Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.IndependentExecutionPlan#getPlanByTreatment <em>Plan By Treatment</em>}</li>
 * </ul>
 *
 * @see experimentOntology.operation.OperationPackage#getIndependentExecutionPlan()
 * @model
 * @generated
 */
public interface IndependentExecutionPlan extends ExecutionPlan {
	/**
	 * Returns the value of the '<em><b>Plan By Treatment</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.operation.ExecutionPlanByTreatment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan By Treatment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan By Treatment</em>' containment reference list.
	 * @see experimentOntology.operation.OperationPackage#getIndependentExecutionPlan_PlanByTreatment()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<ExecutionPlanByTreatment> getPlanByTreatment();

} // IndependentExecutionPlan
