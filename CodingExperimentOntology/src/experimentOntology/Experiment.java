/**
 */
package experimentOntology;

import experimentOntology.operation.ExecutionPlanDescription;

import experimentOntology.planning.ExperimentalPlanDescription;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.Experiment#getPlan <em>Plan</em>}</li>
 *   <li>{@link experimentOntology.Experiment#getExecutionPlan <em>Execution Plan</em>}</li>
 * </ul>
 *
 * @see experimentOntology.ExperimentOntologyPackage#getExperiment()
 * @model
 * @generated
 */
public interface Experiment extends EObject {
	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference.
	 * @see #setPlan(ExperimentalPlanDescription)
	 * @see experimentOntology.ExperimentOntologyPackage#getExperiment_Plan()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExperimentalPlanDescription getPlan();

	/**
	 * Sets the value of the '{@link experimentOntology.Experiment#getPlan <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' containment reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(ExperimentalPlanDescription value);

	/**
	 * Returns the value of the '<em><b>Execution Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Plan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Plan</em>' containment reference.
	 * @see #setExecutionPlan(ExecutionPlanDescription)
	 * @see experimentOntology.ExperimentOntologyPackage#getExperiment_ExecutionPlan()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExecutionPlanDescription getExecutionPlan();

	/**
	 * Sets the value of the '{@link experimentOntology.Experiment#getExecutionPlan <em>Execution Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Plan</em>' containment reference.
	 * @see #getExecutionPlan()
	 * @generated
	 */
	void setExecutionPlan(ExecutionPlanDescription value);

} // Experiment
