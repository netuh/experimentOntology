/**
 */
package codingExperimentOntology.apparatus;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.apparatus.Question#getEnunciation <em>Enunciation</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.apparatus.NewPackage4Package#getQuestion()
 * @model abstract="true"
 * @generated
 */
public interface Question extends EObject {
	/**
	 * Returns the value of the '<em><b>Enunciation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enunciation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enunciation</em>' containment reference.
	 * @see #setEnunciation(QuestionContent)
	 * @see codingExperimentOntology.apparatus.NewPackage4Package#getQuestion_Enunciation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QuestionContent getEnunciation();

	/**
	 * Sets the value of the '{@link codingExperimentOntology.apparatus.Question#getEnunciation <em>Enunciation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enunciation</em>' containment reference.
	 * @see #getEnunciation()
	 * @generated
	 */
	void setEnunciation(QuestionContent value);

} // Question
