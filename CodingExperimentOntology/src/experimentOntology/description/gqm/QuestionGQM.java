/**
 */
package experimentOntology.description.gqm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question GQM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.gqm.QuestionGQM#getRelatedMetric <em>Related Metric</em>}</li>
 * </ul>
 *
 * @see experimentOntology.description.gqm.GqmPackage#getQuestionGQM()
 * @model
 * @generated
 */
public interface QuestionGQM extends EObject {
	/**
	 * Returns the value of the '<em><b>Related Metric</b></em>' reference list.
	 * The list contents are of type {@link experimentOntology.description.gqm.MetricGQM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Metric</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Metric</em>' reference list.
	 * @see experimentOntology.description.gqm.GqmPackage#getQuestionGQM_RelatedMetric()
	 * @model required="true"
	 * @generated
	 */
	EList<MetricGQM> getRelatedMetric();

} // QuestionGQM
