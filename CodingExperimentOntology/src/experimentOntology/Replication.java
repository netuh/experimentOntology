/**
 */
package experimentOntology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.Replication#getOriginal <em>Original</em>}</li>
 * </ul>
 *
 * @see experimentOntology.ExperimentOntologyPackage#getReplication()
 * @model
 * @generated
 */
public interface Replication extends Experiment {
	/**
	 * Returns the value of the '<em><b>Original</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.Experiment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original</em>' containment reference list.
	 * @see experimentOntology.ExperimentOntologyPackage#getReplication_Original()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Experiment> getOriginal();

} // Replication
