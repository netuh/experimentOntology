/**
 */
package experimentOntology.description.gqm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal GQM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.gqm.GoalGQM#getRelatedQuestion <em>Related Question</em>}</li>
 * </ul>
 *
 * @see experimentOntology.description.gqm.GqmPackage#getGoalGQM()
 * @model
 * @generated
 */
public interface GoalGQM extends EObject {
	/**
	 * Returns the value of the '<em><b>Related Question</b></em>' reference list.
	 * The list contents are of type {@link experimentOntology.description.gqm.QuestionGQM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Question</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Question</em>' reference list.
	 * @see experimentOntology.description.gqm.GqmPackage#getGoalGQM_RelatedQuestion()
	 * @model required="true"
	 * @generated
	 */
	EList<QuestionGQM> getRelatedQuestion();

} // GoalGQM
