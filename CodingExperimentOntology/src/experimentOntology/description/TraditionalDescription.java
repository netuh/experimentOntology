/**
 */
package experimentOntology.description;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traditional Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.TraditionalDescription#getQuestions <em>Questions</em>}</li>
 *   <li>{@link experimentOntology.description.TraditionalDescription#getHypothesis <em>Hypothesis</em>}</li>
 *   <li>{@link experimentOntology.description.TraditionalDescription#getGoals <em>Goals</em>}</li>
 * </ul>
 *
 * @see experimentOntology.description.DescriptionPackage#getTraditionalDescription()
 * @model
 * @generated
 */
public interface TraditionalDescription extends Describable {
	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference.
	 * @see #setQuestions(Questions)
	 * @see experimentOntology.description.DescriptionPackage#getTraditionalDescription_Questions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Questions getQuestions();

	/**
	 * Sets the value of the '{@link experimentOntology.description.TraditionalDescription#getQuestions <em>Questions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questions</em>' containment reference.
	 * @see #getQuestions()
	 * @generated
	 */
	void setQuestions(Questions value);

	/**
	 * Returns the value of the '<em><b>Hypothesis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypothesis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypothesis</em>' containment reference.
	 * @see #setHypothesis(ResearchHypotheses)
	 * @see experimentOntology.description.DescriptionPackage#getTraditionalDescription_Hypothesis()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResearchHypotheses getHypothesis();

	/**
	 * Sets the value of the '{@link experimentOntology.description.TraditionalDescription#getHypothesis <em>Hypothesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hypothesis</em>' containment reference.
	 * @see #getHypothesis()
	 * @generated
	 */
	void setHypothesis(ResearchHypotheses value);

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goals</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference.
	 * @see #setGoals(Goals)
	 * @see experimentOntology.description.DescriptionPackage#getTraditionalDescription_Goals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Goals getGoals();

	/**
	 * Sets the value of the '{@link experimentOntology.description.TraditionalDescription#getGoals <em>Goals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals</em>' containment reference.
	 * @see #getGoals()
	 * @generated
	 */
	void setGoals(Goals value);

} // TraditionalDescription
