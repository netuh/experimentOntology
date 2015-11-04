/**
 */
package experimentOntology.description;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keywords</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.Keywords#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see experimentOntology.description.DescriptionPackage#getKeywords()
 * @model
 * @generated
 */
public interface Keywords extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.description.Keyword}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see experimentOntology.description.DescriptionPackage#getKeywords_Content()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Keyword> getContent();

} // Keywords
