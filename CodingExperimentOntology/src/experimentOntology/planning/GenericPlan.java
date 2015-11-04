/**
 */
package experimentOntology.planning;

import experimentOntology.planning.designOfExperiment.GenericDesign;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.GenericPlan#getFactors <em>Factors</em>}</li>
 *   <li>{@link experimentOntology.planning.GenericPlan#getDesign <em>Design</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.PlanningPackage#getGenericPlan()
 * @model
 * @generated
 */
public interface GenericPlan extends ExperimentalPlan {
	/**
	 * Returns the value of the '<em><b>Factors</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.planning.Factor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factors</em>' containment reference list.
	 * @see experimentOntology.planning.PlanningPackage#getGenericPlan_Factors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Factor> getFactors();

	/**
	 * Returns the value of the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' containment reference.
	 * @see #setDesign(GenericDesign)
	 * @see experimentOntology.planning.PlanningPackage#getGenericPlan_Design()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GenericDesign getDesign();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.GenericPlan#getDesign <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' containment reference.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(GenericDesign value);

} // GenericPlan
