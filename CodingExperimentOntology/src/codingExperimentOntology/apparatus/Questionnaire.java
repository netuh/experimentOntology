/**
 */
package codingExperimentOntology.apparatus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.apparatus.Questionnaire#getQuestions <em>Questions</em>}</li>
 *   <li>{@link codingExperimentOntology.apparatus.Questionnaire#getAllocation <em>Allocation</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.apparatus.NewPackage4Package#getQuestionnaire()
 * @model abstract="true"
 * @generated
 */
public interface Questionnaire extends CodingInstrument {
	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link codingExperimentOntology.apparatus.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see codingExperimentOntology.apparatus.NewPackage4Package#getQuestionnaire_Questions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Question> getQuestions();

	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' attribute.
	 * The default value is <code>"before"</code>.
	 * The literals are from the enumeration {@link codingExperimentOntology.apparatus.QuestionnarieAllocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation</em>' attribute.
	 * @see codingExperimentOntology.apparatus.QuestionnarieAllocation
	 * @see #setAllocation(QuestionnarieAllocation)
	 * @see codingExperimentOntology.apparatus.NewPackage4Package#getQuestionnaire_Allocation()
	 * @model default="before"
	 * @generated
	 */
	QuestionnarieAllocation getAllocation();

	/**
	 * Sets the value of the '{@link codingExperimentOntology.apparatus.Questionnaire#getAllocation <em>Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation</em>' attribute.
	 * @see codingExperimentOntology.apparatus.QuestionnarieAllocation
	 * @see #getAllocation()
	 * @generated
	 */
	void setAllocation(QuestionnarieAllocation value);

} // Questionnaire
