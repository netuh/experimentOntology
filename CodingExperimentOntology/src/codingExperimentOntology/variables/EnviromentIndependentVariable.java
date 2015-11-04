/**
 */
package codingExperimentOntology.variables;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enviroment Independent Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.variables.EnviromentIndependentVariable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see codingExperimentOntology.variables.NewPackage1Package#getEnviromentIndependentVariable()
 * @model
 * @generated
 */
public interface EnviromentIndependentVariable extends CodingIndependentVariable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"tool"</code>.
	 * The literals are from the enumeration {@link codingExperimentOntology.variables.CommonVariableTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see codingExperimentOntology.variables.CommonVariableTypes
	 * @see #setType(CommonVariableTypes)
	 * @see codingExperimentOntology.variables.NewPackage1Package#getEnviromentIndependentVariable_Type()
	 * @model default="tool"
	 * @generated
	 */
	CommonVariableTypes getType();

	/**
	 * Sets the value of the '{@link codingExperimentOntology.variables.EnviromentIndependentVariable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see codingExperimentOntology.variables.CommonVariableTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(CommonVariableTypes value);

} // EnviromentIndependentVariable
