/**
 */
package codingExperimentOntology.threats;

import codingExperimentOntology.apparatus.Question;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mitigating By Asking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.threats.MitigatingByAsking#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.threats.NewPackage3Package#getMitigatingByAsking()
 * @model
 * @generated
 */
public interface MitigatingByAsking extends EObject {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' reference list.
	 * The list contents are of type {@link codingExperimentOntology.apparatus.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' reference list.
	 * @see codingExperimentOntology.threats.NewPackage3Package#getMitigatingByAsking_Question()
	 * @model required="true"
	 * @generated
	 */
	EList<Question> getQuestion();

} // MitigatingByAsking
