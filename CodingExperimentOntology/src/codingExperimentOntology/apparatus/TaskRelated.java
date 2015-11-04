/**
 */
package codingExperimentOntology.apparatus;

import codingExperimentOntology.tasks.CodingTask;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Related</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.apparatus.TaskRelated#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.apparatus.NewPackage4Package#getTaskRelated()
 * @model abstract="true"
 * @generated
 */
public interface TaskRelated extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference list.
	 * The list contents are of type {@link codingExperimentOntology.tasks.CodingTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference list.
	 * @see codingExperimentOntology.apparatus.NewPackage4Package#getTaskRelated_Task()
	 * @model required="true"
	 * @generated
	 */
	EList<CodingTask> getTask();

} // TaskRelated
