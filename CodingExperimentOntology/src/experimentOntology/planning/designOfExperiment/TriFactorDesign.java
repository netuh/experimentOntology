/**
 */
package experimentOntology.planning.designOfExperiment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tri Factor Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.designOfExperiment.TriFactorDesign#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#getTriFactorDesign()
 * @model
 * @generated
 */
public interface TriFactorDesign extends DesignType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"TwoK"</code>.
	 * The literals are from the enumeration {@link experimentOntology.planning.designOfExperiment.TriFactorTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see experimentOntology.planning.designOfExperiment.TriFactorTypes
	 * @see #setType(TriFactorTypes)
	 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#getTriFactorDesign_Type()
	 * @model default="TwoK"
	 * @generated
	 */
	TriFactorTypes getType();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.designOfExperiment.TriFactorDesign#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see experimentOntology.planning.designOfExperiment.TriFactorTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(TriFactorTypes value);

} // TriFactorDesign
