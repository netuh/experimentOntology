/**
 */
package experimentOntology.planning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Independent Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.IndependentVariables#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.PlanningPackage#getIndependentVariables()
 * @model
 * @generated
 */
public interface IndependentVariables extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.planning.IndependentVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see experimentOntology.planning.PlanningPackage#getIndependentVariables_Variables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IndependentVariable> getVariables();

} // IndependentVariables
