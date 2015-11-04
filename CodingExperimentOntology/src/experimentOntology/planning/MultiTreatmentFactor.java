/**
 */
package experimentOntology.planning;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Treatment Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.MultiTreatmentFactor#getTreatments <em>Treatments</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.PlanningPackage#getMultiTreatmentFactor()
 * @model
 * @generated
 */
public interface MultiTreatmentFactor extends Factor {
	/**
	 * Returns the value of the '<em><b>Treatments</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.planning.Treatment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treatments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treatments</em>' containment reference list.
	 * @see experimentOntology.planning.PlanningPackage#getMultiTreatmentFactor_Treatments()
	 * @model containment="true" lower="3"
	 * @generated
	 */
	EList<Treatment> getTreatments();

} // MultiTreatmentFactor
