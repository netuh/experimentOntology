/**
 */
package codingExperimentOntology.variables;

import codingExperimentOntology.apparatus.Questionnaire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Awnser Based Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.variables.AwnserBasedVariable#getQuestionnaire <em>Questionnaire</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.variables.NewPackage1Package#getAwnserBasedVariable()
 * @model
 * @generated
 */
public interface AwnserBasedVariable extends TimeBoundVariable {
	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' reference list.
	 * The list contents are of type {@link codingExperimentOntology.apparatus.Questionnaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questionnaire</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionnaire</em>' reference list.
	 * @see codingExperimentOntology.variables.NewPackage1Package#getAwnserBasedVariable_Questionnaire()
	 * @model required="true"
	 * @generated
	 */
	EList<Questionnaire> getQuestionnaire();

} // AwnserBasedVariable
