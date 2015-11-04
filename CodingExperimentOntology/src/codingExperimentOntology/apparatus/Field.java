/**
 */
package codingExperimentOntology.apparatus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.apparatus.Field#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.apparatus.NewPackage4Package#getField()
 * @model
 * @generated
 */
public interface Field extends Question {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"text"</code>.
	 * The literals are from the enumeration {@link codingExperimentOntology.apparatus.FieldTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see codingExperimentOntology.apparatus.FieldTypes
	 * @see #setType(FieldTypes)
	 * @see codingExperimentOntology.apparatus.NewPackage4Package#getField_Type()
	 * @model default="text"
	 * @generated
	 */
	FieldTypes getType();

	/**
	 * Sets the value of the '{@link codingExperimentOntology.apparatus.Field#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see codingExperimentOntology.apparatus.FieldTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(FieldTypes value);

} // Field
