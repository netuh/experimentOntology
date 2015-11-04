/**
 */
package experimentOntology.planning;

import experimentOntology.planning.designOfExperiment.TwoTreatmentDesign;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mono Factor Treatment Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.MonoFactorTreatmentPlan#getDesign <em>Design</em>}</li>
 *   <li>{@link experimentOntology.planning.MonoFactorTreatmentPlan#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.PlanningPackage#getMonoFactorTreatmentPlan()
 * @model
 * @generated
 */
public interface MonoFactorTreatmentPlan extends ExperimentalPlan {
	/**
	 * Returns the value of the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' containment reference.
	 * @see #setDesign(TwoTreatmentDesign)
	 * @see experimentOntology.planning.PlanningPackage#getMonoFactorTreatmentPlan_Design()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TwoTreatmentDesign getDesign();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.MonoFactorTreatmentPlan#getDesign <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' containment reference.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(TwoTreatmentDesign value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference.
	 * @see #setFactor(DualTreatmentFactor)
	 * @see experimentOntology.planning.PlanningPackage#getMonoFactorTreatmentPlan_Factor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DualTreatmentFactor getFactor();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.MonoFactorTreatmentPlan#getFactor <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' containment reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(DualTreatmentFactor value);

} // MonoFactorTreatmentPlan
