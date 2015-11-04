/**
 */
package experimentOntology.planning.threats;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.threats.Threats#getThreat <em>Threat</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.threats.ThreatsPackage#getThreats()
 * @model
 * @generated
 */
public interface Threats extends EObject {
	/**
	 * Returns the value of the '<em><b>Threat</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.planning.threats.Threat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threat</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat</em>' containment reference list.
	 * @see experimentOntology.planning.threats.ThreatsPackage#getThreats_Threat()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threat> getThreat();

} // Threats
