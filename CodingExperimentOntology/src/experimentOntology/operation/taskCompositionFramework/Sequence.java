/**
 */
package experimentOntology.operation.taskCompositionFramework;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.taskCompositionFramework.Sequence#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends Task {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.operation.taskCompositionFramework.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkPackage#getSequence_Task()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTask();

} // Sequence
