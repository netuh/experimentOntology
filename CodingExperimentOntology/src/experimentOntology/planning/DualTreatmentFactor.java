/**
 */
package experimentOntology.planning;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dual Treatment Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.DualTreatmentFactor#getTreatments <em>Treatments</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.PlanningPackage#getDualTreatmentFactor()
 * @model
 * @generated
 */
public interface DualTreatmentFactor extends Factor {
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
	 * @see experimentOntology.planning.PlanningPackage#getDualTreatmentFactor_Treatments()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Treatment> getTreatments();

} // DualTreatmentFactor
