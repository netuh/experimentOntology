/**
 */
package experimentOntology.description.gqm;

import experimentOntology.planning.DependentVariable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric GQM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.gqm.MetricGQM#getRelatedVariable <em>Related Variable</em>}</li>
 * </ul>
 *
 * @see experimentOntology.description.gqm.GqmPackage#getMetricGQM()
 * @model
 * @generated
 */
public interface MetricGQM extends EObject {
	/**
	 * Returns the value of the '<em><b>Related Variable</b></em>' reference list.
	 * The list contents are of type {@link experimentOntology.planning.DependentVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Variable</em>' reference list.
	 * @see experimentOntology.description.gqm.GqmPackage#getMetricGQM_RelatedVariable()
	 * @model required="true"
	 * @generated
	 */
	EList<DependentVariable> getRelatedVariable();

} // MetricGQM
