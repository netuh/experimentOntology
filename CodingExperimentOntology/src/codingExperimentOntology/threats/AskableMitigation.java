/**
 */
package codingExperimentOntology.threats;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Askable Mitigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.threats.AskableMitigation#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.threats.NewPackage3Package#getAskableMitigation()
 * @model abstract="true"
 * @generated
 */
public interface AskableMitigation extends GenericMitigable {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link codingExperimentOntology.threats.MitigatingByAsking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see codingExperimentOntology.threats.NewPackage3Package#getAskableMitigation_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MitigatingByAsking> getActions();

} // AskableMitigation
