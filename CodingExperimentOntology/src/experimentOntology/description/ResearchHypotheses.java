/**
 */
package experimentOntology.description;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Hypotheses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.ResearchHypotheses#getHypotheses <em>Hypotheses</em>}</li>
 * </ul>
 *
 * @see experimentOntology.description.DescriptionPackage#getResearchHypotheses()
 * @model
 * @generated
 */
public interface ResearchHypotheses extends EObject {
	/**
	 * Returns the value of the '<em><b>Hypotheses</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.description.SimpleHypothesis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypotheses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypotheses</em>' containment reference list.
	 * @see experimentOntology.description.DescriptionPackage#getResearchHypotheses_Hypotheses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SimpleHypothesis> getHypotheses();

} // ResearchHypotheses
