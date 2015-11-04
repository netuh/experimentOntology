/**
 */
package experimentOntology.planning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pieces Of Apparatus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.PiecesOfApparatus#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.PlanningPackage#getPiecesOfApparatus()
 * @model
 * @generated
 */
public interface PiecesOfApparatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.planning.Apparatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see experimentOntology.planning.PlanningPackage#getPiecesOfApparatus_Components()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Apparatus> getComponents();

} // PiecesOfApparatus
