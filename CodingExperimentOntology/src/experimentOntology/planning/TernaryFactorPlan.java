/**
 */
package experimentOntology.planning;

import experimentOntology.planning.designOfExperiment.TriFactorDesign;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ternary Factor Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.TernaryFactorPlan#getFactors <em>Factors</em>}</li>
 *   <li>{@link experimentOntology.planning.TernaryFactorPlan#getDesign <em>Design</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.PlanningPackage#getTernaryFactorPlan()
 * @model
 * @generated
 */
public interface TernaryFactorPlan extends ExperimentalPlan {
	/**
	 * Returns the value of the '<em><b>Factors</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.planning.DualTreatmentFactor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factors</em>' containment reference list.
	 * @see experimentOntology.planning.PlanningPackage#getTernaryFactorPlan_Factors()
	 * @model containment="true" lower="3"
	 * @generated
	 */
	EList<DualTreatmentFactor> getFactors();

	/**
	 * Returns the value of the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' containment reference.
	 * @see #setDesign(TriFactorDesign)
	 * @see experimentOntology.planning.PlanningPackage#getTernaryFactorPlan_Design()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TriFactorDesign getDesign();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.TernaryFactorPlan#getDesign <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' containment reference.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(TriFactorDesign value);

} // TernaryFactorPlan
