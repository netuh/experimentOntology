/**
 */
package experimentOntology.operation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Related Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.ContextRelatedTask#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see experimentOntology.operation.OperationPackage#getContextRelatedTask()
 * @model abstract="true"
 * @generated
 */
public interface ContextRelatedTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see experimentOntology.operation.OperationPackage#getContextRelatedTask_Context()
	 * @model containment="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link experimentOntology.operation.ContextRelatedTask#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

} // ContextRelatedTask
