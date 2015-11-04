/**
 */
package codingExperimentOntology.apparatus;

import experimentOntology.planning.Artifact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coding Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.apparatus.CodingArtifact#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.apparatus.NewPackage4Package#getCodingArtifact()
 * @model
 * @generated
 */
public interface CodingArtifact extends CodignApparatus, Artifact {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"sourceCode"</code>.
	 * The literals are from the enumeration {@link codingExperimentOntology.apparatus.CodingArtifactTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see codingExperimentOntology.apparatus.CodingArtifactTypes
	 * @see #setType(CodingArtifactTypes)
	 * @see codingExperimentOntology.apparatus.NewPackage4Package#getCodingArtifact_Type()
	 * @model default="sourceCode"
	 * @generated
	 */
	CodingArtifactTypes getType();

	/**
	 * Sets the value of the '{@link codingExperimentOntology.apparatus.CodingArtifact#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see codingExperimentOntology.apparatus.CodingArtifactTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(CodingArtifactTypes value);

} // CodingArtifact
