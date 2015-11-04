/**
 */
package experimentOntology.planning;

import experimentOntology.planning.designOfExperiment.MultTreatmentDesign;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mono Factor Mult Treatment Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.MonoFactorMultTreatmentPlan#getFactor <em>Factor</em>}</li>
 *   <li>{@link experimentOntology.planning.MonoFactorMultTreatmentPlan#getDesign <em>Design</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.PlanningPackage#getMonoFactorMultTreatmentPlan()
 * @model
 * @generated
 */
public interface MonoFactorMultTreatmentPlan extends ExperimentalPlan {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference.
	 * @see #setFactor(MultiTreatmentFactor)
	 * @see experimentOntology.planning.PlanningPackage#getMonoFactorMultTreatmentPlan_Factor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultiTreatmentFactor getFactor();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.MonoFactorMultTreatmentPlan#getFactor <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' containment reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(MultiTreatmentFactor value);

	/**
	 * Returns the value of the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' containment reference.
	 * @see #setDesign(MultTreatmentDesign)
	 * @see experimentOntology.planning.PlanningPackage#getMonoFactorMultTreatmentPlan_Design()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultTreatmentDesign getDesign();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.MonoFactorMultTreatmentPlan#getDesign <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' containment reference.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(MultTreatmentDesign value);

} // MonoFactorMultTreatmentPlan
