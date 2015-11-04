/**
 */
package codingExperimentOntology.tasks;

import codingExperimentOntology.apparatus.CodingArtifact;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conventional Coding Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.tasks.ConventionalCodingTask#getTaskType <em>Task Type</em>}</li>
 *   <li>{@link codingExperimentOntology.tasks.ConventionalCodingTask#getRequiredArtifact <em>Required Artifact</em>}</li>
 *   <li>{@link codingExperimentOntology.tasks.ConventionalCodingTask#getProducedArtifact <em>Produced Artifact</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.tasks.NewPackage2Package#getConventionalCodingTask()
 * @model abstract="true"
 * @generated
 */
public interface ConventionalCodingTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Task Type</b></em>' attribute.
	 * The default value is <code>"writing"</code>.
	 * The literals are from the enumeration {@link codingExperimentOntology.tasks.CodingTaskTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Type</em>' attribute.
	 * @see codingExperimentOntology.tasks.CodingTaskTypes
	 * @see #setTaskType(CodingTaskTypes)
	 * @see codingExperimentOntology.tasks.NewPackage2Package#getConventionalCodingTask_TaskType()
	 * @model default="writing"
	 * @generated
	 */
	CodingTaskTypes getTaskType();

	/**
	 * Sets the value of the '{@link codingExperimentOntology.tasks.ConventionalCodingTask#getTaskType <em>Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Type</em>' attribute.
	 * @see codingExperimentOntology.tasks.CodingTaskTypes
	 * @see #getTaskType()
	 * @generated
	 */
	void setTaskType(CodingTaskTypes value);

	/**
	 * Returns the value of the '<em><b>Required Artifact</b></em>' reference list.
	 * The list contents are of type {@link codingExperimentOntology.apparatus.CodingArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Artifact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Artifact</em>' reference list.
	 * @see codingExperimentOntology.tasks.NewPackage2Package#getConventionalCodingTask_RequiredArtifact()
	 * @model
	 * @generated
	 */
	EList<CodingArtifact> getRequiredArtifact();

	/**
	 * Returns the value of the '<em><b>Produced Artifact</b></em>' reference list.
	 * The list contents are of type {@link codingExperimentOntology.apparatus.CodingArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced Artifact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced Artifact</em>' reference list.
	 * @see codingExperimentOntology.tasks.NewPackage2Package#getConventionalCodingTask_ProducedArtifact()
	 * @model
	 * @generated
	 */
	EList<CodingArtifact> getProducedArtifact();

} // ConventionalCodingTask
