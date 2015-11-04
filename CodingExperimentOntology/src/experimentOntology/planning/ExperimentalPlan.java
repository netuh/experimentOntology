/**
 */
package experimentOntology.planning;

import experimentOntology.planning.sampling.SamplingStrategy;

import experimentOntology.planning.threats.Threats;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experimental Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.ExperimentalPlan#getThreats <em>Threats</em>}</li>
 *   <li>{@link experimentOntology.planning.ExperimentalPlan#getSamplingstrategy <em>Samplingstrategy</em>}</li>
 *   <li>{@link experimentOntology.planning.ExperimentalPlan#getApparatus <em>Apparatus</em>}</li>
 *   <li>{@link experimentOntology.planning.ExperimentalPlan#getDependentVariables <em>Dependent Variables</em>}</li>
 *   <li>{@link experimentOntology.planning.ExperimentalPlan#getIndependentvariables <em>Independentvariables</em>}</li>
 * </ul>
 *
 * @see experimentOntology.planning.PlanningPackage#getExperimentalPlan()
 * @model abstract="true"
 * @generated
 */
public interface ExperimentalPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Threats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threats</em>' containment reference.
	 * @see #setThreats(Threats)
	 * @see experimentOntology.planning.PlanningPackage#getExperimentalPlan_Threats()
	 * @model containment="true"
	 * @generated
	 */
	Threats getThreats();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.ExperimentalPlan#getThreats <em>Threats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threats</em>' containment reference.
	 * @see #getThreats()
	 * @generated
	 */
	void setThreats(Threats value);

	/**
	 * Returns the value of the '<em><b>Samplingstrategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samplingstrategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samplingstrategy</em>' containment reference.
	 * @see #setSamplingstrategy(SamplingStrategy)
	 * @see experimentOntology.planning.PlanningPackage#getExperimentalPlan_Samplingstrategy()
	 * @model containment="true"
	 * @generated
	 */
	SamplingStrategy getSamplingstrategy();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.ExperimentalPlan#getSamplingstrategy <em>Samplingstrategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Samplingstrategy</em>' containment reference.
	 * @see #getSamplingstrategy()
	 * @generated
	 */
	void setSamplingstrategy(SamplingStrategy value);

	/**
	 * Returns the value of the '<em><b>Apparatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apparatus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apparatus</em>' containment reference.
	 * @see #setApparatus(PiecesOfApparatus)
	 * @see experimentOntology.planning.PlanningPackage#getExperimentalPlan_Apparatus()
	 * @model containment="true"
	 * @generated
	 */
	PiecesOfApparatus getApparatus();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.ExperimentalPlan#getApparatus <em>Apparatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apparatus</em>' containment reference.
	 * @see #getApparatus()
	 * @generated
	 */
	void setApparatus(PiecesOfApparatus value);

	/**
	 * Returns the value of the '<em><b>Dependent Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Variables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Variables</em>' containment reference.
	 * @see #setDependentVariables(DependentVariables)
	 * @see experimentOntology.planning.PlanningPackage#getExperimentalPlan_DependentVariables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DependentVariables getDependentVariables();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.ExperimentalPlan#getDependentVariables <em>Dependent Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Variables</em>' containment reference.
	 * @see #getDependentVariables()
	 * @generated
	 */
	void setDependentVariables(DependentVariables value);

	/**
	 * Returns the value of the '<em><b>Independentvariables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Independentvariables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Independentvariables</em>' containment reference.
	 * @see #setIndependentvariables(IndependentVariables)
	 * @see experimentOntology.planning.PlanningPackage#getExperimentalPlan_Independentvariables()
	 * @model containment="true"
	 * @generated
	 */
	IndependentVariables getIndependentvariables();

	/**
	 * Sets the value of the '{@link experimentOntology.planning.ExperimentalPlan#getIndependentvariables <em>Independentvariables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Independentvariables</em>' containment reference.
	 * @see #getIndependentvariables()
	 * @generated
	 */
	void setIndependentvariables(IndependentVariables value);

} // ExperimentalPlan
