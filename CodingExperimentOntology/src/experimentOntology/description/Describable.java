/**
 */
package experimentOntology.description;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Describable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.Describable#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link experimentOntology.description.Describable#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link experimentOntology.description.Describable#getAuthorship <em>Authorship</em>}</li>
 * </ul>
 *
 * @see experimentOntology.description.DescriptionPackage#getDescribable()
 * @model abstract="true"
 * @generated
 */
public interface Describable extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference.
	 * @see #setAbstract(Abstract)
	 * @see experimentOntology.description.DescriptionPackage#getDescribable_Abstract()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Abstract getAbstract();

	/**
	 * Sets the value of the '{@link experimentOntology.description.Describable#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(Abstract value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywords</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' containment reference.
	 * @see #setKeywords(Keywords)
	 * @see experimentOntology.description.DescriptionPackage#getDescribable_Keywords()
	 * @model containment="true"
	 * @generated
	 */
	Keywords getKeywords();

	/**
	 * Sets the value of the '{@link experimentOntology.description.Describable#getKeywords <em>Keywords</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keywords</em>' containment reference.
	 * @see #getKeywords()
	 * @generated
	 */
	void setKeywords(Keywords value);

	/**
	 * Returns the value of the '<em><b>Authorship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorship</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorship</em>' containment reference.
	 * @see #setAuthorship(Authors)
	 * @see experimentOntology.description.DescriptionPackage#getDescribable_Authorship()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Authors getAuthorship();

	/**
	 * Sets the value of the '{@link experimentOntology.description.Describable#getAuthorship <em>Authorship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorship</em>' containment reference.
	 * @see #getAuthorship()
	 * @generated
	 */
	void setAuthorship(Authors value);

} // Describable
