/**
 */
package codingExperimentOntology.variables;

import codingExperimentOntology.apparatus.CodingArtifact;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Independent Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.variables.ArtifactIndependentVariable#getCodingartifact <em>Codingartifact</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.variables.NewPackage1Package#getArtifactIndependentVariable()
 * @model
 * @generated
 */
public interface ArtifactIndependentVariable extends CodingIndependentVariable {
	/**
	 * Returns the value of the '<em><b>Codingartifact</b></em>' reference list.
	 * The list contents are of type {@link codingExperimentOntology.apparatus.CodingArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codingartifact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codingartifact</em>' reference list.
	 * @see codingExperimentOntology.variables.NewPackage1Package#getArtifactIndependentVariable_Codingartifact()
	 * @model required="true"
	 * @generated
	 */
	EList<CodingArtifact> getCodingartifact();

} // ArtifactIndependentVariable
