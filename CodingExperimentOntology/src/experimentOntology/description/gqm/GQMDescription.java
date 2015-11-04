/**
 */
package experimentOntology.description.gqm;

import experimentOntology.description.Describable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GQM Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.gqm.GQMDescription#getGoals <em>Goals</em>}</li>
 *   <li>{@link experimentOntology.description.gqm.GQMDescription#getQuestions <em>Questions</em>}</li>
 *   <li>{@link experimentOntology.description.gqm.GQMDescription#getMetrics <em>Metrics</em>}</li>
 * </ul>
 *
 * @see experimentOntology.description.gqm.GqmPackage#getGQMDescription()
 * @model
 * @generated
 */
public interface GQMDescription extends Describable {
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
	 * @see experimentOntology.description.gqm.GqmPackage#getGQMDescription_Goals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Goals getGoals();

	/**
	 * Sets the value of the '{@link experimentOntology.description.gqm.GQMDescription#getGoals <em>Goals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals</em>' containment reference.
	 * @see #getGoals()
	 * @generated
	 */
	void setGoals(Goals value);

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
	 * @see experimentOntology.description.gqm.GqmPackage#getGQMDescription_Questions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Questions getQuestions();

	/**
	 * Sets the value of the '{@link experimentOntology.description.gqm.GQMDescription#getQuestions <em>Questions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questions</em>' containment reference.
	 * @see #getQuestions()
	 * @generated
	 */
	void setQuestions(Questions value);

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' containment reference.
	 * @see #setMetrics(Metrics)
	 * @see experimentOntology.description.gqm.GqmPackage#getGQMDescription_Metrics()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Metrics getMetrics();

	/**
	 * Sets the value of the '{@link experimentOntology.description.gqm.GQMDescription#getMetrics <em>Metrics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metrics</em>' containment reference.
	 * @see #getMetrics()
	 * @generated
	 */
	void setMetrics(Metrics value);

} // GQMDescription
