/**
 */
package experimentOntology.planning;

import experimentOntology.planning.designOfExperiment.TwoFactorDesign;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dual Factor Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.DualFactorPlan#getFactor <em>Factor</em>}</li>
 *   <li>{@link experimentOntology.planning.DualFactorPlan#getDesign <em>Design</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.PlanningPackage#getDualFactorPlan()
 * @model
 * @generated
 */
public interface DualFactorPlan extends ExperimentalPlan {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.planning.Factor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference list.
	 * @see experimentOntology.planning.PlanningPackage#getDualFactorPlan_Factor()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Factor> getFactor();

	/**
	 * Returns the value of the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' containment reference.
	 * @see #setDesign(TwoFactorDesign)
	 * @see experimentOntology.planning.PlanningPackage#getDualFactorPlan_Design()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TwoFactorDesign getDesign();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.DualFactorPlan#getDesign <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' containment reference.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(TwoFactorDesign value);

} // DualFactorPlan
