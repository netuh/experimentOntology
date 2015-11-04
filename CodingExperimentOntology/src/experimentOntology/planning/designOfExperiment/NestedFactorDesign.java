/**
 */
package experimentOntology.planning.designOfExperiment;

import experimentOntology.planning.Factor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Factor Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.designOfExperiment.NestedFactorDesign#getStageOne <em>Stage One</em>}</li>
 *   <li>{@link experimentOntology.planning.designOfExperiment.NestedFactorDesign#getStageTwo <em>Stage Two</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#getNestedFactorDesign()
 * @model
 * @generated
 */
public interface NestedFactorDesign extends TwoFactorDesign {
	/**
	 * Returns the value of the '<em><b>Stage One</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage One</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage One</em>' reference.
	 * @see #setStageOne(Factor)
	 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#getNestedFactorDesign_StageOne()
	 * @model required="true"
	 * @generated
	 */
	Factor getStageOne();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.designOfExperiment.NestedFactorDesign#getStageOne <em>Stage One</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage One</em>' reference.
	 * @see #getStageOne()
	 * @generated
	 */
	void setStageOne(Factor value);

	/**
	 * Returns the value of the '<em><b>Stage Two</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage Two</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage Two</em>' reference.
	 * @see #setStageTwo(Factor)
	 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#getNestedFactorDesign_StageTwo()
	 * @model required="true"
	 * @generated
	 */
	Factor getStageTwo();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.designOfExperiment.NestedFactorDesign#getStageTwo <em>Stage Two</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage Two</em>' reference.
	 * @see #getStageTwo()
	 * @generated
	 */
	void setStageTwo(Factor value);

} // NestedFactorDesign
