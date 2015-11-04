/**
 */
package experimentOntology.operation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Plan Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.ExecutionPlanDescription#getPlan <em>Plan</em>}</li>
 *   <li>{@link experimentOntology.operation.ExecutionPlanDescription#getPrePlan <em>Pre Plan</em>}</li>
 * </ul>
 *
 * @see experimentOntology.operation.OperationPackage#getExecutionPlanDescription()
 * @model
 * @generated
 */
public interface ExecutionPlanDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference.
	 * @see #setPlan(ExecutionPlan)
	 * @see experimentOntology.operation.OperationPackage#getExecutionPlanDescription_Plan()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExecutionPlan getPlan();

	/**
	 * Sets the value of the '{@link experimentOntology.operation.ExecutionPlanDescription#getPlan <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' containment reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(ExecutionPlan value);

	/**
	 * Returns the value of the '<em><b>Pre Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Plan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Plan</em>' containment reference.
	 * @see #setPrePlan(PreExecutionPlan)
	 * @see experimentOntology.operation.OperationPackage#getExecutionPlanDescription_PrePlan()
	 * @model containment="true"
	 * @generated
	 */
	PreExecutionPlan getPrePlan();

	/**
	 * Sets the value of the '{@link experimentOntology.operation.ExecutionPlanDescription#getPrePlan <em>Pre Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Plan</em>' containment reference.
	 * @see #getPrePlan()
	 * @generated
	 */
	void setPrePlan(PreExecutionPlan value);

} // ExecutionPlanDescription
