/**
 */
package experimentOntology.description;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.Goals#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @see experimentOntology.description.DescriptionPackage#getGoals()
 * @model
 * @generated
 */
public interface Goals extends EObject {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.description.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference list.
	 * @see experimentOntology.description.DescriptionPackage#getGoals_Goal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Goal> getGoal();

} // Goals
