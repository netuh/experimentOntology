/**
 */
package codingExperimentOntology.apparatus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Monitor Instrument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.apparatus.ResourceMonitorInstrument#getTarget <em>Target</em>}</li>
 *   <li>{@link codingExperimentOntology.apparatus.ResourceMonitorInstrument#isCreation <em>Creation</em>}</li>
 *   <li>{@link codingExperimentOntology.apparatus.ResourceMonitorInstrument#isModification <em>Modification</em>}</li>
 *   <li>{@link codingExperimentOntology.apparatus.ResourceMonitorInstrument#isDelete <em>Delete</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.apparatus.NewPackage4Package#getResourceMonitorInstrument()
 * @model
 * @generated
 */
public interface ResourceMonitorInstrument extends CodingInstrument {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link codingExperimentOntology.apparatus.CodingArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see codingExperimentOntology.apparatus.NewPackage4Package#getResourceMonitorInstrument_Target()
	 * @model required="true"
	 * @generated
	 */
	EList<CodingArtifact> getTarget();

	/**
	 * Returns the value of the '<em><b>Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation</em>' attribute.
	 * @see #setCreation(boolean)
	 * @see codingExperimentOntology.apparatus.NewPackage4Package#getResourceMonitorInstrument_Creation()
	 * @model
	 * @generated
	 */
	boolean isCreation();

	/**
	 * Sets the value of the '{@link codingExperimentOntology.apparatus.ResourceMonitorInstrument#isCreation <em>Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation</em>' attribute.
	 * @see #isCreation()
	 * @generated
	 */
	void setCreation(boolean value);

	/**
	 * Returns the value of the '<em><b>Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification</em>' attribute.
	 * @see #setModification(boolean)
	 * @see codingExperimentOntology.apparatus.NewPackage4Package#getResourceMonitorInstrument_Modification()
	 * @model
	 * @generated
	 */
	boolean isModification();

	/**
	 * Sets the value of the '{@link codingExperimentOntology.apparatus.ResourceMonitorInstrument#isModification <em>Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification</em>' attribute.
	 * @see #isModification()
	 * @generated
	 */
	void setModification(boolean value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' attribute.
	 * @see #setDelete(boolean)
	 * @see codingExperimentOntology.apparatus.NewPackage4Package#getResourceMonitorInstrument_Delete()
	 * @model
	 * @generated
	 */
	boolean isDelete();

	/**
	 * Sets the value of the '{@link codingExperimentOntology.apparatus.ResourceMonitorInstrument#isDelete <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' attribute.
	 * @see #isDelete()
	 * @generated
	 */
	void setDelete(boolean value);

} // ResourceMonitorInstrument
