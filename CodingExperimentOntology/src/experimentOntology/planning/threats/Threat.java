/**
 */
package experimentOntology.planning.threats;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.threats.Threat#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.threats.ThreatsPackage#getThreat()
 * @model abstract="true"
 * @generated
 */
public interface Threat extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.planning.threats.MitigationAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see experimentOntology.planning.threats.ThreatsPackage#getThreat_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<MitigationAction> getAction();

} // Threat
