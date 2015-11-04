/**
 */
package experimentOntology.operation.taskCompositionFramework;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Else If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.taskCompositionFramework.ElseIf#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkPackage#getElseIf()
 * @model
 * @generated
 */
public interface ElseIf extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference.
	 * @see #setTask(Task)
	 * @see experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkPackage#getElseIf_Task()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link experimentOntology.operation.taskCompositionFramework.ElseIf#getTask <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' containment reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

} // ElseIf
