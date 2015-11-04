/**
 */
package codingExperimentOntology.apparatus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Monitor By Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.apparatus.TimeMonitorByResource#getArtifact <em>Artifact</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.apparatus.NewPackage4Package#getTimeMonitorByResource()
 * @model
 * @generated
 */
public interface TimeMonitorByResource extends TimeMonitorInstrument {
	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' reference list.
	 * The list contents are of type {@link codingExperimentOntology.apparatus.CodingArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' reference list.
	 * @see codingExperimentOntology.apparatus.NewPackage4Package#getTimeMonitorByResource_Artifact()
	 * @model required="true"
	 * @generated
	 */
	EList<CodingArtifact> getArtifact();

} // TimeMonitorByResource
