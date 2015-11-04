/**
 */
package experimentOntology.description.gqm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metrics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.gqm.Metrics#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see experimentOntology.description.gqm.GqmPackage#getMetrics()
 * @model
 * @generated
 */
public interface Metrics extends EObject {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.description.gqm.MetricGQM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' containment reference list.
	 * @see experimentOntology.description.gqm.GqmPackage#getMetrics_Metric()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MetricGQM> getMetric();

} // Metrics
