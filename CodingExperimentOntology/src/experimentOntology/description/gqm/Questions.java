/**
 */
package experimentOntology.description.gqm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.gqm.Questions#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @see experimentOntology.description.gqm.GqmPackage#getQuestions()
 * @model
 * @generated
 */
public interface Questions extends EObject {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.description.gqm.QuestionGQM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference list.
	 * @see experimentOntology.description.gqm.GqmPackage#getQuestions_Question()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<QuestionGQM> getQuestion();

} // Questions
