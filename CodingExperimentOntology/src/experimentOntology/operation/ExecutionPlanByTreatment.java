/**
 */
package experimentOntology.operation;

import experimentOntology.planning.Treatment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Plan By Treatment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.ExecutionPlanByTreatment#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link experimentOntology.operation.ExecutionPlanByTreatment#getPlan <em>Plan</em>}</li>
 * </ul>
 *
 * @see experimentOntology.operation.OperationPackage#getExecutionPlanByTreatment()
 * @model
 * @generated
 */
public interface ExecutionPlanByTreatment extends EObject {
	/**
	 * Returns the value of the '<em><b>Treatment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treatment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treatment</em>' reference.
	 * @see #setTreatment(Treatment)
	 * @see experimentOntology.operation.OperationPackage#getExecutionPlanByTreatment_Treatment()
	 * @model required="true"
	 * @generated
	 */
	Treatment getTreatment();

	/**
	 * Sets the value of the '{@link experimentOntology.operation.ExecutionPlanByTreatment#getTreatment <em>Treatment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treatment</em>' reference.
	 * @see #getTreatment()
	 * @generated
	 */
	void setTreatment(Treatment value);

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference.
	 * @see #setPlan(CommonExecutionPlan)
	 * @see experimentOntology.operation.OperationPackage#getExecutionPlanByTreatment_Plan()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CommonExecutionPlan getPlan();

	/**
	 * Sets the value of the '{@link experimentOntology.operation.ExecutionPlanByTreatment#getPlan <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' containment reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(CommonExecutionPlan value);

} // ExecutionPlanByTreatment
