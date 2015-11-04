/**
 */
package experimentOntology.planning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experimental Plan Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.ExperimentalPlanDescription#getPlan <em>Plan</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.PlanningPackage#getExperimentalPlanDescription()
 * @model
 * @generated
 */
public interface ExperimentalPlanDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference.
	 * @see #setPlan(ExperimentalPlan)
	 * @see experimentOntology.planning.PlanningPackage#getExperimentalPlanDescription_Plan()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExperimentalPlan getPlan();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.ExperimentalPlanDescription#getPlan <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' containment reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(ExperimentalPlan value);

} // ExperimentalPlanDescription
