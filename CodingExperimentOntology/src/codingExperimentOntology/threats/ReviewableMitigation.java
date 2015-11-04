/**
 */
package codingExperimentOntology.threats;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reviewable Mitigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.threats.ReviewableMitigation#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.threats.NewPackage3Package#getReviewableMitigation()
 * @model abstract="true"
 * @generated
 */
public interface ReviewableMitigation extends GenericMitigable {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link codingExperimentOntology.threats.MitigatingByReviewing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see codingExperimentOntology.threats.NewPackage3Package#getReviewableMitigation_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MitigatingByReviewing> getActions();

} // ReviewableMitigation
