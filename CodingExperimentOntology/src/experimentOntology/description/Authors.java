/**
 */
package experimentOntology.description;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.Authors#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see experimentOntology.description.DescriptionPackage#getAuthors()
 * @model
 * @generated
 */
public interface Authors extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link experimentOntology.description.Author}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see experimentOntology.description.DescriptionPackage#getAuthors_Author()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Author> getAuthor();

} // Authors
