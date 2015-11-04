/**
 */
package experimentOntology.planning.designOfExperiment;

import experimentOntology.planning.Factor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Square Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.designOfExperiment.SquareDesign#getColumn <em>Column</em>}</li>
 *   <li>{@link experimentOntology.planning.designOfExperiment.SquareDesign#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#getSquareDesign()
 * @model
 * @generated
 */
public interface SquareDesign extends TwoFactorDesign {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Factor)
	 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#getSquareDesign_Column()
	 * @model required="true"
	 * @generated
	 */
	Factor getColumn();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.designOfExperiment.SquareDesign#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Factor value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' reference.
	 * @see #setLine(Factor)
	 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#getSquareDesign_Line()
	 * @model required="true"
	 * @generated
	 */
	Factor getLine();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.designOfExperiment.SquareDesign#getLine <em>Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(Factor value);

} // SquareDesign
