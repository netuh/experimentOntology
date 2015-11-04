/**
 */
package codingExperimentOntology.threats;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Mitigable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.threats.GenericMitigable#getGeneralActions <em>General Actions</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.threats.NewPackage3Package#getGenericMitigable()
 * @model abstract="true"
 * @generated
 */
public interface GenericMitigable extends EObject {
	/**
	 * Returns the value of the '<em><b>General Actions</b></em>' containment reference list.
	 * The list contents are of type {@link codingExperimentOntology.threats.GenericMitigation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Actions</em>' containment reference list.
	 * @see codingExperimentOntology.threats.NewPackage3Package#getGenericMitigable_GeneralActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericMitigation> getGeneralActions();

} // GenericMitigable
