/**
 */
package experimentOntology;

import experimentOntology.description.Description;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experimental Study</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.ExperimentalStudy#getExperiments <em>Experiments</em>}</li>
 *   <li>{@link experimentOntology.ExperimentalStudy#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see experimentOntology.ExperimentOntologyPackage#getExperimentalStudy()
 * @model
 * @generated
 */
public interface ExperimentalStudy extends EObject {
	/**
	 * Returns the value of the '<em><b>Experiments</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.Experiment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experiments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiments</em>' containment reference list.
	 * @see experimentOntology.ExperimentOntologyPackage#getExperimentalStudy_Experiments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Experiment> getExperiments();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Description)
	 * @see experimentOntology.ExperimentOntologyPackage#getExperimentalStudy_Description()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link experimentOntology.ExperimentalStudy#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

} // ExperimentalStudy
