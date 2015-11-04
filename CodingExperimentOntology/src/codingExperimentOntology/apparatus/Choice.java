/**
 */
package codingExperimentOntology.apparatus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.apparatus.Choice#getChoices <em>Choices</em>}</li>
 *   <li>{@link codingExperimentOntology.apparatus.Choice#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.apparatus.NewPackage4Package#getChoice()
 * @model
 * @generated
 */
public interface Choice extends Question {
	/**
	 * Returns the value of the '<em><b>Choices</b></em>' containment reference list.
	 * The list contents are of type {@link codingExperimentOntology.apparatus.QuestionContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choices</em>' containment reference list.
	 * @see codingExperimentOntology.apparatus.NewPackage4Package#getChoice_Choices()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<QuestionContent> getChoices();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"unique"</code>.
	 * The literals are from the enumeration {@link codingExperimentOntology.apparatus.ChoiceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see codingExperimentOntology.apparatus.ChoiceTypes
	 * @see #setType(ChoiceTypes)
	 * @see codingExperimentOntology.apparatus.NewPackage4Package#getChoice_Type()
	 * @model default="unique"
	 * @generated
	 */
	ChoiceTypes getType();

	/**
	 * Sets the value of the '{@link codingExperimentOntology.apparatus.Choice#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see codingExperimentOntology.apparatus.ChoiceTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(ChoiceTypes value);

} // Choice
